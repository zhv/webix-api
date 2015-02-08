// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.form;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.webix.ui.model.AnimateConfig;
import com.webix.ui.model.Baselayout;
import com.webix.ui.model.Baseview;
import com.webix.ui.model.DelimiterConfig;
import com.webix.ui.model.EventHandler;
import com.webix.ui.model.EventHandlerList;
import com.webix.ui.model.GraphItemConfig;
import com.webix.ui.model.NavigationConfig;
import com.webix.ui.model.PaddingConfig;
import com.webix.ui.model.Proto;
import com.webix.ui.model.RGBColorList;
import com.webix.ui.model.TypeConfig;
import com.webix.ui.model.UnknownType;
import com.webix.ui.model.View;
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
 * 
 * A control that allows the user to select a date.
 * The control combines an editable text field with a drop-down
 * calendar. Supports all date and time formats. Besides the days
 * of the month, it can display hour and minite selectors. Check <a
 * href="http://docs.webix.com/desktop__controls.html#datepicker">datepicker</a>
 * documentation for more detailed description.
 * 
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_AFTER_RENDER,
    com.webix.ui.model.Event.ON_AFTER_SCROLL,
    com.webix.ui.model.Event.ON_BEFORE_RENDER,
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_CHANGE,
    com.webix.ui.model.Event.ON_DESTRUCT,
    com.webix.ui.model.Event.ON_ITEM_CLICK,
    com.webix.ui.model.Event.ON_KEY_PRESS,
    com.webix.ui.model.Event.ON_LONG_TOUCH,
    com.webix.ui.model.Event.ON_SWIPE_X,
    com.webix.ui.model.Event.ON_SWIPE_Y,
    com.webix.ui.model.Event.ON_TIMED_KEY_PRESS,
    com.webix.ui.model.Event.ON_TOUCH_END,
    com.webix.ui.model.Event.ON_TOUCH_MOVE,
    com.webix.ui.model.Event.ON_TOUCH_START,
    com.webix.ui.model.Event.ON_VIEW_RESIZE
})
@com.webix.ui.model.WebixName("datepicker")
@javax.xml.bind.annotation.XmlRootElement
public class Datepicker
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alignment of the control within the parent container<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_align_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String align;

    /**
     * Sets an hash of HTML input attributes that will be parsed
     * for the Webix input control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_attributes_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("hash")
    private java.util.Map<String, String> attributes;

    /**
     * Click action handler<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_click_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("functor")
    private String click;

    /**
     * The id or node, whose content will be moved to the view<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_content_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("id|element")
    private String content;

    /**
     * Allows making datepicker editable, false by default<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.datepicker_editable_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("boolean")
    private Boolean editable;

    /**
     * Sets date format in the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_format_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String format;

    /**
     * Sets a hotkey that triggers button clicking<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_hotkey_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String hotkey;

    /**
     * Sets an icon type<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_icon_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String icon;

    /**
     * The height of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer inputHeight;

    /**
     * Padding of text in the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputpadding_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer inputPadding;

    /**
     * The width of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputwidth_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer inputWidth;

    /**
     * The text label of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_label_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String label;

    /**
     * Positions label above the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_labelposition_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String labelPosition;

    /**
     * The width of the label<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_labelwidth_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer labelWidth;

    /**
     * Name of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_name_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String name;

    /**
     * Placeholder text for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_placeholder_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String placeholder;

    /**
     * Allows to attach pop-up menu to the button<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_popup_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private String popup;

    /**
     * Configures readonly mode for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_readonly_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("boolean")
    private Boolean readonly;

    /**
     * Action to call when value of cell changes<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_relatedaction_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String relatedAction;

    /**
     * Id of view, that will be affected by relatedAction
     * operation<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_relatedview_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String relatedView;

    /**
     * Marks field as required<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_required_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean required;

    /**
     * If the parameter is set to true, the method getValue returns
     * data as string (otherwise, as object)<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_stringresult_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("")
    private Boolean stringResult;

    /**
     * Links suggest list to the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_suggest_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|view")
    private View suggest;

    /**
     * Defines whether the control will be included in the tab
     * navigation order<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_tabfocus_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean tabFocus;

    /**
     * Visible text in the related input<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_text_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String text;

    /**
     * Sets an icon for time in the datepicker<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_timeicon_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String timeIcon;

    /**
     * Enables optional timepicker in the calendar<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_timepicker_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean timepicker;

    /**
     * Tooltip for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_tooltip_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String tooltip;

    /**
     * The type of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_type_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String type;

    /**
     * Adds validation to the field<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_validate_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean validate;

    /**
     * On which event validation fires<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_validateevent_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String validateEvent;

    /**
     * Sets the initial value for a control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_value_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("id")
    private UnknownType value;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the alignment of the control within the parent
     * container<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_align_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getAlign()
    {
        return this.align;
    } //-- String getAlign()

    /**
     * Get sets an hash of HTML input attributes that will be
     * parsed for the Webix input control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_attributes_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getAttributes()
    {
        return this.attributes;
    } //-- java.util.Map<String, String> getAttributes()

    /**
     * Get click action handler<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_click_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getClick()
    {
        return this.click;
    } //-- String getClick()

    /**
     * Get the id or node, whose content will be moved to the
     * view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_content_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getContent()
    {
        return this.content;
    } //-- String getContent()

    /**
     * Get sets date format in the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_format_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getFormat()
    {
        return this.format;
    } //-- String getFormat()

    /**
     * Get sets a hotkey that triggers button clicking<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_hotkey_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getHotkey()
    {
        return this.hotkey;
    } //-- String getHotkey()

    /**
     * Get sets an icon type<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_icon_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getIcon()
    {
        return this.icon;
    } //-- String getIcon()

    /**
     * Get the height of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getInputHeight()
    {
        return this.inputHeight;
    } //-- Integer getInputHeight()

    /**
     * Get padding of text in the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputpadding_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getInputPadding()
    {
        return this.inputPadding;
    } //-- Integer getInputPadding()

    /**
     * Get the width of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputwidth_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getInputWidth()
    {
        return this.inputWidth;
    } //-- Integer getInputWidth()

    /**
     * Get the text label of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_label_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getLabel()
    {
        return this.label;
    } //-- String getLabel()

    /**
     * Get positions label above the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_labelposition_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getLabelPosition()
    {
        return this.labelPosition;
    } //-- String getLabelPosition()

    /**
     * Get the width of the label<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_labelwidth_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getLabelWidth()
    {
        return this.labelWidth;
    } //-- Integer getLabelWidth()

    /**
     * Get name of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_name_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get placeholder text for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_placeholder_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getPlaceholder()
    {
        return this.placeholder;
    } //-- String getPlaceholder()

    /**
     * Get allows to attach pop-up menu to the button<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_popup_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getPopup()
    {
        return this.popup;
    } //-- String getPopup()

    /**
     * Get action to call when value of cell changes<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_relatedaction_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getRelatedAction()
    {
        return this.relatedAction;
    } //-- String getRelatedAction()

    /**
     * Get id of view, that will be affected by relatedAction
     * operation<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_relatedview_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getRelatedView()
    {
        return this.relatedView;
    } //-- String getRelatedView()

    /**
     * Get links suggest list to the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_suggest_config.html">Webix
     * API Reference</a>
     * 
     * @return View
     */
    public View getSuggest()
    {
        return this.suggest;
    } //-- View getSuggest()

    /**
     * Get visible text in the related input<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_text_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getText()
    {
        return this.text;
    } //-- String getText()

    /**
     * Get sets an icon for time in the datepicker<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_timeicon_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getTimeIcon()
    {
        return this.timeIcon;
    } //-- String getTimeIcon()

    /**
     * Get tooltip for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_tooltip_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getTooltip()
    {
        return this.tooltip;
    } //-- String getTooltip()

    /**
     * Get the type of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_type_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Get on which event validation fires<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_validateevent_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getValidateEvent()
    {
        return this.validateEvent;
    } //-- String getValidateEvent()

    /**
     * Get sets the initial value for a control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_value_config.html">Webix
     * API Reference</a>
     * 
     * @return UnknownType
     */
    public UnknownType getValue()
    {
        return this.value;
    } //-- UnknownType getValue()

    /**
     * Get allows making datepicker editable, false by default<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_editable_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isEditable()
    {
        return this.editable;
    } //-- Boolean isEditable()

    /**
     * Get configures readonly mode for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_readonly_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isReadonly()
    {
        return this.readonly;
    } //-- Boolean isReadonly()

    /**
     * Get marks field as required<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_required_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isRequired()
    {
        return this.required;
    } //-- Boolean isRequired()

    /**
     * Get if the parameter is set to true, the method getValue
     * returns data as string (otherwise, as object)<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_stringresult_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isStringResult()
    {
        return this.stringResult;
    } //-- Boolean isStringResult()

    /**
     * Get defines whether the control will be included in the tab
     * navigation order<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_tabfocus_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isTabFocus()
    {
        return this.tabFocus;
    } //-- Boolean isTabFocus()

    /**
     * Get enables optional timepicker in the calendar<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.datepicker_timepicker_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isTimepicker()
    {
        return this.timepicker;
    } //-- Boolean isTimepicker()

    /**
     * Get adds validation to the field<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_validate_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isValidate()
    {
        return this.validate;
    } //-- Boolean isValidate()

    /**
     * Set the alignment of the control within the parent
     * container<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_align_config.html">Webix
     * API Reference</a>
     * 
     * @param align
     */
    public void setAlign( String align )
    {
        this.align = align;
    } //-- void setAlign( String )

    /**
     * Set sets an hash of HTML input attributes that will be
     * parsed for the Webix input control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_attributes_config.html">Webix
     * API Reference</a>
     * 
     * @param attributes
     */
    public void setAttributes( java.util.Map<String, String> attributes )
    {
        this.attributes = attributes;
    } //-- void setAttributes( java.util.Map<String, String> )

    /**
     * Set click action handler<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_click_config.html">Webix
     * API Reference</a>
     * 
     * @param click
     */
    public void setClick( String click )
    {
        this.click = click;
    } //-- void setClick( String )

    /**
     * Set the id or node, whose content will be moved to the
     * view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_content_config.html">Webix
     * API Reference</a>
     * 
     * @param content
     */
    public void setContent( String content )
    {
        this.content = content;
    } //-- void setContent( String )

    /**
     * Set allows making datepicker editable, false by default<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_editable_config.html">Webix
     * API Reference</a>
     * 
     * @param editable
     */
    public void setEditable( Boolean editable )
    {
        this.editable = editable;
    } //-- void setEditable( Boolean )

    /**
     * Set sets date format in the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_format_config.html">Webix
     * API Reference</a>
     * 
     * @param format
     */
    public void setFormat( String format )
    {
        this.format = format;
    } //-- void setFormat( String )

    /**
     * Set sets a hotkey that triggers button clicking<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_hotkey_config.html">Webix
     * API Reference</a>
     * 
     * @param hotkey
     */
    public void setHotkey( String hotkey )
    {
        this.hotkey = hotkey;
    } //-- void setHotkey( String )

    /**
     * Set sets an icon type<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_icon_config.html">Webix
     * API Reference</a>
     * 
     * @param icon
     */
    public void setIcon( String icon )
    {
        this.icon = icon;
    } //-- void setIcon( String )

    /**
     * Set the height of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputheight_config.html">Webix
     * API Reference</a>
     * 
     * @param inputHeight
     */
    public void setInputHeight( Integer inputHeight )
    {
        this.inputHeight = inputHeight;
    } //-- void setInputHeight( Integer )

    /**
     * Set padding of text in the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputpadding_config.html">Webix
     * API Reference</a>
     * 
     * @param inputPadding
     */
    public void setInputPadding( Integer inputPadding )
    {
        this.inputPadding = inputPadding;
    } //-- void setInputPadding( Integer )

    /**
     * Set the width of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_inputwidth_config.html">Webix
     * API Reference</a>
     * 
     * @param inputWidth
     */
    public void setInputWidth( Integer inputWidth )
    {
        this.inputWidth = inputWidth;
    } //-- void setInputWidth( Integer )

    /**
     * Set the text label of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_label_config.html">Webix
     * API Reference</a>
     * 
     * @param label
     */
    public void setLabel( String label )
    {
        this.label = label;
    } //-- void setLabel( String )

    /**
     * Set positions label above the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_labelposition_config.html">Webix
     * API Reference</a>
     * 
     * @param labelPosition
     */
    public void setLabelPosition( String labelPosition )
    {
        this.labelPosition = labelPosition;
    } //-- void setLabelPosition( String )

    /**
     * Set the width of the label<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_labelwidth_config.html">Webix
     * API Reference</a>
     * 
     * @param labelWidth
     */
    public void setLabelWidth( Integer labelWidth )
    {
        this.labelWidth = labelWidth;
    } //-- void setLabelWidth( Integer )

    /**
     * Set name of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_name_config.html">Webix
     * API Reference</a>
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set placeholder text for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_placeholder_config.html">Webix
     * API Reference</a>
     * 
     * @param placeholder
     */
    public void setPlaceholder( String placeholder )
    {
        this.placeholder = placeholder;
    } //-- void setPlaceholder( String )

    /**
     * Set allows to attach pop-up menu to the button<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_popup_config.html">Webix
     * API Reference</a>
     * 
     * @param popup
     */
    public void setPopup( String popup )
    {
        this.popup = popup;
    } //-- void setPopup( String )

    /**
     * Set configures readonly mode for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_readonly_config.html">Webix
     * API Reference</a>
     * 
     * @param readonly
     */
    public void setReadonly( Boolean readonly )
    {
        this.readonly = readonly;
    } //-- void setReadonly( Boolean )

    /**
     * Set action to call when value of cell changes<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_relatedaction_config.html">Webix
     * API Reference</a>
     * 
     * @param relatedAction
     */
    public void setRelatedAction( String relatedAction )
    {
        this.relatedAction = relatedAction;
    } //-- void setRelatedAction( String )

    /**
     * Set id of view, that will be affected by relatedAction
     * operation<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_relatedview_config.html">Webix
     * API Reference</a>
     * 
     * @param relatedView
     */
    public void setRelatedView( String relatedView )
    {
        this.relatedView = relatedView;
    } //-- void setRelatedView( String )

    /**
     * Set marks field as required<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_required_config.html">Webix
     * API Reference</a>
     * 
     * @param required
     */
    public void setRequired( Boolean required )
    {
        this.required = required;
    } //-- void setRequired( Boolean )

    /**
     * Set if the parameter is set to true, the method getValue
     * returns data as string (otherwise, as object)<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_stringresult_config.html">Webix
     * API Reference</a>
     * 
     * @param stringResult
     */
    public void setStringResult( Boolean stringResult )
    {
        this.stringResult = stringResult;
    } //-- void setStringResult( Boolean )

    /**
     * Set links suggest list to the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_suggest_config.html">Webix
     * API Reference</a>
     * 
     * @param suggest
     */
    public void setSuggest( View suggest )
    {
        this.suggest = suggest;
    } //-- void setSuggest( View )

    /**
     * Set defines whether the control will be included in the tab
     * navigation order<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_tabfocus_config.html">Webix
     * API Reference</a>
     * 
     * @param tabFocus
     */
    public void setTabFocus( Boolean tabFocus )
    {
        this.tabFocus = tabFocus;
    } //-- void setTabFocus( Boolean )

    /**
     * Set visible text in the related input<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_text_config.html">Webix
     * API Reference</a>
     * 
     * @param text
     */
    public void setText( String text )
    {
        this.text = text;
    } //-- void setText( String )

    /**
     * Set sets an icon for time in the datepicker<br /><br /><a
     * href="http://docs.webix.com/api__ui.datepicker_timeicon_config.html">Webix
     * API Reference</a>
     * 
     * @param timeIcon
     */
    public void setTimeIcon( String timeIcon )
    {
        this.timeIcon = timeIcon;
    } //-- void setTimeIcon( String )

    /**
     * Set enables optional timepicker in the calendar<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.datepicker_timepicker_config.html">Webix
     * API Reference</a>
     * 
     * @param timepicker
     */
    public void setTimepicker( Boolean timepicker )
    {
        this.timepicker = timepicker;
    } //-- void setTimepicker( Boolean )

    /**
     * Set tooltip for the input<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_tooltip_config.html">Webix
     * API Reference</a>
     * 
     * @param tooltip
     */
    public void setTooltip( String tooltip )
    {
        this.tooltip = tooltip;
    } //-- void setTooltip( String )

    /**
     * Set the type of the control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_type_config.html">Webix
     * API Reference</a>
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

    /**
     * Set adds validation to the field<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_validate_config.html">Webix
     * API Reference</a>
     * 
     * @param validate
     */
    public void setValidate( Boolean validate )
    {
        this.validate = validate;
    } //-- void setValidate( Boolean )

    /**
     * Set on which event validation fires<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_validateevent_config.html">Webix
     * API Reference</a>
     * 
     * @param validateEvent
     */
    public void setValidateEvent( String validateEvent )
    {
        this.validateEvent = validateEvent;
    } //-- void setValidateEvent( String )

    /**
     * Set sets the initial value for a control<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.datepicker_value_config.html">Webix
     * API Reference</a>
     * 
     * @param value
     */
    public void setValue( UnknownType value )
    {
        this.value = value;
    } //-- void setValue( UnknownType )

}
