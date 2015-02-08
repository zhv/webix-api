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
 * A wrapper which renders an HTML fieldset.
 * The control presents a standard fieldset that combines several
 * sense-connected UI elements inside itself. Check <a
 * href="http://docs.webix.com/desktop__controls.html#fieldset">fieldset</a>
 * documentation for more detailed description.
 * 
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
@com.webix.ui.model.WebixName("fieldset")
@javax.xml.bind.annotation.XmlRootElement
public class Fieldset
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Config for sub-view of fieldset<br /><br /><a
     * href="http://docs.webix.com/api__ui.fieldset_body_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("view")
    private View body;

    /**
     * Legend of fieldset<br /><br /><a
     * href="http://docs.webix.com/api__ui.fieldset_label_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("")
    private String label;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get config for sub-view of fieldset<br /><br /><a
     * href="http://docs.webix.com/api__ui.fieldset_body_config.html">Webix
     * API Reference</a>
     * 
     * @return View
     */
    public View getBody()
    {
        return this.body;
    } //-- View getBody()

    /**
     * Get legend of fieldset<br /><br /><a
     * href="http://docs.webix.com/api__ui.fieldset_label_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getLabel()
    {
        return this.label;
    } //-- String getLabel()

    /**
     * Set config for sub-view of fieldset<br /><br /><a
     * href="http://docs.webix.com/api__ui.fieldset_body_config.html">Webix
     * API Reference</a>
     * 
     * @param body
     */
    public void setBody( View body )
    {
        this.body = body;
    } //-- void setBody( View )

    /**
     * Set legend of fieldset<br /><br /><a
     * href="http://docs.webix.com/api__ui.fieldset_label_config.html">Webix
     * API Reference</a>
     * 
     * @param label
     */
    public void setLabel( String label )
    {
        this.label = label;
    } //-- void setLabel( String )

}
