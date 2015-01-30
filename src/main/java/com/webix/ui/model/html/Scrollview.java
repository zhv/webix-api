// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.html;

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
 * A container with scrolls.Place it in the layout if you want to
 * have a scroll around few other views (not necessary if you need
 * a scroll in one single view). Check <a
 * href="http://docs.webix.com/desktop__scrollview.html">scrollview</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_AFTER_SCROLL,
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DESTRUCT,
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
@com.webix.ui.model.WebixName("scrollview")
@javax.xml.bind.annotation.XmlRootElement
public class Scrollview
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The view object that needs scrolling<br /><br /><a
     * href="http://docs.webix.com/api__ui.scrollview_body_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private View body;

    /**
     * Enables/disables the scroll bar<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.scrollview_scroll_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|string")
    private String scroll;

    /**
     * The time during which the component is scrolled to the
     * specified position (in milliseconds)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.scrollview_scrollspeed_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String scrollSpeed;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the view object that needs scrolling<br /><br /><a
     * href="http://docs.webix.com/api__ui.scrollview_body_config.html">Webix
     * API Reference</a>
     * 
     * @return View
     */
    public View getBody()
    {
        return this.body;
    } //-- View getBody()

    /**
     * Get enables/disables the scroll bar<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.scrollview_scroll_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.scrollview_scrollspeed_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getScrollSpeed()
    {
        return this.scrollSpeed;
    } //-- String getScrollSpeed()

    /**
     * Set the view object that needs scrolling<br /><br /><a
     * href="http://docs.webix.com/api__ui.scrollview_body_config.html">Webix
     * API Reference</a>
     * 
     * @param body
     */
    public void setBody( View body )
    {
        this.body = body;
    } //-- void setBody( View )

    /**
     * Set enables/disables the scroll bar<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.scrollview_scroll_config.html">Webix
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
     * href="http://docs.webix.com/api__link__ui.scrollview_scrollspeed_config.html">Webix
     * API Reference</a>
     * 
     * @param scrollSpeed
     */
    public void setScrollSpeed( String scrollSpeed )
    {
        this.scrollSpeed = scrollSpeed;
    } //-- void setScrollSpeed( String )

}
