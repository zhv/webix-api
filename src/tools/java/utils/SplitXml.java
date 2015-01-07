package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Deque;
import java.util.LinkedList;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.EventReaderDelegate;

public class SplitXml {
	public static class XMLElementFilter extends EventReaderDelegate {
		private Deque<QName> elementQueue = new LinkedList<QName>();
		private boolean firstElement = true;

		@Override
		public Object next() {
			return prepareEvent((XMLEvent) getParent().next());
		}

		@Override
		public XMLEvent nextEvent() throws XMLStreamException {
			return prepareEvent(getParent().nextEvent());
		}

		@Override
		public boolean hasNext() {
			return (firstElement || !elementQueue.isEmpty()) && getParent().hasNext();
		}

		private XMLEvent prepareEvent(XMLEvent e) {
			if (e.isStartElement()) {
				elementQueue.add(e.asStartElement().getName());
				firstElement = false;
			} else if (e.isEndElement()) {
				if (elementQueue.isEmpty()) {
					throw new IllegalStateException("Stack is empty");
				}
				QName documentElement = e.asEndElement().getName();
				QName stackElement = elementQueue.pollLast();
				if (!stackElement.equals(documentElement)) {
					throw new IllegalStateException("Stack contains different element");
				}
			}
			return e;
		}
	}

	public static void main(String[] args) throws XMLStreamException, IOException {
		if (args.length < 2) {
			System.out
					.println("Usage: SplitXml <output directory> <input xml file> [input xml file [input xml file [...]]]");
			return;
		}

		File basedir = new File(args[0]);
		SplitXml p = new SplitXml();

		XMLInputFactory inputFactory = XMLInputFactory.newFactory();
		XMLEventFactory eventFactory = XMLEventFactory.newFactory();
		XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();

		for (int i = 1, c = args.length; i < c; i++) {
			File xmlfile = new File(args[i]);
			InputStream in = null;
			try {
				System.out.println("Split file: " + args[i]);
				in = new BufferedInputStream(new FileInputStream(xmlfile));
				p.split(inputFactory, eventFactory, outputFactory, in, basedir);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (in != null) {
					in.close();
				}
			}
		}
	}

	public void split(InputStream in, File basedir) throws XMLStreamException, IOException {
		XMLInputFactory inputFactory = XMLInputFactory.newFactory();
		XMLEventFactory eventFactory = XMLEventFactory.newFactory();
		XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
		split(inputFactory, eventFactory, outputFactory, in, basedir);
	}

	public void split(XMLInputFactory inputFactory, XMLEventFactory eventFactory, XMLOutputFactory outputFactory,
			InputStream in, File basedir) throws XMLStreamException, IOException {
		XMLEventReader reader = inputFactory.createXMLEventReader(in);
		parseInputXml(outputFactory, eventFactory, reader, basedir);
	}

	private void parseInputXml(XMLOutputFactory outputFactory, XMLEventFactory eventFactory, XMLEventReader reader,
			File basedir) throws XMLStreamException, IOException {
		Deque<QName> elementQueue = new LinkedList<QName>();
		XMLEvent documentStartEvent = null;
		while (reader.hasNext()) {
			XMLEvent e = reader.nextEvent();
			if (e == null) {
				break;
			} else if (e.isStartDocument()) {
				documentStartEvent = e;
			} else if (e.isStartElement()) {
				StartElement es = e.asStartElement();
				elementQueue.add(es.getName());
				if (checkFileElement(elementQueue)) {
					// skip next non-element nodes
					XMLEvent nextElement = null;
					while (reader.hasNext()) {
						nextElement = reader.peek();
						if (nextElement != null && (nextElement.isStartElement() || nextElement.isEndElement())) {
							break;
						}
						reader.nextEvent();
					}
					if (nextElement != null && nextElement.isStartElement()) {
						File outfile = getOutFile(es, basedir);
						System.out.println("Processing file: " + outfile);
						writeFile(reader, outputFactory, eventFactory, outfile,
								!checkOmitXmlDeclaration(es) ? documentStartEvent : null);
					}
				}
			} else if (e.isEndElement()) {
				if (elementQueue.isEmpty()) {
					throw new IllegalStateException("Stack is empty");
				}
				QName documentElement = e.asEndElement().getName();
				QName stackElement = elementQueue.pollLast();
				if (!stackElement.equals(documentElement)) {
					throw new IllegalStateException("Stack contains different element");
				}
			}
		}
	}

	private void writeFile(XMLEventReader reader, XMLOutputFactory outf, XMLEventFactory eventFactory, File outfile,
			XMLEvent documentStartEvent) {
		OutputStream out = null;
		XMLEventWriter eventWriter = null;

		XMLElementFilter filteredReader = new XMLElementFilter();
		filteredReader.setParent(reader);
		try {
			out = new BufferedOutputStream(new FileOutputStream(outfile));
			eventWriter = outf.createXMLEventWriter(out);
			if (documentStartEvent != null) {
				eventWriter.add(documentStartEvent);
				eventWriter.add(eventFactory.createCharacters("\n"));
			}
			eventWriter.add(filteredReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} finally {
			if (eventWriter != null) {
				try {
					eventWriter.close();
				} catch (XMLStreamException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private File getOutFile(StartElement es, File basedir) {
		Attribute a = es.getAttributeByName(new QName("location"));
		File f = new File(basedir, a.getValue());
		f.getParentFile().mkdirs();
		return f;
	}

	private boolean checkFileElement(Deque<QName> elementQueue) {
		return elementQueue.size() == 2 && "file".equals(elementQueue.peekLast().getLocalPart());
	}

	private boolean checkOmitXmlDeclaration(StartElement file) {
		Attribute a = file.getAttributeByName(new QName("omit-xml-declaration"));
		return file != null && a != null && "yes".equals(a.getValue());
	}
}
