// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.7,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.form;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.webix.ui.model.auxiliary.Calendar;
import com.webix.ui.model.auxiliary.Colorboard;
import com.webix.ui.model.auxiliary.Pager;
import com.webix.ui.model.auxiliary.Resizer;
import com.webix.ui.model.auxiliary.Spacer;
import com.webix.ui.model.auxiliary.Tooltip;
import com.webix.ui.model.auxiliary.Video;
import com.webix.ui.model.context.Context;
import com.webix.ui.model.context.Contextmenu;
import com.webix.ui.model.context.Datasuggest;
import com.webix.ui.model.context.Gridsuggest;
import com.webix.ui.model.context.Menu;
import com.webix.ui.model.context.Popup;
import com.webix.ui.model.context.Submenu;
import com.webix.ui.model.context.Suggest;
import com.webix.ui.model.context.Window;
import com.webix.ui.model.data.Chart;
import com.webix.ui.model.data.Datatable;
import com.webix.ui.model.data.Dataview;
import com.webix.ui.model.data.Grouplist;
import com.webix.ui.model.data.List;
import com.webix.ui.model.data.Property;
import com.webix.ui.model.data.Tree;
import com.webix.ui.model.data.Treetable;
import com.webix.ui.model.data.Unitlist;
import com.webix.ui.model.html.Htmlform;
import com.webix.ui.model.html.Iframe;
import com.webix.ui.model.html.Scrollview;
import com.webix.ui.model.html.Template;
import com.webix.ui.model.layouts.Accordion;
import com.webix.ui.model.layouts.Accordionitem;
import com.webix.ui.model.layouts.Carousel;
import com.webix.ui.model.layouts.Form;
import com.webix.ui.model.layouts.Headerlayout;
import com.webix.ui.model.layouts.Layout;
import com.webix.ui.model.layouts.Multiview;
import com.webix.ui.model.layouts.Tabview;
import com.webix.ui.model.layouts.Toolbar;

