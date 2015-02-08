// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model;

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
 * The very base class for UI components.
 * The class defines properties, methods, and events related to
 * loading and rendering data. Can serves as the base class while
 * creating custom multi-item components. Not intended for direct
 * initialization.
 * 
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_AFTER_ADD,
    com.webix.ui.model.Event.ON_AFTER_DELETE,
    com.webix.ui.model.Event.ON_AFTER_LOAD,
    com.webix.ui.model.Event.ON_AFTER_RENDER,
    com.webix.ui.model.Event.ON_AFTER_SCROLL,
    com.webix.ui.model.Event.ON_AFTER_SORT,
    com.webix.ui.model.Event.ON_BEFORE_ADD,
    com.webix.ui.model.Event.ON_BEFORE_DELETE,
    com.webix.ui.model.Event.ON_BEFORE_LOAD,
    com.webix.ui.model.Event.ON_BEFORE_RENDER,
    com.webix.ui.model.Event.ON_BEFORE_SORT,
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DATA_REQUEST,
    com.webix.ui.model.Event.ON_DATA_UPDATE,
    com.webix.ui.model.Event.ON_DESTRUCT,
    com.webix.ui.model.Event.ON_ITEM_RENDER,
    com.webix.ui.model.Event.ON_KEY_PRESS,
    com.webix.ui.model.Event.ON_LOAD_ERROR,
    com.webix.ui.model.Event.ON_LONG_TOUCH,
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
@com.webix.ui.model.WebixName("proto")
@javax.xml.bind.annotation.XmlRootElement
public class Proto
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Defines or disables view change animation.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_animate_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool|object")
    private AnimateConfig animate;

    /**
     * Used to hide the component borders<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_borderless_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean borderless;

    /**
     * An html container (or its id) where the component needs
     * initializing<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_container_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("element")
    private String container;

    /**
     * The name of a css class that will be applied to the view
     * container<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_css_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String css;

    /**
     * JavaScript array containing data for the component<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_data_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|array")
    private String data;

    /**
     * The URL that the component will use to reload data during
     * binding<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_datafeed_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|function")
    private String dataFeed;

    /**
     * The type of loaded data<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_datatype_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String datatype;

    /**
     * Indicates whether an item is enabled or not<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_disabled_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean disabled;

    /**
     * Sets the view gravity (1 by default)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_gravity_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer gravity;

    /**
     * Sets the height of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_height_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer height;

    /**
     * Defines whether the view will be hidden initially<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_hidden_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean hidden;

    /**
     * The component ID<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_id_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("id")
    private String id;

    /**
     * Sets the maximum height for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_maxheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer maxHeight;

    /**
     * Sets the maximum width for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_maxwidth_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer maxWidth;

    /**
     * Sets the minimal height for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_minheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer minHeight;

    /**
     * Sets the minimal width for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_minwidth_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer minWidth;

    /**
     * Allows attaching custom handlers to inner events of the
     * component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_on_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private java.util.Map<com.webix.ui.model.Event, String> on;

    /**
     * Defines paging configuration ( creates a 'ui.pager'
     * object)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_pager_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private Pager pager;

    /**
     * Event handler called just after the component has been
     * completely initialized<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_ready_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("function")
    private String ready;

    /**
     * Defines how to treat items in case of reloading<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_removemissed_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean removeMissed;

    /**
     * Defines URLs for data saving<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_save_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String save;

    /**
     * Defines schemes for data processing<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_scheme_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private java.util.Map<String, String> scheme;

    /**
     * The URL the component will use to load data after its
     * initialization<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_url_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String url;

    /**
     * Sets the width of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_width_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer width;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get defines or disables view change animation.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_animate_config.html">Webix
     * API Reference</a>
     * 
     * @return AnimateConfig
     */
    public AnimateConfig getAnimate()
    {
        return this.animate;
    } //-- AnimateConfig getAnimate()

    /**
     * Get an html container (or its id) where the component needs
     * initializing<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_container_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getContainer()
    {
        return this.container;
    } //-- String getContainer()

    /**
     * Get the name of a css class that will be applied to the view
     * container<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_css_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getCss()
    {
        return this.css;
    } //-- String getCss()

    /**
     * Get javaScript array containing data for the component<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_data_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getData()
    {
        return this.data;
    } //-- String getData()

    /**
     * Get the URL that the component will use to reload data
     * during binding<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_datafeed_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getDataFeed()
    {
        return this.dataFeed;
    } //-- String getDataFeed()

    /**
     * Get the type of loaded data<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_datatype_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getDatatype()
    {
        return this.datatype;
    } //-- String getDatatype()

    /**
     * Get sets the view gravity (1 by default)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_gravity_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getGravity()
    {
        return this.gravity;
    } //-- Integer getGravity()

    /**
     * Get sets the height of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_height_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getHeight()
    {
        return this.height;
    } //-- Integer getHeight()

    /**
     * Get the component ID<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_id_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Get sets the maximum height for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_maxheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMaxHeight()
    {
        return this.maxHeight;
    } //-- Integer getMaxHeight()

    /**
     * Get sets the maximum width for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_maxwidth_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMaxWidth()
    {
        return this.maxWidth;
    } //-- Integer getMaxWidth()

    /**
     * Get sets the minimal height for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_minheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMinHeight()
    {
        return this.minHeight;
    } //-- Integer getMinHeight()

    /**
     * Get sets the minimal width for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_minwidth_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMinWidth()
    {
        return this.minWidth;
    } //-- Integer getMinWidth()

    /**
     * Get allows attaching custom handlers to inner events of the
     * component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_on_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<com.webix.ui.model.Event, String>
     */
    public java.util.Map<com.webix.ui.model.Event, String> getOn()
    {
        return this.on;
    } //-- java.util.Map<com.webix.ui.model.Event, String> getOn()

    /**
     * Get defines paging configuration ( creates a 'ui.pager'
     * object)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_pager_config.html">Webix
     * API Reference</a>
     * 
     * @return Pager
     */
    public Pager getPager()
    {
        return this.pager;
    } //-- Pager getPager()

    /**
     * Get event handler called just after the component has been
     * completely initialized<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_ready_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getReady()
    {
        return this.ready;
    } //-- String getReady()

    /**
     * Get defines URLs for data saving<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_save_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getSave()
    {
        return this.save;
    } //-- String getSave()

    /**
     * Get defines schemes for data processing<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_scheme_config.html">Webix
     * API Reference</a>
     * 
     * @return java.util.Map<String, String>
     */
    public java.util.Map<String, String> getScheme()
    {
        return this.scheme;
    } //-- java.util.Map<String, String> getScheme()

    /**
     * Get the URL the component will use to load data after its
     * initialization<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_url_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Get sets the width of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_width_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getWidth()
    {
        return this.width;
    } //-- Integer getWidth()

    /**
     * Get used to hide the component borders<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_borderless_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isBorderless()
    {
        return this.borderless;
    } //-- Boolean isBorderless()

    /**
     * Get indicates whether an item is enabled or not<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_disabled_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isDisabled()
    {
        return this.disabled;
    } //-- Boolean isDisabled()

    /**
     * Get defines whether the view will be hidden initially<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_hidden_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isHidden()
    {
        return this.hidden;
    } //-- Boolean isHidden()

    /**
     * Get defines how to treat items in case of reloading<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_removemissed_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isRemoveMissed()
    {
        return this.removeMissed;
    } //-- Boolean isRemoveMissed()

    /**
     * Set defines or disables view change animation.<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_animate_config.html">Webix
     * API Reference</a>
     * 
     * @param animate
     */
    public void setAnimate( AnimateConfig animate )
    {
        this.animate = animate;
    } //-- void setAnimate( AnimateConfig )

    /**
     * Set used to hide the component borders<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_borderless_config.html">Webix
     * API Reference</a>
     * 
     * @param borderless
     */
    public void setBorderless( Boolean borderless )
    {
        this.borderless = borderless;
    } //-- void setBorderless( Boolean )

    /**
     * Set an html container (or its id) where the component needs
     * initializing<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_container_config.html">Webix
     * API Reference</a>
     * 
     * @param container
     */
    public void setContainer( String container )
    {
        this.container = container;
    } //-- void setContainer( String )

    /**
     * Set the name of a css class that will be applied to the view
     * container<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_css_config.html">Webix
     * API Reference</a>
     * 
     * @param css
     */
    public void setCss( String css )
    {
        this.css = css;
    } //-- void setCss( String )

    /**
     * Set javaScript array containing data for the component<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_data_config.html">Webix
     * API Reference</a>
     * 
     * @param data
     */
    public void setData( String data )
    {
        this.data = data;
    } //-- void setData( String )

    /**
     * Set the URL that the component will use to reload data
     * during binding<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_datafeed_config.html">Webix
     * API Reference</a>
     * 
     * @param dataFeed
     */
    public void setDataFeed( String dataFeed )
    {
        this.dataFeed = dataFeed;
    } //-- void setDataFeed( String )

    /**
     * Set the type of loaded data<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_datatype_config.html">Webix
     * API Reference</a>
     * 
     * @param datatype
     */
    public void setDatatype( String datatype )
    {
        this.datatype = datatype;
    } //-- void setDatatype( String )

    /**
     * Set indicates whether an item is enabled or not<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_disabled_config.html">Webix
     * API Reference</a>
     * 
     * @param disabled
     */
    public void setDisabled( Boolean disabled )
    {
        this.disabled = disabled;
    } //-- void setDisabled( Boolean )

    /**
     * Set sets the view gravity (1 by default)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_gravity_config.html">Webix
     * API Reference</a>
     * 
     * @param gravity
     */
    public void setGravity( Integer gravity )
    {
        this.gravity = gravity;
    } //-- void setGravity( Integer )

    /**
     * Set sets the height of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_height_config.html">Webix
     * API Reference</a>
     * 
     * @param height
     */
    public void setHeight( Integer height )
    {
        this.height = height;
    } //-- void setHeight( Integer )

    /**
     * Set defines whether the view will be hidden initially<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_hidden_config.html">Webix
     * API Reference</a>
     * 
     * @param hidden
     */
    public void setHidden( Boolean hidden )
    {
        this.hidden = hidden;
    } //-- void setHidden( Boolean )

    /**
     * Set the component ID<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_id_config.html">Webix
     * API Reference</a>
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set sets the maximum height for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_maxheight_config.html">Webix
     * API Reference</a>
     * 
     * @param maxHeight
     */
    public void setMaxHeight( Integer maxHeight )
    {
        this.maxHeight = maxHeight;
    } //-- void setMaxHeight( Integer )

    /**
     * Set sets the maximum width for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_maxwidth_config.html">Webix
     * API Reference</a>
     * 
     * @param maxWidth
     */
    public void setMaxWidth( Integer maxWidth )
    {
        this.maxWidth = maxWidth;
    } //-- void setMaxWidth( Integer )

    /**
     * Set sets the minimal height for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_minheight_config.html">Webix
     * API Reference</a>
     * 
     * @param minHeight
     */
    public void setMinHeight( Integer minHeight )
    {
        this.minHeight = minHeight;
    } //-- void setMinHeight( Integer )

    /**
     * Set sets the minimal width for the view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_minwidth_config.html">Webix
     * API Reference</a>
     * 
     * @param minWidth
     */
    public void setMinWidth( Integer minWidth )
    {
        this.minWidth = minWidth;
    } //-- void setMinWidth( Integer )

    /**
     * Set allows attaching custom handlers to inner events of the
     * component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_on_config.html">Webix
     * API Reference</a>
     * 
     * @param on
     */
    public void setOn( java.util.Map<com.webix.ui.model.Event, String> on )
    {
        this.on = on;
    } //-- void setOn( java.util.Map<com.webix.ui.model.Event, String> )

    /**
     * Set defines paging configuration ( creates a 'ui.pager'
     * object)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_pager_config.html">Webix
     * API Reference</a>
     * 
     * @param pager
     */
    public void setPager( Pager pager )
    {
        this.pager = pager;
    } //-- void setPager( Pager )

    /**
     * Set event handler called just after the component has been
     * completely initialized<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_ready_config.html">Webix
     * API Reference</a>
     * 
     * @param ready
     */
    public void setReady( String ready )
    {
        this.ready = ready;
    } //-- void setReady( String )

    /**
     * Set defines how to treat items in case of reloading<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.proto_removemissed_config.html">Webix
     * API Reference</a>
     * 
     * @param removeMissed
     */
    public void setRemoveMissed( Boolean removeMissed )
    {
        this.removeMissed = removeMissed;
    } //-- void setRemoveMissed( Boolean )

    /**
     * Set defines URLs for data saving<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_save_config.html">Webix
     * API Reference</a>
     * 
     * @param save
     */
    public void setSave( String save )
    {
        this.save = save;
    } //-- void setSave( String )

    /**
     * Set defines schemes for data processing<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_scheme_config.html">Webix
     * API Reference</a>
     * 
     * @param scheme
     */
    public void setScheme( java.util.Map<String, String> scheme )
    {
        this.scheme = scheme;
    } //-- void setScheme( java.util.Map<String, String> )

    /**
     * Set the URL the component will use to load data after its
     * initialization<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_url_config.html">Webix
     * API Reference</a>
     * 
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    /**
     * Set sets the width of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.proto_width_config.html">Webix
     * API Reference</a>
     * 
     * @param width
     */
    public void setWidth( Integer width )
    {
        this.width = width;
    } //-- void setWidth( Integer )

}
