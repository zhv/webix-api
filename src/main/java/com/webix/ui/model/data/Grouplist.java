// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.data;

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
import com.webix.ui.model.form.Button;
import com.webix.ui.model.form.Checkbox;
import com.webix.ui.model.form.Colorpicker;
import com.webix.ui.model.form.Combo;
import com.webix.ui.model.form.Counter;
import com.webix.ui.model.form.Datepicker;
import com.webix.ui.model.form.Fieldset;
import com.webix.ui.model.form.Icon;
import com.webix.ui.model.form.Label;
import com.webix.ui.model.form.Multiselect;
import com.webix.ui.model.form.Multitext;
import com.webix.ui.model.form.Radio;
import com.webix.ui.model.form.Richselect;
import com.webix.ui.model.form.Search;
import com.webix.ui.model.form.Segmented;
import com.webix.ui.model.form.Select;
import com.webix.ui.model.form.Slider;
import com.webix.ui.model.form.Tabbar;
import com.webix.ui.model.form.Text;
import com.webix.ui.model.form.Textarea;
import com.webix.ui.model.form.Toggle;
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
 * A vertical list of items grouped into sections by some category.
 * The component provides navigation within the list and between
 * the sections. Support for various data template formats, sorting
 * and filtering features. Check <a
 * href="http://docs.webix.com/desktop__grouplist.html">grouplist</a>
 * documentation for more detailed description.
 * 
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_AFTER_ADD,
    com.webix.ui.model.Event.ON_AFTER_CONTEXT_MENU,
    com.webix.ui.model.Event.ON_AFTER_DELETE,
    com.webix.ui.model.Event.ON_AFTER_DROP,
    com.webix.ui.model.Event.ON_AFTER_LOAD,
    com.webix.ui.model.Event.ON_AFTER_RENDER,
    com.webix.ui.model.Event.ON_AFTER_SCROLL,
    com.webix.ui.model.Event.ON_AFTER_SELECT,
    com.webix.ui.model.Event.ON_AFTER_SORT,
    com.webix.ui.model.Event.ON_BEFORE_ADD,
    com.webix.ui.model.Event.ON_BEFORE_CONTEXT_MENU,
    com.webix.ui.model.Event.ON_BEFORE_DELETE,
    com.webix.ui.model.Event.ON_BEFORE_DRAG,
    com.webix.ui.model.Event.ON_BEFORE_DRAG_IN,
    com.webix.ui.model.Event.ON_BEFORE_DROP,
    com.webix.ui.model.Event.ON_BEFORE_DROP_OUT,
    com.webix.ui.model.Event.ON_BEFORE_LOAD,
    com.webix.ui.model.Event.ON_BEFORE_RENDER,
    com.webix.ui.model.Event.ON_BEFORE_SELECT,
    com.webix.ui.model.Event.ON_BEFORE_SORT,
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DATA_REQUEST,
    com.webix.ui.model.Event.ON_DATA_UPDATE,
    com.webix.ui.model.Event.ON_DESTRUCT,
    com.webix.ui.model.Event.ON_DRAG_OUT,
    com.webix.ui.model.Event.ON_ITEM_CLICK,
    com.webix.ui.model.Event.ON_ITEM_DBL_CLICK,
    com.webix.ui.model.Event.ON_ITEM_RENDER,
    com.webix.ui.model.Event.ON_KEY_PRESS,
    com.webix.ui.model.Event.ON_LOAD_ERROR,
    com.webix.ui.model.Event.ON_LONG_TOUCH,
    com.webix.ui.model.Event.ON_MOUSE_MOVE,
    com.webix.ui.model.Event.ON_MOUSE_MOVING,
    com.webix.ui.model.Event.ON_MOUSE_OUT,
    com.webix.ui.model.Event.ON_PASTE,
    com.webix.ui.model.Event.ON_SELECT_CHANGE,
    com.webix.ui.model.Event.ON_SWIPE_X,
    com.webix.ui.model.Event.ON_SWIPE_Y,
    com.webix.ui.model.Event.ON_TIMED_KEY_PRESS,
    com.webix.ui.model.Event.ON_TOUCH_END,
    com.webix.ui.model.Event.ON_TOUCH_MOVE,
    com.webix.ui.model.Event.ON_TOUCH_START,
    com.webix.ui.model.Event.ON_VALIDATION_ERROR,
    com.webix.ui.model.Event.ON_VALIDATION_SUCCESS,
    com.webix.ui.model.Event.ON_VIEW_RESIZE
})
@com.webix.ui.model.WebixName("grouplist")
@javax.xml.bind.annotation.XmlRootElement
public class Grouplist
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Height of view will be adjusted to show all items<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_autoheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean autoheight;

    /**
     * Width of view will be adjusted to show all items<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_autowidth_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean autowidth;

    /**
     * Enables/disables clipboard support<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_clipboard_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string")
    private String clipboard;

    /**
     * Enables or disables drag-and-drop<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_drag_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string")
    private String drag;

    /**
     * Enables autoscroll of component during drag-n-drop<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_dragscroll_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string")
    private String dragscroll;

    /**
     * Allows defining custom 'move' logic for the component.<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_externaldata_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private String externalData;

    /**
     * Defines x or y orientation of layout<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_layout_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String layout;

    /**
     * The delay between a real mouse action and invoking the
     * related events<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_mouseeventdelay_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer mouseEventDelay;

    /**
     * Activates the selection keyboard navigation<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_navigation_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean navigation;

    /**
     * Attaches a click behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_onclick_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("hash")
    private java.util.Map<String, String> onClick;

    /**
     * A property used to define custom context-click (right click)
     * handlers for elements in the DataTable cells<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_oncontext_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("hash")
    private java.util.Map<String, String> onContext;

    /**
     * Attaches a dblclick behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_ondblclick_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private java.util.Map<String, String> onDblClick;

    /**
     * Attaches a mousemove behaviour for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_onmousemove_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private java.util.Map<String, String> onMouseMove;

    /**
     * Enables/disables the scroll bar<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_scroll_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string")
    private String scroll;

    /**
     * The time during which the component is scrolled to the
     * specified position (in milliseconds)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_scrollspeed_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String scrollSpeed;

    /**
     * Enables/disables item selection or multiselection in
     * grouplist<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_select_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string")
    private String select;

    /**
     * An html template that defines data that will be presented in
     * group header in the expanded state<br /><br /><a
     * href="http://docs.webix.com/api__ui.grouplist_templateback_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("template")
    private UnknownType templateBack;

    /**
     * Sets the template according to which data will be copied to
     * the clipboard<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_templatecopy_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private String templateCopy;

    /**
     * An html template that defines data that will be presented in
     * group header in the collapsed state<br /><br /><a
     * href="http://docs.webix.com/api__ui.grouplist_templategroup_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("template")
    private UnknownType templateGroup;

    /**
     * An html template that defines data that will be presented in
     * grouplist<br /><br /><a
     * href="http://docs.webix.com/api__ui.grouplist_templateitem_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("template")
    private UnknownType templateItem;

    /**
     * Defines width of view in items<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_xcount_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("int")
    private Integer xCount;

    /**
     * Defines height of view in items<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_ycount_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer yCount;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get enables/disables clipboard support<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_clipboard_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getClipboard()
    {
        return this.clipboard;
    } //-- String getClipboard()

    /**
     * Get enables or disables drag-and-drop<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_drag_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getDrag()
    {
        return this.drag;
    } //-- String getDrag()

    /**
     * Get enables autoscroll of component during drag-n-drop<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_dragscroll_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getDragscroll()
    {
        return this.dragscroll;
    } //-- String getDragscroll()

    /**
     * Get allows defining custom 'move' logic for the
     * component.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_externaldata_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getExternalData()
    {
        return this.externalData;
    } //-- String getExternalData()

    /**
     * Get defines x or y orientation of layout<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_layout_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getLayout()
    {
        return this.layout;
    } //-- String getLayout()

    /**
     * Get the delay between a real mouse action and invoking the
     * related events<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_mouseeventdelay_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMouseEventDelay()
    {
        return this.mouseEventDelay;
    } //-- Integer getMouseEventDelay()

    /**
     * Get attaches a click behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_onclick_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getOnClick()
    {
        return this.onClick;
    } //-- java.util.Map<String, String> getOnClick()

    /**
     * Get a property used to define custom context-click (right
     * click) handlers for elements in the DataTable cells<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_oncontext_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getOnContext()
    {
        return this.onContext;
    } //-- java.util.Map<String, String> getOnContext()

    /**
     * Get attaches a dblclick behavior for component items with
     * the specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_ondblclick_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getOnDblClick()
    {
        return this.onDblClick;
    } //-- java.util.Map<String, String> getOnDblClick()

    /**
     * Get attaches a mousemove behaviour for component items with
     * the specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_onmousemove_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getOnMouseMove()
    {
        return this.onMouseMove;
    } //-- java.util.Map<String, String> getOnMouseMove()

    /**
     * Get enables/disables the scroll bar<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_scroll_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getScroll()
    {
        return this.scroll;
    } //-- String getScroll()

    /**
     * Get the time during which the component is scrolled to the
     * specified position (in milliseconds)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_scrollspeed_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getScrollSpeed()
    {
        return this.scrollSpeed;
    } //-- String getScrollSpeed()

    /**
     * Get enables/disables item selection or multiselection in
     * grouplist<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_select_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getSelect()
    {
        return this.select;
    } //-- String getSelect()

    /**
     * Get an html template that defines data that will be
     * presented in group header in the expanded state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.grouplist_templateback_config.html">Webix
     * API Reference</a>
     * 
     * @return UnknownType
     */
    public UnknownType getTemplateBack()
    {
        return this.templateBack;
    } //-- UnknownType getTemplateBack()

    /**
     * Get sets the template according to which data will be copied
     * to the clipboard<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_templatecopy_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getTemplateCopy()
    {
        return this.templateCopy;
    } //-- String getTemplateCopy()

    /**
     * Get an html template that defines data that will be
     * presented in group header in the collapsed state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.grouplist_templategroup_config.html">Webix
     * API Reference</a>
     * 
     * @return UnknownType
     */
    public UnknownType getTemplateGroup()
    {
        return this.templateGroup;
    } //-- UnknownType getTemplateGroup()

    /**
     * Get an html template that defines data that will be
     * presented in grouplist<br /><br /><a
     * href="http://docs.webix.com/api__ui.grouplist_templateitem_config.html">Webix
     * API Reference</a>
     * 
     * @return UnknownType
     */
    public UnknownType getTemplateItem()
    {
        return this.templateItem;
    } //-- UnknownType getTemplateItem()

    /**
     * Get defines width of view in items<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_xcount_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getXCount()
    {
        return this.xCount;
    } //-- Integer getXCount()

    /**
     * Get defines height of view in items<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_ycount_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getYCount()
    {
        return this.yCount;
    } //-- Integer getYCount()

    /**
     * Get height of view will be adjusted to show all items<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_autoheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isAutoheight()
    {
        return this.autoheight;
    } //-- Boolean isAutoheight()

    /**
     * Get width of view will be adjusted to show all items<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_autowidth_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isAutowidth()
    {
        return this.autowidth;
    } //-- Boolean isAutowidth()

    /**
     * Get activates the selection keyboard navigation<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_navigation_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isNavigation()
    {
        return this.navigation;
    } //-- Boolean isNavigation()

    /**
     * Set height of view will be adjusted to show all items<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_autoheight_config.html">Webix
     * API Reference</a>
     * 
     * @param autoheight
     */
    public void setAutoheight( Boolean autoheight )
    {
        this.autoheight = autoheight;
    } //-- void setAutoheight( Boolean )

    /**
     * Set width of view will be adjusted to show all items<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_autowidth_config.html">Webix
     * API Reference</a>
     * 
     * @param autowidth
     */
    public void setAutowidth( Boolean autowidth )
    {
        this.autowidth = autowidth;
    } //-- void setAutowidth( Boolean )

    /**
     * Set enables/disables clipboard support<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_clipboard_config.html">Webix
     * API Reference</a>
     * 
     * @param clipboard
     */
    public void setClipboard( String clipboard )
    {
        this.clipboard = clipboard;
    } //-- void setClipboard( String )

    /**
     * Set enables or disables drag-and-drop<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_drag_config.html">Webix
     * API Reference</a>
     * 
     * @param drag
     */
    public void setDrag( String drag )
    {
        this.drag = drag;
    } //-- void setDrag( String )

    /**
     * Set enables autoscroll of component during drag-n-drop<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_dragscroll_config.html">Webix
     * API Reference</a>
     * 
     * @param dragscroll
     */
    public void setDragscroll( String dragscroll )
    {
        this.dragscroll = dragscroll;
    } //-- void setDragscroll( String )

    /**
     * Set allows defining custom 'move' logic for the
     * component.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_externaldata_config.html">Webix
     * API Reference</a>
     * 
     * @param externalData
     */
    public void setExternalData( String externalData )
    {
        this.externalData = externalData;
    } //-- void setExternalData( String )

    /**
     * Set defines x or y orientation of layout<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_layout_config.html">Webix
     * API Reference</a>
     * 
     * @param layout
     */
    public void setLayout( String layout )
    {
        this.layout = layout;
    } //-- void setLayout( String )

    /**
     * Set the delay between a real mouse action and invoking the
     * related events<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_mouseeventdelay_config.html">Webix
     * API Reference</a>
     * 
     * @param mouseEventDelay
     */
    public void setMouseEventDelay( Integer mouseEventDelay )
    {
        this.mouseEventDelay = mouseEventDelay;
    } //-- void setMouseEventDelay( Integer )

    /**
     * Set activates the selection keyboard navigation<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_navigation_config.html">Webix
     * API Reference</a>
     * 
     * @param navigation
     */
    public void setNavigation( Boolean navigation )
    {
        this.navigation = navigation;
    } //-- void setNavigation( Boolean )

    /**
     * Set attaches a click behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_onclick_config.html">Webix
     * API Reference</a>
     * 
     * @param onClick
     */
    public void setOnClick( java.util.Map<String, String> onClick )
    {
        this.onClick = onClick;
    } //-- void setOnClick( java.util.Map<String, String> )

    /**
     * Set a property used to define custom context-click (right
     * click) handlers for elements in the DataTable cells<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_oncontext_config.html">Webix
     * API Reference</a>
     * 
     * @param onContext
     */
    public void setOnContext( java.util.Map<String, String> onContext )
    {
        this.onContext = onContext;
    } //-- void setOnContext( java.util.Map<String, String> )

    /**
     * Set attaches a dblclick behavior for component items with
     * the specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_ondblclick_config.html">Webix
     * API Reference</a>
     * 
     * @param onDblClick
     */
    public void setOnDblClick( java.util.Map<String, String> onDblClick )
    {
        this.onDblClick = onDblClick;
    } //-- void setOnDblClick( java.util.Map<String, String> )

    /**
     * Set attaches a mousemove behaviour for component items with
     * the specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_onmousemove_config.html">Webix
     * API Reference</a>
     * 
     * @param onMouseMove
     */
    public void setOnMouseMove( java.util.Map<String, String> onMouseMove )
    {
        this.onMouseMove = onMouseMove;
    } //-- void setOnMouseMove( java.util.Map<String, String> )

    /**
     * Set enables/disables the scroll bar<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_scroll_config.html">Webix
     * API Reference</a>
     * 
     * @param scroll
     */
    public void setScroll( String scroll )
    {
        this.scroll = scroll;
    } //-- void setScroll( String )

    /**
     * Set the time during which the component is scrolled to the
     * specified position (in milliseconds)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_scrollspeed_config.html">Webix
     * API Reference</a>
     * 
     * @param scrollSpeed
     */
    public void setScrollSpeed( String scrollSpeed )
    {
        this.scrollSpeed = scrollSpeed;
    } //-- void setScrollSpeed( String )

    /**
     * Set enables/disables item selection or multiselection in
     * grouplist<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_select_config.html">Webix
     * API Reference</a>
     * 
     * @param select
     */
    public void setSelect( String select )
    {
        this.select = select;
    } //-- void setSelect( String )

    /**
     * Set an html template that defines data that will be
     * presented in group header in the expanded state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.grouplist_templateback_config.html">Webix
     * API Reference</a>
     * 
     * @param templateBack
     */
    public void setTemplateBack( UnknownType templateBack )
    {
        this.templateBack = templateBack;
    } //-- void setTemplateBack( UnknownType )

    /**
     * Set sets the template according to which data will be copied
     * to the clipboard<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_templatecopy_config.html">Webix
     * API Reference</a>
     * 
     * @param templateCopy
     */
    public void setTemplateCopy( String templateCopy )
    {
        this.templateCopy = templateCopy;
    } //-- void setTemplateCopy( String )

    /**
     * Set an html template that defines data that will be
     * presented in group header in the collapsed state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.grouplist_templategroup_config.html">Webix
     * API Reference</a>
     * 
     * @param templateGroup
     */
    public void setTemplateGroup( UnknownType templateGroup )
    {
        this.templateGroup = templateGroup;
    } //-- void setTemplateGroup( UnknownType )

    /**
     * Set an html template that defines data that will be
     * presented in grouplist<br /><br /><a
     * href="http://docs.webix.com/api__ui.grouplist_templateitem_config.html">Webix
     * API Reference</a>
     * 
     * @param templateItem
     */
    public void setTemplateItem( UnknownType templateItem )
    {
        this.templateItem = templateItem;
    } //-- void setTemplateItem( UnknownType )

    /**
     * Set defines width of view in items<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_xcount_config.html">Webix
     * API Reference</a>
     * 
     * @param xCount
     */
    public void setXCount( Integer xCount )
    {
        this.xCount = xCount;
    } //-- void setXCount( Integer )

    /**
     * Set defines height of view in items<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.grouplist_ycount_config.html">Webix
     * API Reference</a>
     * 
     * @param yCount
     */
    public void setYCount( Integer yCount )
    {
        this.yCount = yCount;
    } //-- void setYCount( Integer )

}