/**
 * Horizontal slider for choosing numeric values from a range of
 * predefined ones.The control allows changing numeric data by
 * dragging a marker over a line, with a defined step (optionally).
 * Check slider documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Slider
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alignment of the control within the parent container.
     */
    private Byte align;

    /**
     * Defines or disables view change animation.
     */
    private Byte animate;

    /**
     * Sets an hash of HTML input attributes that will be parsed
     * for the Webix input control.
     */
    private Byte attributes;

    /**
     * Used to hide the component borders.
     */
    private Byte borderless;

    /**
     * Click action handler.
     */
    private Byte click;

    /**
     * An html container (or its id) where the component needs
     * initializing.
     */
    private Byte container;

    /**
     * The id or node, whose content will be moved to the view.
     */
    private Byte content;

    /**
     * The name of a css class that will be applied to the view
     * container.
     */
    private Byte css;

    /**
     * Disables item.
     */
    private Byte disabled;

    /**
     * Sets the view gravity (1 by default).
     */
    private Byte gravity;

    /**
     * Sets the height of the component.
     */
    private Byte height;

    /**
     * Defines whether the view will be hidden initially.
     */
    private Byte hidden;

    /**
     * Sets a hotkey that triggers button clicking.
     */
    private Byte hotkey;

    /**
     * The component ID.
     */
    private Byte id;

    /**
     * The height of the input area, or a button's text value area.
     */
    private Byte inputHeight;

    /**
     * Padding of text in the input.
     */
    private Byte inputPadding;

    /**
     * The width of the input area, or a button's text value area.
     */
    private Byte inputWidth;

    /**
     * The text label of the control.
     */
    private Byte label;

    /**
     * Positions label above the control.
     */
    private Byte labelPosition;

    /**
     * The width of the label.
     */
    private Byte labelWidth;

    /**
     * Max value of slider.
     */
    private Byte max;

    /**
     * Sets the maximum height for the view.
     */
    private Byte maxHeight;

    /**
     * Sets the maximum width for the view.
     */
    private Byte maxWidth;

    /**
     * Min value of slider.
     */
    private Byte min;

    /**
     * Sets the minimal height for the view.
     */
    private Byte minHeight;

    /**
     * Sets the minimal width for the view.
     */
    private Byte minWidth;

    /**
     * Name of the control.
     */
    private Byte name;

    /**
     * Allows attaching custom handlers to inner events of the
     * component.
     */
    private Byte on;

    /**
     * Placeholder text for the input.
     */
    private Byte placeholder;

    /**
     * Allows to attach pop-up menu to the button.
     */
    private Byte popup;

    /**
     * Configures readonly mode for the input.
     */
    private Byte readonly;

    /**
     * Action to call when value of cell changes.
     */
    private Byte relatedAction;

    /**
     * Id of view, that will be affected by relatedAction operation.
     */
    private Byte relatedView;

    /**
     * Marks field as required.
     */
    private Byte required;

    /**
     * Step of slider.
     */
    private Byte step;

    /**
     * Links suggest list to the input.
     */
    private Byte suggest;

    /**
     * Defines whether the control will be included in the tab
     * navigation order.
     */
    private Byte tabFocus;

    /**
     * The component template.
     */
    private Byte template;

    /**
     * Text over slider bar.
     */
    private Byte title;

    /**
     * Tooltip for the input.
     */
    private Byte tooltip;

    /**
     * The type of the control.
     */
    private Byte type;

    /**
     * Adds validation to the field.
     */
    private Byte validate;

    /**
     * On which event validation fires.
     */
    private Byte validateEvent;

    /**
     * Sets the initial value for a control.
     */
    private Byte value;

    /**
     * Sets the width of the component.
     */
    private Byte width;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the alignment of the control within the parent
     * container.
     * 
     * @return Byte
     */
    public Byte getAlign()
    {
        return this.align;
    } //-- Byte getAlign()

    /**
     * Get defines or disables view change animation.
     * 
     * @return Byte
     */
    public Byte getAnimate()
    {
        return this.animate;
    } //-- Byte getAnimate()

    /**
     * Get sets an hash of HTML input attributes that will be
     * parsed for the Webix input control.
     * 
     * @return Byte
     */
    public Byte getAttributes()
    {
        return this.attributes;
    } //-- Byte getAttributes()

    /**
     * Get used to hide the component borders.
     * 
     * @return Byte
     */
    public Byte getBorderless()
    {
        return this.borderless;
    } //-- Byte getBorderless()

    /**
     * Get click action handler.
     * 
     * @return Byte
     */
    public Byte getClick()
    {
        return this.click;
    } //-- Byte getClick()

    /**
     * Get an html container (or its id) where the component needs
     * initializing.
     * 
     * @return Byte
     */
    public Byte getContainer()
    {
        return this.container;
    } //-- Byte getContainer()

    /**
     * Get the id or node, whose content will be moved to the view.
     * 
     * @return Byte
     */
    public Byte getContent()
    {
        return this.content;
    } //-- Byte getContent()

    /**
     * Get the name of a css class that will be applied to the view
     * container.
     * 
     * @return Byte
     */
    public Byte getCss()
    {
        return this.css;
    } //-- Byte getCss()

    /**
     * Get disables item.
     * 
     * @return Byte
     */
    public Byte getDisabled()
    {
        return this.disabled;
    } //-- Byte getDisabled()

    /**
     * Get sets the view gravity (1 by default).
     * 
     * @return Byte
     */
    public Byte getGravity()
    {
        return this.gravity;
    } //-- Byte getGravity()

    /**
     * Get sets the height of the component.
     * 
     * @return Byte
     */
    public Byte getHeight()
    {
        return this.height;
    } //-- Byte getHeight()

    /**
     * Get defines whether the view will be hidden initially.
     * 
     * @return Byte
     */
    public Byte getHidden()
    {
        return this.hidden;
    } //-- Byte getHidden()

    /**
     * Get sets a hotkey that triggers button clicking.
     * 
     * @return Byte
     */
    public Byte getHotkey()
    {
        return this.hotkey;
    } //-- Byte getHotkey()

    /**
     * Get the component ID.
     * 
     * @return Byte
     */
    public Byte getId()
    {
        return this.id;
    } //-- Byte getId()

    /**
     * Get the height of the input area, or a button's text value
     * area.
     * 
     * @return Byte
     */
    public Byte getInputHeight()
    {
        return this.inputHeight;
    } //-- Byte getInputHeight()

    /**
     * Get padding of text in the input.
     * 
     * @return Byte
     */
    public Byte getInputPadding()
    {
        return this.inputPadding;
    } //-- Byte getInputPadding()

    /**
     * Get the width of the input area, or a button's text value
     * area.
     * 
     * @return Byte
     */
    public Byte getInputWidth()
    {
        return this.inputWidth;
    } //-- Byte getInputWidth()

    /**
     * Get the text label of the control.
     * 
     * @return Byte
     */
    public Byte getLabel()
    {
        return this.label;
    } //-- Byte getLabel()

    /**
     * Get positions label above the control.
     * 
     * @return Byte
     */
    public Byte getLabelPosition()
    {
        return this.labelPosition;
    } //-- Byte getLabelPosition()

    /**
     * Get the width of the label.
     * 
     * @return Byte
     */
    public Byte getLabelWidth()
    {
        return this.labelWidth;
    } //-- Byte getLabelWidth()

    /**
     * Get max value of slider.
     * 
     * @return Byte
     */
    public Byte getMax()
    {
        return this.max;
    } //-- Byte getMax()

    /**
     * Get sets the maximum height for the view.
     * 
     * @return Byte
     */
    public Byte getMaxHeight()
    {
        return this.maxHeight;
    } //-- Byte getMaxHeight()

    /**
     * Get sets the maximum width for the view.
     * 
     * @return Byte
     */
    public Byte getMaxWidth()
    {
        return this.maxWidth;
    } //-- Byte getMaxWidth()

    /**
     * Get min value of slider.
     * 
     * @return Byte
     */
    public Byte getMin()
    {
        return this.min;
    } //-- Byte getMin()

    /**
     * Get sets the minimal height for the view.
     * 
     * @return Byte
     */
    public Byte getMinHeight()
    {
        return this.minHeight;
    } //-- Byte getMinHeight()

    /**
     * Get sets the minimal width for the view.
     * 
     * @return Byte
     */
    public Byte getMinWidth()
    {
        return this.minWidth;
    } //-- Byte getMinWidth()

    /**
     * Get name of the control.
     * 
     * @return Byte
     */
    public Byte getName()
    {
        return this.name;
    } //-- Byte getName()

    /**
     * Get allows attaching custom handlers to inner events of the
     * component.
     * 
     * @return Byte
     */
    public Byte getOn()
    {
        return this.on;
    } //-- Byte getOn()

    /**
     * Get placeholder text for the input.
     * 
     * @return Byte
     */
    public Byte getPlaceholder()
    {
        return this.placeholder;
    } //-- Byte getPlaceholder()

    /**
     * Get allows to attach pop-up menu to the button.
     * 
     * @return Byte
     */
    public Byte getPopup()
    {
        return this.popup;
    } //-- Byte getPopup()

    /**
     * Get configures readonly mode for the input.
     * 
     * @return Byte
     */
    public Byte getReadonly()
    {
        return this.readonly;
    } //-- Byte getReadonly()

    /**
     * Get action to call when value of cell changes.
     * 
     * @return Byte
     */
    public Byte getRelatedAction()
    {
        return this.relatedAction;
    } //-- Byte getRelatedAction()

    /**
     * Get id of view, that will be affected by relatedAction
     * operation.
     * 
     * @return Byte
     */
    public Byte getRelatedView()
    {
        return this.relatedView;
    } //-- Byte getRelatedView()

    /**
     * Get marks field as required.
     * 
     * @return Byte
     */
    public Byte getRequired()
    {
        return this.required;
    } //-- Byte getRequired()

    /**
     * Get step of slider.
     * 
     * @return Byte
     */
    public Byte getStep()
    {
        return this.step;
    } //-- Byte getStep()

    /**
     * Get links suggest list to the input.
     * 
     * @return Byte
     */
    public Byte getSuggest()
    {
        return this.suggest;
    } //-- Byte getSuggest()

    /**
     * Get defines whether the control will be included in the tab
     * navigation order.
     * 
     * @return Byte
     */
    public Byte getTabFocus()
    {
        return this.tabFocus;
    } //-- Byte getTabFocus()

    /**
     * Get the component template.
     * 
     * @return Byte
     */
    public Byte getTemplate()
    {
        return this.template;
    } //-- Byte getTemplate()

    /**
     * Get text over slider bar.
     * 
     * @return Byte
     */
    public Byte getTitle()
    {
        return this.title;
    } //-- Byte getTitle()

    /**
     * Get tooltip for the input.
     * 
     * @return Byte
     */
    public Byte getTooltip()
    {
        return this.tooltip;
    } //-- Byte getTooltip()

    /**
     * Get the type of the control.
     * 
     * @return Byte
     */
    public Byte getType()
    {
        return this.type;
    } //-- Byte getType()

    /**
     * Get adds validation to the field.
     * 
     * @return Byte
     */
    public Byte getValidate()
    {
        return this.validate;
    } //-- Byte getValidate()

    /**
     * Get on which event validation fires.
     * 
     * @return Byte
     */
    public Byte getValidateEvent()
    {
        return this.validateEvent;
    } //-- Byte getValidateEvent()

    /**
     * Get sets the initial value for a control.
     * 
     * @return Byte
     */
    public Byte getValue()
    {
        return this.value;
    } //-- Byte getValue()

    /**
     * Get sets the width of the component.
     * 
     * @return Byte
     */
    public Byte getWidth()
    {
        return this.width;
    } //-- Byte getWidth()

    /**
     * Set the alignment of the control within the parent
     * container.
     * 
     * @param align
     */
    public void setAlign( Byte align )
    {
        this.align = align;
    } //-- void setAlign( Byte )

    /**
     * Set defines or disables view change animation.
     * 
     * @param animate
     */
    public void setAnimate( Byte animate )
    {
        this.animate = animate;
    } //-- void setAnimate( Byte )

    /**
     * Set sets an hash of HTML input attributes that will be
     * parsed for the Webix input control.
     * 
     * @param attributes
     */
    public void setAttributes( Byte attributes )
    {
        this.attributes = attributes;
    } //-- void setAttributes( Byte )

    /**
     * Set used to hide the component borders.
     * 
     * @param borderless
     */
    public void setBorderless( Byte borderless )
    {
        this.borderless = borderless;
    } //-- void setBorderless( Byte )

    /**
     * Set click action handler.
     * 
     * @param click
     */
    public void setClick( Byte click )
    {
        this.click = click;
    } //-- void setClick( Byte )

    /**
     * Set an html container (or its id) where the component needs
     * initializing.
     * 
     * @param container
     */
    public void setContainer( Byte container )
    {
        this.container = container;
    } //-- void setContainer( Byte )

    /**
     * Set the id or node, whose content will be moved to the view.
     * 
     * @param content
     */
    public void setContent( Byte content )
    {
        this.content = content;
    } //-- void setContent( Byte )

    /**
     * Set the name of a css class that will be applied to the view
     * container.
     * 
     * @param css
     */
    public void setCss( Byte css )
    {
        this.css = css;
    } //-- void setCss( Byte )

    /**
     * Set disables item.
     * 
     * @param disabled
     */
    public void setDisabled( Byte disabled )
    {
        this.disabled = disabled;
    } //-- void setDisabled( Byte )

    /**
     * Set sets the view gravity (1 by default).
     * 
     * @param gravity
     */
    public void setGravity( Byte gravity )
    {
        this.gravity = gravity;
    } //-- void setGravity( Byte )

    /**
     * Set sets the height of the component.
     * 
     * @param height
     */
    public void setHeight( Byte height )
    {
        this.height = height;
    } //-- void setHeight( Byte )

    /**
     * Set defines whether the view will be hidden initially.
     * 
     * @param hidden
     */
    public void setHidden( Byte hidden )
    {
        this.hidden = hidden;
    } //-- void setHidden( Byte )

    /**
     * Set sets a hotkey that triggers button clicking.
     * 
     * @param hotkey
     */
    public void setHotkey( Byte hotkey )
    {
        this.hotkey = hotkey;
    } //-- void setHotkey( Byte )

    /**
     * Set the component ID.
     * 
     * @param id
     */
    public void setId( Byte id )
    {
        this.id = id;
    } //-- void setId( Byte )

    /**
     * Set the height of the input area, or a button's text value
     * area.
     * 
     * @param inputHeight
     */
    public void setInputHeight( Byte inputHeight )
    {
        this.inputHeight = inputHeight;
    } //-- void setInputHeight( Byte )

    /**
     * Set padding of text in the input.
     * 
     * @param inputPadding
     */
    public void setInputPadding( Byte inputPadding )
    {
        this.inputPadding = inputPadding;
    } //-- void setInputPadding( Byte )

    /**
     * Set the width of the input area, or a button's text value
     * area.
     * 
     * @param inputWidth
     */
    public void setInputWidth( Byte inputWidth )
    {
        this.inputWidth = inputWidth;
    } //-- void setInputWidth( Byte )

    /**
     * Set the text label of the control.
     * 
     * @param label
     */
    public void setLabel( Byte label )
    {
        this.label = label;
    } //-- void setLabel( Byte )

    /**
     * Set positions label above the control.
     * 
     * @param labelPosition
     */
    public void setLabelPosition( Byte labelPosition )
    {
        this.labelPosition = labelPosition;
    } //-- void setLabelPosition( Byte )

    /**
     * Set the width of the label.
     * 
     * @param labelWidth
     */
    public void setLabelWidth( Byte labelWidth )
    {
        this.labelWidth = labelWidth;
    } //-- void setLabelWidth( Byte )

    /**
     * Set max value of slider.
     * 
     * @param max
     */
    public void setMax( Byte max )
    {
        this.max = max;
    } //-- void setMax( Byte )

    /**
     * Set sets the maximum height for the view.
     * 
     * @param maxHeight
     */
    public void setMaxHeight( Byte maxHeight )
    {
        this.maxHeight = maxHeight;
    } //-- void setMaxHeight( Byte )

    /**
     * Set sets the maximum width for the view.
     * 
     * @param maxWidth
     */
    public void setMaxWidth( Byte maxWidth )
    {
        this.maxWidth = maxWidth;
    } //-- void setMaxWidth( Byte )

    /**
     * Set min value of slider.
     * 
     * @param min
     */
    public void setMin( Byte min )
    {
        this.min = min;
    } //-- void setMin( Byte )

    /**
     * Set sets the minimal height for the view.
     * 
     * @param minHeight
     */
    public void setMinHeight( Byte minHeight )
    {
        this.minHeight = minHeight;
    } //-- void setMinHeight( Byte )

    /**
     * Set sets the minimal width for the view.
     * 
     * @param minWidth
     */
    public void setMinWidth( Byte minWidth )
    {
        this.minWidth = minWidth;
    } //-- void setMinWidth( Byte )

    /**
     * Set name of the control.
     * 
     * @param name
     */
    public void setName( Byte name )
    {
        this.name = name;
    } //-- void setName( Byte )

    /**
     * Set allows attaching custom handlers to inner events of the
     * component.
     * 
     * @param on
     */
    public void setOn( Byte on )
    {
        this.on = on;
    } //-- void setOn( Byte )

    /**
     * Set placeholder text for the input.
     * 
     * @param placeholder
     */
    public void setPlaceholder( Byte placeholder )
    {
        this.placeholder = placeholder;
    } //-- void setPlaceholder( Byte )

    /**
     * Set allows to attach pop-up menu to the button.
     * 
     * @param popup
     */
    public void setPopup( Byte popup )
    {
        this.popup = popup;
    } //-- void setPopup( Byte )

    /**
     * Set configures readonly mode for the input.
     * 
     * @param readonly
     */
    public void setReadonly( Byte readonly )
    {
        this.readonly = readonly;
    } //-- void setReadonly( Byte )

    /**
     * Set action to call when value of cell changes.
     * 
     * @param relatedAction
     */
    public void setRelatedAction( Byte relatedAction )
    {
        this.relatedAction = relatedAction;
    } //-- void setRelatedAction( Byte )

    /**
     * Set id of view, that will be affected by relatedAction
     * operation.
     * 
     * @param relatedView
     */
    public void setRelatedView( Byte relatedView )
    {
        this.relatedView = relatedView;
    } //-- void setRelatedView( Byte )

    /**
     * Set marks field as required.
     * 
     * @param required
     */
    public void setRequired( Byte required )
    {
        this.required = required;
    } //-- void setRequired( Byte )

    /**
     * Set step of slider.
     * 
     * @param step
     */
    public void setStep( Byte step )
    {
        this.step = step;
    } //-- void setStep( Byte )

    /**
     * Set links suggest list to the input.
     * 
     * @param suggest
     */
    public void setSuggest( Byte suggest )
    {
        this.suggest = suggest;
    } //-- void setSuggest( Byte )

    /**
     * Set defines whether the control will be included in the tab
     * navigation order.
     * 
     * @param tabFocus
     */
    public void setTabFocus( Byte tabFocus )
    {
        this.tabFocus = tabFocus;
    } //-- void setTabFocus( Byte )

    /**
     * Set the component template.
     * 
     * @param template
     */
    public void setTemplate( Byte template )
    {
        this.template = template;
    } //-- void setTemplate( Byte )

    /**
     * Set text over slider bar.
     * 
     * @param title
     */
    public void setTitle( Byte title )
    {
        this.title = title;
    } //-- void setTitle( Byte )

    /**
     * Set tooltip for the input.
     * 
     * @param tooltip
     */
    public void setTooltip( Byte tooltip )
    {
        this.tooltip = tooltip;
    } //-- void setTooltip( Byte )

    /**
     * Set the type of the control.
     * 
     * @param type
     */
    public void setType( Byte type )
    {
        this.type = type;
    } //-- void setType( Byte )

    /**
     * Set adds validation to the field.
     * 
     * @param validate
     */
    public void setValidate( Byte validate )
    {
        this.validate = validate;
    } //-- void setValidate( Byte )

    /**
     * Set on which event validation fires.
     * 
     * @param validateEvent
     */
    public void setValidateEvent( Byte validateEvent )
    {
        this.validateEvent = validateEvent;
    } //-- void setValidateEvent( Byte )

    /**
     * Set sets the initial value for a control.
     * 
     * @param value
     */
    public void setValue( Byte value )
    {
        this.value = value;
    } //-- void setValue( Byte )

    /**
     * Set sets the width of the component.
     * 
     * @param width
     */
    public void setWidth( Byte width )
    {
        this.width = width;
    } //-- void setWidth( Byte )

    /**
     * Adjusts the component to the size of the parent HTML container
     */
    public void adjust() {
        return;
    }
    /**
     * Attaches the handler to an inner event of the component (allows behaviour customizations)
     */
    public Byte attachEvent() {
        return null;
    }
    /**
     * Binds components
     */
    public void bind() {
        return;
    }
    /**
     * Temporarily blocks triggering of ALL events of the calling object
     */
    public void blockEvent() {
        return;
    }
    /**
     * Removes the focus from the control
     */
    public void blur() {
        return;
    }
    /**
     * Calls an inner event
     */
    public Boolean callEvent() {
        return null;
    }
    /**
     * Redefines a single configuration property (or a hash of properties)
     */
    public void define() {
        return;
    }
    /**
     * Destructs the calling object
     */
    public void destructor() {
        return;
    }
    /**
     * Detaches a handler from an event (which was attached before by the attachEvent method)
     */
    public void detachEvent() {
        return;
    }
    /**
     * Disables the calling view (makes it dimmed and unclickable)
     */
    public void disable() {
        return;
    }
    /**
     * Enables the calling view that was disabled by the 'disable' method
     */
    public void enable() {
        return;
    }
    /**
     * Sets focus to the control
     */
    public void focus() {
        return;
    }
    /**
     * Returns child views of the calling component
     */
    public Byte getChildViews() {
        return null;
    }
    /**
     * Returns master form for the input
     */
    public Byte getFormView() {
        return null;
    }
    /**
     * Gets the HTML element related to the component
     */
    public Byte getInputNode() {
        return null;
    }
    /**
     * Returns the main HTML container for the calling object
     */
    public Byte getNode() {
        return null;
    }
    /**
     * Returns the parent view of the component
     */
    public Byte getParentView() {
        return null;
    }
    /**
     * Returns top parent view
     */
    public Byte getTopParentView() {
        return null;
    }
    /**
     * Checks whether the component has the specified event
     */
    public Boolean hasEvent() {
        return null;
    }
    /**
     * Hides the view
     */
    public void hide() {
        return;
    }
    /**
     * Checks whether the view is enabled
     */
    public Boolean isEnabled() {
        return null;
    }
    /**
     * Checks whether the view is visible
     */
    public Boolean isVisible() {
        return null;
    }
    /**
     * Routes events from one object to another
     */
    public void mapEvent() {
        return;
    }
    /**
     * Repaints the component
     */
    public void refresh() {
        return;
    }
    /**
     * Renders the specified item or the whole component
     */
    public void render() {
        return;
    }
    /**
     * Adjusts the view to a new size
     */
    public void resize() {
        return;
    }
    /**
     * Makes the component visible
     */
    public void show() {
        return;
    }
    /**
     * Allows you to sync two copy of data (all or just a part of it) from one DataCollection to another
     */
    public void sync() {
        return;
    }
    /**
     * Breaks "bind" link
     */
    public void unbind() {
        return;
    }
    /**
     * Cancels blocking events that was enabled by the 'blockEvent' command
     */
    public void unblockEvent() {
        return;
    }
    /**
     * Validates value of input
     */
    public Boolean validate() {
        return null;
    }
}
