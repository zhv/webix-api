// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.auxiliary;

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
 * A static text that is rendered in the absolutely positioned
 * container.
 * Generally, the component isn't intended for direct
 * initialization. But if you decide to use it, use mouse events
 * (onMouseOut, onMouseIn, onMouseMove etc.) to show/hide the
 * tooltip box in the specified position. Check <a
 * href="http://docs.webix.com/desktop__tooltip.html">tooltip</a>
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
@com.webix.ui.model.WebixName("tooltip")
@javax.xml.bind.annotation.XmlRootElement
public class Tooltip
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The id or node, whose content will be moved to the view<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.tooltip_content_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("id|element")
    private String content;

    /**
     * The left offset of the tooltip from the mouse pointer<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.tooltip_dx_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer dx;

    /**
     * The top offset of the tooltip from the mouse pointer<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.tooltip_dy_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer dy;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the id or node, whose content will be moved to the
     * view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tooltip_content_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getContent()
    {
        return this.content;
    } //-- String getContent()

    /**
     * Get the left offset of the tooltip from the mouse pointer<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.tooltip_dx_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getDx()
    {
        return this.dx;
    } //-- Integer getDx()

    /**
     * Get the top offset of the tooltip from the mouse pointer<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.tooltip_dy_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getDy()
    {
        return this.dy;
    } //-- Integer getDy()

    /**
     * Set the id or node, whose content will be moved to the
     * view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tooltip_content_config.html">Webix
     * API Reference</a>
     * 
     * @param content
     */
    public void setContent( String content )
    {
        this.content = content;
    } //-- void setContent( String )

    /**
     * Set the left offset of the tooltip from the mouse pointer<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.tooltip_dx_config.html">Webix
     * API Reference</a>
     * 
     * @param dx
     */
    public void setDx( Integer dx )
    {
        this.dx = dx;
    } //-- void setDx( Integer )

    /**
     * Set the top offset of the tooltip from the mouse pointer<br
     * /><br /><a
     * href="http://docs.webix.com/api__ui.tooltip_dy_config.html">Webix
     * API Reference</a>
     * 
     * @param dy
     */
    public void setDy( Integer dy )
    {
        this.dy = dy;
    } //-- void setDy( Integer )

}
