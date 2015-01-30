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
 * A container control with a navigation tab panel that keeps a set
 * of views and displays one view at a time.The component optimizes
 * the process of creating tabbed structures on the page - elements
 * that present multiple groups of content switched by tabs. Check
 * <a
 * href="http://docs.webix.com/desktop__tabview.html">tabview</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DESTRUCT
})
@com.webix.ui.model.WebixName("tabview")
@javax.xml.bind.annotation.XmlRootElement
public class Tabview
    extends Baselayout
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field cells.
     */
    @com.webix.ui.model.WebixType("array")
    private java.util.List<View> cells;

    /**
     * Masks IDs of all inner element<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_isolate_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("boolean")
    private Boolean isolate;

    /**
     * Defines the space around elements (applies the specified
     * value to all elements)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_margin_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer margin;

    /**
     * Allows to configure multiview part of tabview<br /><br /><a
     * href="http://docs.webix.com/api__ui.tabview_multiview_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private View multiview;

    /**
     * Defines the space between the element borders and content
     * (applies the specified value to all sides).<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_padding_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer padding;

    /**
     * Sets the right and left padding (applies the specified value
     * to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_paddingx_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer paddingX;

    /**
     * Sets the top and bottom padding (applies the specified value
     * to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_paddingy_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer paddingY;

    /**
     * Allows to configure tabbar part of tabview<br /><br /><a
     * href="http://docs.webix.com/api__ui.tabview_tabbar_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private UnknownType tabbar;

    /**
     * Defines the layout borders<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_type_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String type;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getCells.
     * 
     * @return List
     */
    public java.util.List<View> getCells()
    {
        if ( this.cells == null )
        {
            this.cells = new java.util.ArrayList<View>();
        }

        return this.cells;
    } //-- java.util.List<View> getCells()

    /**
     * Get defines the space around elements (applies the specified
     * value to all elements)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_margin_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMargin()
    {
        return this.margin;
    } //-- Integer getMargin()

    /**
     * Get allows to configure multiview part of tabview<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.tabview_multiview_config.html">Webix
     * API Reference</a>
     * 
     * @return View
     */
    public View getMultiview()
    {
        return this.multiview;
    } //-- View getMultiview()

    /**
     * Get defines the space between the element borders and
     * content (applies the specified value to all sides).<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.tabview_padding_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getPadding()
    {
        return this.padding;
    } //-- Integer getPadding()

    /**
     * Get sets the right and left padding (applies the specified
     * value to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_paddingx_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getPaddingX()
    {
        return this.paddingX;
    } //-- Integer getPaddingX()

    /**
     * Get sets the top and bottom padding (applies the specified
     * value to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_paddingy_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getPaddingY()
    {
        return this.paddingY;
    } //-- Integer getPaddingY()

    /**
     * Get allows to configure tabbar part of tabview<br /><br /><a
     * href="http://docs.webix.com/api__ui.tabview_tabbar_config.html">Webix
     * API Reference</a>
     * 
     * @return UnknownType
     */
    public UnknownType getTabbar()
    {
        return this.tabbar;
    } //-- UnknownType getTabbar()

    /**
     * Get defines the layout borders<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_type_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Get masks IDs of all inner element<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_isolate_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isIsolate()
    {
        return this.isolate;
    } //-- Boolean isIsolate()

    /**
     * Set defines content of tabview<br /><br /><a
     * href="http://docs.webix.com/api__ui.tabview_cells_config.html">Webix
     * API Reference</a>
     * 
     * @param cells
     */
    public void setCells( java.util.List<View> cells )
    {
        this.cells = cells;
    } //-- void setCells( java.util.List )

    /**
     * Set masks IDs of all inner element<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_isolate_config.html">Webix
     * API Reference</a>
     * 
     * @param isolate
     */
    public void setIsolate( Boolean isolate )
    {
        this.isolate = isolate;
    } //-- void setIsolate( Boolean )

    /**
     * Set defines the space around elements (applies the specified
     * value to all elements)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_margin_config.html">Webix
     * API Reference</a>
     * 
     * @param margin
     */
    public void setMargin( Integer margin )
    {
        this.margin = margin;
    } //-- void setMargin( Integer )

    /**
     * Set allows to configure multiview part of tabview<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.tabview_multiview_config.html">Webix
     * API Reference</a>
     * 
     * @param multiview
     */
    public void setMultiview( View multiview )
    {
        this.multiview = multiview;
    } //-- void setMultiview( View )

    /**
     * Set defines the space between the element borders and
     * content (applies the specified value to all sides).<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.tabview_padding_config.html">Webix
     * API Reference</a>
     * 
     * @param padding
     */
    public void setPadding( Integer padding )
    {
        this.padding = padding;
    } //-- void setPadding( Integer )

    /**
     * Set sets the right and left padding (applies the specified
     * value to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_paddingx_config.html">Webix
     * API Reference</a>
     * 
     * @param paddingX
     */
    public void setPaddingX( Integer paddingX )
    {
        this.paddingX = paddingX;
    } //-- void setPaddingX( Integer )

    /**
     * Set sets the top and bottom padding (applies the specified
     * value to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_paddingy_config.html">Webix
     * API Reference</a>
     * 
     * @param paddingY
     */
    public void setPaddingY( Integer paddingY )
    {
        this.paddingY = paddingY;
    } //-- void setPaddingY( Integer )

    /**
     * Set allows to configure tabbar part of tabview<br /><br /><a
     * href="http://docs.webix.com/api__ui.tabview_tabbar_config.html">Webix
     * API Reference</a>
     * 
     * @param tabbar
     */
    public void setTabbar( UnknownType tabbar )
    {
        this.tabbar = tabbar;
    } //-- void setTabbar( UnknownType )

    /**
     * Set defines the layout borders<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.tabview_type_config.html">Webix
     * API Reference</a>
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

}
