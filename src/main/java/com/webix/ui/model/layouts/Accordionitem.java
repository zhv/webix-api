// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.layouts;

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





/**
 * 
 * A singular pane of the accordion component.
 * Each accordion pane consists of the header and body. The body of
 * a pane can be collapsed/expanded by clicking on the appropriate
 * header. Check <a
 * href="http://docs.webix.com/desktop__accordionitem.html">accordionitem</a>
 * documentation for more detailed description.
 * 
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_AFTER_CONTEXT_MENU,
    com.webix.ui.model.Event.ON_AFTER_SCROLL,
    com.webix.ui.model.Event.ON_BEFORE_CONTEXT_MENU,
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DESTRUCT,
    com.webix.ui.model.Event.ON_ITEM_CLICK,
    com.webix.ui.model.Event.ON_ITEM_DBL_CLICK,
    com.webix.ui.model.Event.ON_KEY_PRESS,
    com.webix.ui.model.Event.ON_LONG_TOUCH,
    com.webix.ui.model.Event.ON_MOUSE_MOVE,
    com.webix.ui.model.Event.ON_MOUSE_MOVING,
    com.webix.ui.model.Event.ON_MOUSE_OUT,
    com.webix.ui.model.Event.ON_SWIPE_X,
    com.webix.ui.model.Event.ON_SWIPE_Y,
    com.webix.ui.model.Event.ON_TIMED_KEY_PRESS,
    com.webix.ui.model.Event.ON_TOUCH_END,
    com.webix.ui.model.Event.ON_TOUCH_MOVE,
    com.webix.ui.model.Event.ON_TOUCH_START,
    com.webix.ui.model.Event.ON_VIEW_RESIZE
})
@com.webix.ui.model.WebixName("accordionitem")
@javax.xml.bind.annotation.XmlRootElement
public class Accordionitem
    extends Baselayout
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Defines the cell content (a view or some HTML)<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_body_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|view")
    private View body;

    /**
     * Displays the cell collapsed initially<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_collapsed_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean collapsed;

    /**
     * Sets the label of the header in the expanded state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_header_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string|function")
    private String header;

    /**
     * Sets the label of the header in the collapsed state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headeralt_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|function")
    private String headerAlt;

    /**
     * The height of the header in the collapsed state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headeraltheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer headerAltHeight;

    /**
     * The header height<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headerheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer headerHeight;

    /**
     * The delay between a real mouse action and invoking the
     * related events<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_mouseeventdelay_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer mouseEventDelay;

    /**
     * Attaches a click behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_onclick_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("hash")
    private java.util.Map<String, String> onClick;

    /**
     * A property used to define custom context-click (right click)
     * handlers for elements in the DataTable cells<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_oncontext_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("hash")
    private java.util.Map<String, String> onContext;

    /**
     * Attaches a dblclick behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_ondblclick_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private java.util.Map<String, String> onDblClick;

    /**
     * Attaches a mousemove behaviour for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_onmousemove_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private java.util.Map<String, String> onMouseMove;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get defines the cell content (a view or some HTML)<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_body_config.html">Webix
     * API Reference</a>
     * 
     * @return View
     */
    public View getBody()
    {
        return this.body;
    } //-- View getBody()

    /**
     * Get sets the label of the header in the expanded state<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_header_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getHeader()
    {
        return this.header;
    } //-- String getHeader()

    /**
     * Get sets the label of the header in the collapsed state<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headeralt_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getHeaderAlt()
    {
        return this.headerAlt;
    } //-- String getHeaderAlt()

    /**
     * Get the height of the header in the collapsed state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headeraltheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getHeaderAltHeight()
    {
        return this.headerAltHeight;
    } //-- Integer getHeaderAltHeight()

    /**
     * Get the header height<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headerheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getHeaderHeight()
    {
        return this.headerHeight;
    } //-- Integer getHeaderHeight()

    /**
     * Get the delay between a real mouse action and invoking the
     * related events<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_mouseeventdelay_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_onclick_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_oncontext_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_ondblclick_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_onmousemove_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getOnMouseMove()
    {
        return this.onMouseMove;
    } //-- java.util.Map<String, String> getOnMouseMove()

    /**
     * Get displays the cell collapsed initially<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_collapsed_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isCollapsed()
    {
        return this.collapsed;
    } //-- Boolean isCollapsed()

    /**
     * Set defines the cell content (a view or some HTML)<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_body_config.html">Webix
     * API Reference</a>
     * 
     * @param body
     */
    public void setBody( View body )
    {
        this.body = body;
    } //-- void setBody( View )

    /**
     * Set displays the cell collapsed initially<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_collapsed_config.html">Webix
     * API Reference</a>
     * 
     * @param collapsed
     */
    public void setCollapsed( Boolean collapsed )
    {
        this.collapsed = collapsed;
    } //-- void setCollapsed( Boolean )

    /**
     * Set sets the label of the header in the expanded state<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_header_config.html">Webix
     * API Reference</a>
     * 
     * @param header
     */
    public void setHeader( String header )
    {
        this.header = header;
    } //-- void setHeader( String )

    /**
     * Set sets the label of the header in the collapsed state<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headeralt_config.html">Webix
     * API Reference</a>
     * 
     * @param headerAlt
     */
    public void setHeaderAlt( String headerAlt )
    {
        this.headerAlt = headerAlt;
    } //-- void setHeaderAlt( String )

    /**
     * Set the height of the header in the collapsed state<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headeraltheight_config.html">Webix
     * API Reference</a>
     * 
     * @param headerAltHeight
     */
    public void setHeaderAltHeight( Integer headerAltHeight )
    {
        this.headerAltHeight = headerAltHeight;
    } //-- void setHeaderAltHeight( Integer )

    /**
     * Set the header height<br /><br /><a
     * href="http://docs.webix.com/api__ui.accordionitem_headerheight_config.html">Webix
     * API Reference</a>
     * 
     * @param headerHeight
     */
    public void setHeaderHeight( Integer headerHeight )
    {
        this.headerHeight = headerHeight;
    } //-- void setHeaderHeight( Integer )

    /**
     * Set the delay between a real mouse action and invoking the
     * related events<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_mouseeventdelay_config.html">Webix
     * API Reference</a>
     * 
     * @param mouseEventDelay
     */
    public void setMouseEventDelay( Integer mouseEventDelay )
    {
        this.mouseEventDelay = mouseEventDelay;
    } //-- void setMouseEventDelay( Integer )

    /**
     * Set attaches a click behavior for component items with the
     * specified CSS class.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.accordionitem_onclick_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_oncontext_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_ondblclick_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.accordionitem_onmousemove_config.html">Webix
     * API Reference</a>
     * 
     * @param onMouseMove
     */
    public void setOnMouseMove( java.util.Map<String, String> onMouseMove )
    {
        this.onMouseMove = onMouseMove;
    } //-- void setOnMouseMove( java.util.Map<String, String> )

}
