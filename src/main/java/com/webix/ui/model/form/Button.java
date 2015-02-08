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
 * A clickable button.
 * The control has a collection of preset looks and can be used
 * both as a stand-alone view and as a part of a form or toolbar.
 * Fully customizable. Check <a
 * href="http://docs.webix.com/desktop__controls.html#button">button</a>
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
@com.webix.ui.model.WebixName("button")
@javax.xml.bind.annotation.XmlRootElement
public class Button
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The alignment of the control within the parent container<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.button_align_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String align;

    /**
     * Click action handler<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_click_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("functor")
    private String click;

    /**
     * The id or node, whose content will be moved to the view<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.button_content_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("id|element")
    private String content;

    /**
     * Sets a hotkey that triggers button clicking<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_hotkey_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String hotkey;

    /**
     * The height of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_inputheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer inputHeight;

    /**
     * The width of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_inputwidth_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer inputWidth;

    /**
     * The text label of the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_label_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String label;

    /**
     * Positions label above the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_labelposition_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String labelPosition;

    /**
     * Name of the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_name_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String name;

    /**
     * Allows to attach pop-up menu to the button<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_popup_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private String popup;

    /**
     * Defines whether the control will be included in the tab
     * navigation order<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_tabfocus_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean tabFocus;

    /**
     * Tooltip for the input<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_tooltip_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String tooltip;

    /**
     * The type of the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_type_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String type;

    /**
     * Sets the initial value for a control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_value_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_align_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getAlign()
    {
        return this.align;
    } //-- String getAlign()

    /**
     * Get click action handler<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_click_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.button_content_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getContent()
    {
        return this.content;
    } //-- String getContent()

    /**
     * Get sets a hotkey that triggers button clicking<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.button_hotkey_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getHotkey()
    {
        return this.hotkey;
    } //-- String getHotkey()

    /**
     * Get the height of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_inputheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getInputHeight()
    {
        return this.inputHeight;
    } //-- Integer getInputHeight()

    /**
     * Get the width of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_inputwidth_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_label_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_labelposition_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getLabelPosition()
    {
        return this.labelPosition;
    } //-- String getLabelPosition()

    /**
     * Get name of the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_name_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get allows to attach pop-up menu to the button<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_popup_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getPopup()
    {
        return this.popup;
    } //-- String getPopup()

    /**
     * Get tooltip for the input<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_tooltip_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_type_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Get sets the initial value for a control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_value_config.html">Webix
     * API Reference</a>
     * 
     * @return UnknownType
     */
    public UnknownType getValue()
    {
        return this.value;
    } //-- UnknownType getValue()

    /**
     * Get defines whether the control will be included in the tab
     * navigation order<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_tabfocus_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isTabFocus()
    {
        return this.tabFocus;
    } //-- Boolean isTabFocus()

    /**
     * Set the alignment of the control within the parent
     * container<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_align_config.html">Webix
     * API Reference</a>
     * 
     * @param align
     */
    public void setAlign( String align )
    {
        this.align = align;
    } //-- void setAlign( String )

    /**
     * Set click action handler<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_click_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.button_content_config.html">Webix
     * API Reference</a>
     * 
     * @param content
     */
    public void setContent( String content )
    {
        this.content = content;
    } //-- void setContent( String )

    /**
     * Set sets a hotkey that triggers button clicking<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.button_hotkey_config.html">Webix
     * API Reference</a>
     * 
     * @param hotkey
     */
    public void setHotkey( String hotkey )
    {
        this.hotkey = hotkey;
    } //-- void setHotkey( String )

    /**
     * Set the height of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_inputheight_config.html">Webix
     * API Reference</a>
     * 
     * @param inputHeight
     */
    public void setInputHeight( Integer inputHeight )
    {
        this.inputHeight = inputHeight;
    } //-- void setInputHeight( Integer )

    /**
     * Set the width of the input area, or a button's text value
     * area.<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_inputwidth_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_label_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_labelposition_config.html">Webix
     * API Reference</a>
     * 
     * @param labelPosition
     */
    public void setLabelPosition( String labelPosition )
    {
        this.labelPosition = labelPosition;
    } //-- void setLabelPosition( String )

    /**
     * Set name of the control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_name_config.html">Webix
     * API Reference</a>
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set allows to attach pop-up menu to the button<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_popup_config.html">Webix
     * API Reference</a>
     * 
     * @param popup
     */
    public void setPopup( String popup )
    {
        this.popup = popup;
    } //-- void setPopup( String )

    /**
     * Set defines whether the control will be included in the tab
     * navigation order<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_tabfocus_config.html">Webix
     * API Reference</a>
     * 
     * @param tabFocus
     */
    public void setTabFocus( Boolean tabFocus )
    {
        this.tabFocus = tabFocus;
    } //-- void setTabFocus( Boolean )

    /**
     * Set tooltip for the input<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_tooltip_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.button_type_config.html">Webix
     * API Reference</a>
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

    /**
     * Set sets the initial value for a control<br /><br /><a
     * href="http://docs.webix.com/api__ui.button_value_config.html">Webix
     * API Reference</a>
     * 
     * @param value
     */
    public void setValue( UnknownType value )
    {
        this.value = value;
    } //-- void setValue( UnknownType )

}
