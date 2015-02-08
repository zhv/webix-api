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
 * A vertical or horizontal layout without the headers.
 * The component allows you to programmatically define interface
 * structure by organizing views in a vertical or horizontal
 * layout. By including layouts one by one, it's possible to create
 * the final screen of any complexity. Check <a
 * href="http://docs.webix.com/desktop__layout.html">layout</a>
 * documentation for more detailed description.
 * 
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DESTRUCT
})
@com.webix.ui.model.WebixName("layout")
@javax.xml.bind.annotation.XmlRootElement
public class Layout
    extends Baselayout
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Masks IDs of all inner element<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_isolate_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("boolean")
    private Boolean isolate;

    /**
     * Defines the space around elements (applies the specified
     * value to all elements)<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_margin_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer margin;

    /**
     * Defines the space between the element borders and content
     * (applies the specified value to all sides).<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_padding_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer padding;

    /**
     * Sets the right and left padding (applies the specified value
     * to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_paddingx_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer paddingX;

    /**
     * Sets the top and bottom padding (applies the specified value
     * to both sides)<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_paddingy_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer paddingY;

    /**
     * Defines the layout borders<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_type_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String type;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get defines the space around elements (applies the specified
     * value to all elements)<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_margin_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getMargin()
    {
        return this.margin;
    } //-- Integer getMargin()

    /**
     * Get defines the space between the element borders and
     * content (applies the specified value to all sides).<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.layout_padding_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.layout_paddingx_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.layout_paddingy_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getPaddingY()
    {
        return this.paddingY;
    } //-- Integer getPaddingY()

    /**
     * Get defines the layout borders<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_type_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.layout_isolate_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isIsolate()
    {
        return this.isolate;
    } //-- Boolean isIsolate()

    /**
     * Set masks IDs of all inner element<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_isolate_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.layout_margin_config.html">Webix
     * API Reference</a>
     * 
     * @param margin
     */
    public void setMargin( Integer margin )
    {
        this.margin = margin;
    } //-- void setMargin( Integer )

    /**
     * Set defines the space between the element borders and
     * content (applies the specified value to all sides).<br /><br
     * /><a
     * href="http://docs.webix.com/api__ui.layout_padding_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.layout_paddingx_config.html">Webix
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
     * href="http://docs.webix.com/api__ui.layout_paddingy_config.html">Webix
     * API Reference</a>
     * 
     * @param paddingY
     */
    public void setPaddingY( Integer paddingY )
    {
        this.paddingY = paddingY;
    } //-- void setPaddingY( Integer )

    /**
     * Set defines the layout borders<br /><br /><a
     * href="http://docs.webix.com/api__ui.layout_type_config.html">Webix
     * API Reference</a>
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

}
