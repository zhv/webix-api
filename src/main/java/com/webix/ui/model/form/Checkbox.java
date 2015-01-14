// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.7,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.form;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.webix.ui.model.UnknownType;
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
 * A two-state check box.The control allows users to make multiple
 * choices from a number of options. Fully customizable and can be
 * used both as a stand-alone view and as a part of a form. Check
 * <a
 * href="http://docs.webix.com/desktop__controls.html#checkbox">checkbox</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
@com.webix.ui.model.SupportsEvent({com.webix.ui.model.Event.ON_AFTER_RENDER, com.webix.ui.model.Event.ON_AFTER_SCROLL, com.webix.ui.model.Event.ON_BEFORE_RENDER, com.webix.ui.model.Event.ON_BIND_REQUEST, com.webix.ui.model.Event.ON_CHANGE, com.webix.ui.model.Event.ON_DESTRUCT, com.webix.ui.model.Event.ON_ITEM_CLICK, com.webix.ui.model.Event.ON_KEY_PRESS, com.webix.ui.model.Event.ON_LONG_TOUCH, com.webix.ui.model.Event.ON_ROTATE, com.webix.ui.model.Event.ON_SWIPE_X, com.webix.ui.model.Event.ON_SWIPE_Y, com.webix.ui.model.Event.ON_TIMED_KEY_PRESS, com.webix.ui.model.Event.ON_TOUCH_END, com.webix.ui.model.Event.ON_TOUCH_MOVE, com.webix.ui.model.Event.ON_TOUCH_START, com.webix.ui.model.Event.ON_VIEW_RESIZE})
public class Checkbox
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alignment of the control within the parent container.
     */
    private String align;

    /**
     * Defines or disables view change animation.
     */
    private UnknownType animate;

    /**
     * Sets an hash of HTML input attributes that will be parsed
     * for the Webix input control.
     */
    private UnknownType attributes;

    /**
     * Used to hide the component borders.
     */
    private Boolean borderless;

    /**
     * Result of getValue for checked checkbox.
     */
    private String checkValue;

    /**
     * Click action handler.
     */
    private UnknownType click;

    /**
     * An html container (or its id) where the component needs
     * initializing.
     */
    private UnknownType container;

    /**
     * The id or node, whose content will be moved to the view.
     */
    private UnknownType content;

    /**
     * The name of a css class that will be applied to the view
     * container.
     */
    private String css;

    /**
     * Enables/disables custom checkbox in some skins.
     */
    private Boolean customCheckbox;

    /**
     * Disables item.
     */
    private Boolean disabled;

    /**
     * Sets the view gravity (1 by default).
     */
    private Integer gravity;

    /**
     * Sets the height of the component.
     */
    private Integer height;

    /**
     * Defines whether the view will be hidden initially.
     */
    private Boolean hidden;

    /**
     * Sets a hotkey that triggers button clicking.
     */
    private String hotkey;

    /**
     * The component ID.
     */
    private String id;

    /**
     * The height of the input area, or a button's text value area.
     */
    private Integer inputHeight;

    /**
     * Padding of text in the input.
     */
    private Integer inputPadding;

    /**
     * The width of the input area, or a button's text value area.
     */
    private Integer inputWidth;

    /**
     * The text label of the control.
     */
    private String label;

    /**
     * Positions label above the control.
     */
    private String labelPosition;

    /**
     * The width of the label.
     */
    private Integer labelWidth;

    /**
     * Sets the maximum height for the view.
     */
    private Integer maxHeight;

    /**
     * Sets the maximum width for the view.
     */
    private Integer maxWidth;

    /**
     * Sets the minimal height for the view.
     */
    private Integer minHeight;

    /**
     * Sets the minimal width for the view.
     */
    private Integer minWidth;

    /**
     * Name of the control.
     */
    private String name;

    /**
     * Allows attaching custom handlers to inner events of the
     * component.
     */
    private UnknownType on;

    /**
     * Placeholder text for the input.
     */
    private String placeholder;

    /**
     * Allows to attach pop-up menu to the button.
     */
    private UnknownType popup;

    /**
     * Configures readonly mode for the input.
     */
    private Boolean readonly;

    /**
     * Action to call when value of cell changes.
     */
    private String relatedAction;

    /**
     * Id of view, that will be affected by relatedAction operation.
     */
    private String relatedView;

    /**
     * Marks field as required.
     */
    private Boolean required;

    /**
     * Links suggest list to the input.
     */
    private UnknownType suggest;

    /**
     * Defines whether the control will be included in the tab
     * navigation order.
     */
    private Boolean tabFocus;

    /**
     * The component template.
     */
    private UnknownType template;

    /**
     * Tooltip for the input.
     */
    private String tooltip;

    /**
     * The type of the control.
     */
    private String type;

    /**
     * Result of getValue for unchecked checkbox.
     */
    private String uncheckValue;

    /**
     * Adds validation to the field.
     */
    private Boolean validate;

    /**
     * On which event validation fires.
     */
    private String validateEvent;

    /**
     * Sets the initial value for a control.
     */
    private String value;

    /**
     * Sets the width of the component.
     */
    private Integer width;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the alignment of the control within the parent
     * container.
     * 
     * @return String
     */
    public String getAlign()
    {
        return this.align;
    } //-- String getAlign()

    /**
     * Get defines or disables view change animation.
     * 
     * @return UnknownType
     */
    public UnknownType getAnimate()
    {
        return this.animate;
    } //-- UnknownType getAnimate()

    /**
     * Get sets an hash of HTML input attributes that will be
     * parsed for the Webix input control.
     * 
     * @return UnknownType
     */
    public UnknownType getAttributes()
    {
        return this.attributes;
    } //-- UnknownType getAttributes()

    /**
     * Get result of getValue for checked checkbox.
     * 
     * @return String
     */
    public String getCheckValue()
    {
        return this.checkValue;
    } //-- String getCheckValue()

    /**
     * Get click action handler.
     * 
     * @return UnknownType
     */
    public UnknownType getClick()
    {
        return this.click;
    } //-- UnknownType getClick()

    /**
     * Get an html container (or its id) where the component needs
     * initializing.
     * 
     * @return UnknownType
     */
    public UnknownType getContainer()
    {
        return this.container;
    } //-- UnknownType getContainer()

    /**
     * Get the id or node, whose content will be moved to the view.
     * 
     * @return UnknownType
     */
    public UnknownType getContent()
    {
        return this.content;
    } //-- UnknownType getContent()

    /**
     * Get the name of a css class that will be applied to the view
     * container.
     * 
     * @return String
     */
    public String getCss()
    {
        return this.css;
    } //-- String getCss()

    /**
     * Get sets the view gravity (1 by default).
     * 
     * @return Integer
     */
    public Integer getGravity()
    {
        return this.gravity;
    } //-- Integer getGravity()

    /**
     * Get sets the height of the component.
     * 
     * @return Integer
     */
    public Integer getHeight()
    {
        return this.height;
    } //-- Integer getHeight()

    /**
     * Get sets a hotkey that triggers button clicking.
     * 
     * @return String
     */
    public String getHotkey()
    {
        return this.hotkey;
    } //-- String getHotkey()

    /**
     * Get the component ID.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Get the height of the input area, or a button's text value
     * area.
     * 
     * @return Integer
     */
    public Integer getInputHeight()
    {
        return this.inputHeight;
    } //-- Integer getInputHeight()

    /**
     * Get padding of text in the input.
     * 
     * @return Integer
     */
    public Integer getInputPadding()
    {
        return this.inputPadding;
    } //-- Integer getInputPadding()

    /**
     * Get the width of the input area, or a button's text value
     * area.
     * 
     * @return Integer
     */
    public Integer getInputWidth()
    {
        return this.inputWidth;
    } //-- Integer getInputWidth()

    /**
     * Get the text label of the control.
     * 
     * @return String
     */
    public String getLabel()
    {
        return this.label;
    } //-- String getLabel()

    /**
     * Get positions label above the control.
     * 
     * @return String
     */
    public String getLabelPosition()
    {
        return this.labelPosition;
    } //-- String getLabelPosition()

    /**
     * Get the width of the label.
     * 
     * @return Integer
     */
    public Integer getLabelWidth()
    {
        return this.labelWidth;
    } //-- Integer getLabelWidth()

    /**
     * Get sets the maximum height for the view.
     * 
     * @return Integer
     */
    public Integer getMaxHeight()
    {
        return this.maxHeight;
    } //-- Integer getMaxHeight()

    /**
     * Get sets the maximum width for the view.
     * 
     * @return Integer
     */
    public Integer getMaxWidth()
    {
        return this.maxWidth;
    } //-- Integer getMaxWidth()

    /**
     * Get sets the minimal height for the view.
     * 
     * @return Integer
     */
    public Integer getMinHeight()
    {
        return this.minHeight;
    } //-- Integer getMinHeight()

    /**
     * Get sets the minimal width for the view.
     * 
     * @return Integer
     */
    public Integer getMinWidth()
    {
        return this.minWidth;
    } //-- Integer getMinWidth()

    /**
     * Get name of the control.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get allows attaching custom handlers to inner events of the
     * component.
     * 
     * @return UnknownType
     */
    public UnknownType getOn()
    {
        return this.on;
    } //-- UnknownType getOn()

    /**
     * Get placeholder text for the input.
     * 
     * @return String
     */
    public String getPlaceholder()
    {
        return this.placeholder;
    } //-- String getPlaceholder()

    /**
     * Get allows to attach pop-up menu to the button.
     * 
     * @return UnknownType
     */
    public UnknownType getPopup()
    {
        return this.popup;
    } //-- UnknownType getPopup()

    /**
     * Get action to call when value of cell changes.
     * 
     * @return String
     */
    public String getRelatedAction()
    {
        return this.relatedAction;
    } //-- String getRelatedAction()

    /**
     * Get id of view, that will be affected by relatedAction
     * operation.
     * 
     * @return String
     */
    public String getRelatedView()
    {
        return this.relatedView;
    } //-- String getRelatedView()

    /**
     * Get links suggest list to the input.
     * 
     * @return UnknownType
     */
    public UnknownType getSuggest()
    {
        return this.suggest;
    } //-- UnknownType getSuggest()

    /**
     * Get the component template.
     * 
     * @return UnknownType
     */
    public UnknownType getTemplate()
    {
        return this.template;
    } //-- UnknownType getTemplate()

    /**
     * Get tooltip for the input.
     * 
     * @return String
     */
    public String getTooltip()
    {
        return this.tooltip;
    } //-- String getTooltip()

    /**
     * Get the type of the control.
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Get result of getValue for unchecked checkbox.
     * 
     * @return String
     */
    public String getUncheckValue()
    {
        return this.uncheckValue;
    } //-- String getUncheckValue()

    /**
     * Get on which event validation fires.
     * 
     * @return String
     */
    public String getValidateEvent()
    {
        return this.validateEvent;
    } //-- String getValidateEvent()

    /**
     * Get sets the initial value for a control.
     * 
     * @return String
     */
    public String getValue()
    {
        return this.value;
    } //-- String getValue()

    /**
     * Get sets the width of the component.
     * 
     * @return Integer
     */
    public Integer getWidth()
    {
        return this.width;
    } //-- Integer getWidth()

    /**
     * Get used to hide the component borders.
     * 
     * @return Boolean
     */
    public Boolean isBorderless()
    {
        return this.borderless;
    } //-- Boolean isBorderless()

    /**
     * Get enables/disables custom checkbox in some skins.
     * 
     * @return Boolean
     */
    public Boolean isCustomCheckbox()
    {
        return this.customCheckbox;
    } //-- Boolean isCustomCheckbox()

    /**
     * Get disables item.
     * 
     * @return Boolean
     */
    public Boolean isDisabled()
    {
        return this.disabled;
    } //-- Boolean isDisabled()

    /**
     * Get defines whether the view will be hidden initially.
     * 
     * @return Boolean
     */
    public Boolean isHidden()
    {
        return this.hidden;
    } //-- Boolean isHidden()

    /**
     * Get configures readonly mode for the input.
     * 
     * @return Boolean
     */
    public Boolean isReadonly()
    {
        return this.readonly;
    } //-- Boolean isReadonly()

    /**
     * Get marks field as required.
     * 
     * @return Boolean
     */
    public Boolean isRequired()
    {
        return this.required;
    } //-- Boolean isRequired()

    /**
     * Get defines whether the control will be included in the tab
     * navigation order.
     * 
     * @return Boolean
     */
    public Boolean isTabFocus()
    {
        return this.tabFocus;
    } //-- Boolean isTabFocus()

    /**
     * Get adds validation to the field.
     * 
     * @return Boolean
     */
    public Boolean isValidate()
    {
        return this.validate;
    } //-- Boolean isValidate()

    /**
     * Set the alignment of the control within the parent
     * container.
     * 
     * @param align
     */
    public void setAlign( String align )
    {
        this.align = align;
    } //-- void setAlign( String )

    /**
     * Set defines or disables view change animation.
     * 
     * @param animate
     */
    public void setAnimate( UnknownType animate )
    {
        this.animate = animate;
    } //-- void setAnimate( UnknownType )

    /**
     * Set sets an hash of HTML input attributes that will be
     * parsed for the Webix input control.
     * 
     * @param attributes
     */
    public void setAttributes( UnknownType attributes )
    {
        this.attributes = attributes;
    } //-- void setAttributes( UnknownType )

    /**
     * Set used to hide the component borders.
     * 
     * @param borderless
     */
    public void setBorderless( Boolean borderless )
    {
        this.borderless = borderless;
    } //-- void setBorderless( Boolean )

    /**
     * Set result of getValue for checked checkbox.
     * 
     * @param checkValue
     */
    public void setCheckValue( String checkValue )
    {
        this.checkValue = checkValue;
    } //-- void setCheckValue( String )

    /**
     * Set click action handler.
     * 
     * @param click
     */
    public void setClick( UnknownType click )
    {
        this.click = click;
    } //-- void setClick( UnknownType )

    /**
     * Set an html container (or its id) where the component needs
     * initializing.
     * 
     * @param container
     */
    public void setContainer( UnknownType container )
    {
        this.container = container;
    } //-- void setContainer( UnknownType )

    /**
     * Set the id or node, whose content will be moved to the view.
     * 
     * @param content
     */
    public void setContent( UnknownType content )
    {
        this.content = content;
    } //-- void setContent( UnknownType )

    /**
     * Set the name of a css class that will be applied to the view
     * container.
     * 
     * @param css
     */
    public void setCss( String css )
    {
        this.css = css;
    } //-- void setCss( String )

    /**
     * Set enables/disables custom checkbox in some skins.
     * 
     * @param customCheckbox
     */
    public void setCustomCheckbox( Boolean customCheckbox )
    {
        this.customCheckbox = customCheckbox;
    } //-- void setCustomCheckbox( Boolean )

    /**
     * Set disables item.
     * 
     * @param disabled
     */
    public void setDisabled( Boolean disabled )
    {
        this.disabled = disabled;
    } //-- void setDisabled( Boolean )

    /**
     * Set sets the view gravity (1 by default).
     * 
     * @param gravity
     */
    public void setGravity( Integer gravity )
    {
        this.gravity = gravity;
    } //-- void setGravity( Integer )

    /**
     * Set sets the height of the component.
     * 
     * @param height
     */
    public void setHeight( Integer height )
    {
        this.height = height;
    } //-- void setHeight( Integer )

    /**
     * Set defines whether the view will be hidden initially.
     * 
     * @param hidden
     */
    public void setHidden( Boolean hidden )
    {
        this.hidden = hidden;
    } //-- void setHidden( Boolean )

    /**
     * Set sets a hotkey that triggers button clicking.
     * 
     * @param hotkey
     */
    public void setHotkey( String hotkey )
    {
        this.hotkey = hotkey;
    } //-- void setHotkey( String )

    /**
     * Set the component ID.
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set the height of the input area, or a button's text value
     * area.
     * 
     * @param inputHeight
     */
    public void setInputHeight( Integer inputHeight )
    {
        this.inputHeight = inputHeight;
    } //-- void setInputHeight( Integer )

    /**
     * Set padding of text in the input.
     * 
     * @param inputPadding
     */
    public void setInputPadding( Integer inputPadding )
    {
        this.inputPadding = inputPadding;
    } //-- void setInputPadding( Integer )

    /**
     * Set the width of the input area, or a button's text value
     * area.
     * 
     * @param inputWidth
     */
    public void setInputWidth( Integer inputWidth )
    {
        this.inputWidth = inputWidth;
    } //-- void setInputWidth( Integer )

    /**
     * Set the text label of the control.
     * 
     * @param label
     */
    public void setLabel( String label )
    {
        this.label = label;
    } //-- void setLabel( String )

    /**
     * Set positions label above the control.
     * 
     * @param labelPosition
     */
    public void setLabelPosition( String labelPosition )
    {
        this.labelPosition = labelPosition;
    } //-- void setLabelPosition( String )

    /**
     * Set the width of the label.
     * 
     * @param labelWidth
     */
    public void setLabelWidth( Integer labelWidth )
    {
        this.labelWidth = labelWidth;
    } //-- void setLabelWidth( Integer )

    /**
     * Set sets the maximum height for the view.
     * 
     * @param maxHeight
     */
    public void setMaxHeight( Integer maxHeight )
    {
        this.maxHeight = maxHeight;
    } //-- void setMaxHeight( Integer )

    /**
     * Set sets the maximum width for the view.
     * 
     * @param maxWidth
     */
    public void setMaxWidth( Integer maxWidth )
    {
        this.maxWidth = maxWidth;
    } //-- void setMaxWidth( Integer )

    /**
     * Set sets the minimal height for the view.
     * 
     * @param minHeight
     */
    public void setMinHeight( Integer minHeight )
    {
        this.minHeight = minHeight;
    } //-- void setMinHeight( Integer )

    /**
     * Set sets the minimal width for the view.
     * 
     * @param minWidth
     */
    public void setMinWidth( Integer minWidth )
    {
        this.minWidth = minWidth;
    } //-- void setMinWidth( Integer )

    /**
     * Set name of the control.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set allows attaching custom handlers to inner events of the
     * component.
     * 
     * @param on
     */
    public void setOn( UnknownType on )
    {
        this.on = on;
    } //-- void setOn( UnknownType )

    /**
     * Set placeholder text for the input.
     * 
     * @param placeholder
     */
    public void setPlaceholder( String placeholder )
    {
        this.placeholder = placeholder;
    } //-- void setPlaceholder( String )

    /**
     * Set allows to attach pop-up menu to the button.
     * 
     * @param popup
     */
    public void setPopup( UnknownType popup )
    {
        this.popup = popup;
    } //-- void setPopup( UnknownType )

    /**
     * Set configures readonly mode for the input.
     * 
     * @param readonly
     */
    public void setReadonly( Boolean readonly )
    {
        this.readonly = readonly;
    } //-- void setReadonly( Boolean )

    /**
     * Set action to call when value of cell changes.
     * 
     * @param relatedAction
     */
    public void setRelatedAction( String relatedAction )
    {
        this.relatedAction = relatedAction;
    } //-- void setRelatedAction( String )

    /**
     * Set id of view, that will be affected by relatedAction
     * operation.
     * 
     * @param relatedView
     */
    public void setRelatedView( String relatedView )
    {
        this.relatedView = relatedView;
    } //-- void setRelatedView( String )

    /**
     * Set marks field as required.
     * 
     * @param required
     */
    public void setRequired( Boolean required )
    {
        this.required = required;
    } //-- void setRequired( Boolean )

    /**
     * Set links suggest list to the input.
     * 
     * @param suggest
     */
    public void setSuggest( UnknownType suggest )
    {
        this.suggest = suggest;
    } //-- void setSuggest( UnknownType )

    /**
     * Set defines whether the control will be included in the tab
     * navigation order.
     * 
     * @param tabFocus
     */
    public void setTabFocus( Boolean tabFocus )
    {
        this.tabFocus = tabFocus;
    } //-- void setTabFocus( Boolean )

    /**
     * Set the component template.
     * 
     * @param template
     */
    public void setTemplate( UnknownType template )
    {
        this.template = template;
    } //-- void setTemplate( UnknownType )

    /**
     * Set tooltip for the input.
     * 
     * @param tooltip
     */
    public void setTooltip( String tooltip )
    {
        this.tooltip = tooltip;
    } //-- void setTooltip( String )

    /**
     * Set the type of the control.
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

    /**
     * Set result of getValue for unchecked checkbox.
     * 
     * @param uncheckValue
     */
    public void setUncheckValue( String uncheckValue )
    {
        this.uncheckValue = uncheckValue;
    } //-- void setUncheckValue( String )

    /**
     * Set adds validation to the field.
     * 
     * @param validate
     */
    public void setValidate( Boolean validate )
    {
        this.validate = validate;
    } //-- void setValidate( Boolean )

    /**
     * Set on which event validation fires.
     * 
     * @param validateEvent
     */
    public void setValidateEvent( String validateEvent )
    {
        this.validateEvent = validateEvent;
    } //-- void setValidateEvent( String )

    /**
     * Set sets the initial value for a control.
     * 
     * @param value
     */
    public void setValue( String value )
    {
        this.value = value;
    } //-- void setValue( String )

    /**
     * Set sets the width of the component.
     * 
     * @param width
     */
    public void setWidth( Integer width )
    {
        this.width = width;
    } //-- void setWidth( Integer )

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
     * Swiches between states of the control ('checked' to 'unchecked' and vice-versa)
     */
    public void toggle() {
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
