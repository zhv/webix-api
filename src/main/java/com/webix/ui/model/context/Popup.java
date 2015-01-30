// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.3,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.context;

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
 * A static popup window.The window can contain any content, be
 * modal or modeless. The main use case - displaying popup content
 * on some action (e.g. click). Check <a
 * href="http://docs.webix.com/desktop__popup.html">popup</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@com.webix.ui.model.WebixEvent({
    com.webix.ui.model.Event.ON_AFTER_SCROLL,
    com.webix.ui.model.Event.ON_BIND_REQUEST,
    com.webix.ui.model.Event.ON_DESTRUCT,
    com.webix.ui.model.Event.ON_HIDE,
    com.webix.ui.model.Event.ON_KEY_PRESS,
    com.webix.ui.model.Event.ON_LONG_TOUCH,
    com.webix.ui.model.Event.ON_SHOW,
    com.webix.ui.model.Event.ON_SWIPE_X,
    com.webix.ui.model.Event.ON_SWIPE_Y,
    com.webix.ui.model.Event.ON_TIMED_KEY_PRESS,
    com.webix.ui.model.Event.ON_TOUCH_END,
    com.webix.ui.model.Event.ON_TOUCH_MOVE,
    com.webix.ui.model.Event.ON_TOUCH_START,
    com.webix.ui.model.Event.ON_VIEW_MOVE,
    com.webix.ui.model.Event.ON_VIEW_MOVE_END,
    com.webix.ui.model.Event.ON_VIEW_RESIZE
})
@com.webix.ui.model.WebixName("popup")
@javax.xml.bind.annotation.XmlRootElement
public class Popup
    extends View
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Adjusts window size to the size of an html node it is
     * initiated in<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_autofit_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean autofit;

    /**
     * Sets focus on the window the moment it appears on the
     * page<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_autofocus_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean autofocus;

    /**
     * The content of window body: template or view<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_body_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|view")
    private View body;

    /**
     * Sets the view header<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_head_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object|string")
    private String head;

    /**
     * Defines the header height (43 by default)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_headheight_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer headHeight;

    /**
     * The left offset of the window<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_left_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer left;

    /**
     * Switches window modality<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_modal_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean modal;

    /**
     * Makes view movable<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_move_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("bool")
    private Boolean move;

    /**
     * Sets paddings of the chart content<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_padding_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("object")
    private PaddingConfig padding;

    /**
     * Sets position of the window relative to the the screen<br
     * /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_position_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string|function")
    private String position;

    /**
     * Positions a popup window relative to the component it's
     * connected with<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_relative_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("string")
    private String relative;

    /**
     * The top offset of a window<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_top_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer top;

    /**
     * Stack order of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_zindex_config.html">Webix
     * API Reference</a>
     */
    @com.webix.ui.model.WebixType("number")
    private Integer zIndex;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the content of window body: template or view<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.popup_body_config.html">Webix
     * API Reference</a>
     * 
     * @return View
     */
    public View getBody()
    {
        return this.body;
    } //-- View getBody()

    /**
     * Get sets the view header<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_head_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getHead()
    {
        return this.head;
    } //-- String getHead()

    /**
     * Get defines the header height (43 by default)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_headheight_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getHeadHeight()
    {
        return this.headHeight;
    } //-- Integer getHeadHeight()

    /**
     * Get the left offset of the window<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_left_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getLeft()
    {
        return this.left;
    } //-- Integer getLeft()

    /**
     * Get sets paddings of the chart content<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_padding_config.html">Webix
     * API Reference</a>
     * 
     * @return PaddingConfig
     */
    public PaddingConfig getPadding()
    {
        return this.padding;
    } //-- PaddingConfig getPadding()

    /**
     * Get sets position of the window relative to the the
     * screen<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_position_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getPosition()
    {
        return this.position;
    } //-- String getPosition()

    /**
     * Get positions a popup window relative to the component it's
     * connected with<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_relative_config.html">Webix
     * API Reference</a>
     * 
     * @return String
     */
    public String getRelative()
    {
        return this.relative;
    } //-- String getRelative()

    /**
     * Get the top offset of a window<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_top_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getTop()
    {
        return this.top;
    } //-- Integer getTop()

    /**
     * Get stack order of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_zindex_config.html">Webix
     * API Reference</a>
     * 
     * @return Integer
     */
    public Integer getZIndex()
    {
        return this.zIndex;
    } //-- Integer getZIndex()

    /**
     * Get adjusts window size to the size of an html node it is
     * initiated in<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_autofit_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isAutofit()
    {
        return this.autofit;
    } //-- Boolean isAutofit()

    /**
     * Get sets focus on the window the moment it appears on the
     * page<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_autofocus_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isAutofocus()
    {
        return this.autofocus;
    } //-- Boolean isAutofocus()

    /**
     * Get switches window modality<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_modal_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isModal()
    {
        return this.modal;
    } //-- Boolean isModal()

    /**
     * Get makes view movable<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_move_config.html">Webix
     * API Reference</a>
     * 
     * @return Boolean
     */
    public Boolean isMove()
    {
        return this.move;
    } //-- Boolean isMove()

    /**
     * Set adjusts window size to the size of an html node it is
     * initiated in<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_autofit_config.html">Webix
     * API Reference</a>
     * 
     * @param autofit
     */
    public void setAutofit( Boolean autofit )
    {
        this.autofit = autofit;
    } //-- void setAutofit( Boolean )

    /**
     * Set sets focus on the window the moment it appears on the
     * page<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_autofocus_config.html">Webix
     * API Reference</a>
     * 
     * @param autofocus
     */
    public void setAutofocus( Boolean autofocus )
    {
        this.autofocus = autofocus;
    } //-- void setAutofocus( Boolean )

    /**
     * Set the content of window body: template or view<br /><br
     * /><a
     * href="http://docs.webix.com/api__link__ui.popup_body_config.html">Webix
     * API Reference</a>
     * 
     * @param body
     */
    public void setBody( View body )
    {
        this.body = body;
    } //-- void setBody( View )

    /**
     * Set sets the view header<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_head_config.html">Webix
     * API Reference</a>
     * 
     * @param head
     */
    public void setHead( String head )
    {
        this.head = head;
    } //-- void setHead( String )

    /**
     * Set defines the header height (43 by default)<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_headheight_config.html">Webix
     * API Reference</a>
     * 
     * @param headHeight
     */
    public void setHeadHeight( Integer headHeight )
    {
        this.headHeight = headHeight;
    } //-- void setHeadHeight( Integer )

    /**
     * Set the left offset of the window<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_left_config.html">Webix
     * API Reference</a>
     * 
     * @param left
     */
    public void setLeft( Integer left )
    {
        this.left = left;
    } //-- void setLeft( Integer )

    /**
     * Set switches window modality<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_modal_config.html">Webix
     * API Reference</a>
     * 
     * @param modal
     */
    public void setModal( Boolean modal )
    {
        this.modal = modal;
    } //-- void setModal( Boolean )

    /**
     * Set makes view movable<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_move_config.html">Webix
     * API Reference</a>
     * 
     * @param move
     */
    public void setMove( Boolean move )
    {
        this.move = move;
    } //-- void setMove( Boolean )

    /**
     * Set sets paddings of the chart content<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_padding_config.html">Webix
     * API Reference</a>
     * 
     * @param padding
     */
    public void setPadding( PaddingConfig padding )
    {
        this.padding = padding;
    } //-- void setPadding( PaddingConfig )

    /**
     * Set sets position of the window relative to the the
     * screen<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_position_config.html">Webix
     * API Reference</a>
     * 
     * @param position
     */
    public void setPosition( String position )
    {
        this.position = position;
    } //-- void setPosition( String )

    /**
     * Set positions a popup window relative to the component it's
     * connected with<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_relative_config.html">Webix
     * API Reference</a>
     * 
     * @param relative
     */
    public void setRelative( String relative )
    {
        this.relative = relative;
    } //-- void setRelative( String )

    /**
     * Set the top offset of a window<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_top_config.html">Webix
     * API Reference</a>
     * 
     * @param top
     */
    public void setTop( Integer top )
    {
        this.top = top;
    } //-- void setTop( Integer )

    /**
     * Set stack order of the component<br /><br /><a
     * href="http://docs.webix.com/api__link__ui.popup_zindex_config.html">Webix
     * API Reference</a>
     * 
     * @param zIndex
     */
    public void setZIndex( Integer zIndex )
    {
        this.zIndex = zIndex;
    } //-- void setZIndex( Integer )

}
