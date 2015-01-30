Webix-API library
==================
Webix-API library provides rich API and ready to use bindings to connect server-side logic with Webix UI library (client-side).

[from: http://webix.com/]

> Webix is a cross-browser, cross-device JavaScript framework for building interactive web applications using JavaScript, CSS, HTML5 techniques.

For complete Webix documentation check http://webix.com/.
All specifications are subject to change without notice.
Webix is registered trademark of the XB Software Ltd.

Build instructions
==================

* Compilation:
  `mvn clean install`

* Code generation mode (separate ANT script used, see generate_api.md for the details):
  `mvn -P generate-api clean install`
  <br />or:
  `mvn -Dgenerate_api=true clean install`
