// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.7,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.context;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.webix.ui.model.UnknownType;
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
 * A movable popup window.The window consists of the header and
 * body, can be modal or modaless. The window body can contain any
 * content. The header is set by a template. Check <a
 * href="http://docs.webix.com/desktop__window.html">window</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
@com.webix.ui.model.SupportsEvent({com.webix.ui.model.Event.ON_AFTER_SCROLL, com.webix.ui.model.Event.ON_BIND_REQUEST, com.webix.ui.model.Event.ON_DESTRUCT, com.webix.ui.model.Event.ON_HIDE, com.webix.ui.model.Event.ON_LONG_TOUCH, com.webix.ui.model.Event.ON_ROTATE, com.webix.ui.model.Event.ON_SHOW, com.webix.ui.model.Event.ON_SWIPE_X, com.webix.ui.model.Event.ON_SWIPE_Y, com.webix.ui.model.Event.ON_TOUCH_END, com.webix.ui.model.Event.ON_TOUCH_MOVE, com.webix.ui.model.Event.ON_TOUCH_START, com.webix.ui.model.Event.ON_VIEW_MOVE, com.webix.ui.model.Event.ON_VIEW_MOVE_END, com.webix.ui.model.Event.ON_VIEW_RESIZE})
public class Window
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Defines or disables view change animation.
     */
    private UnknownType animate;

    /**
     * Adjusts window size to the size of an html node it is
     * initiated in.
     */
    private Boolean autofit;

    /**
     * Sets focus on the window the moment it appears on the page.
     */
    private Boolean autofocus;

    /**
     * The content of window body: template or view.
     */
    private UnknownType body;

    /**
     * Used to hide the component borders.
     */
    private Boolean borderless;

    /**
     * An html container (or its id) where the component needs
     * initializing.
     */
    private UnknownType container;

    /**
     * The name of a css class that will be applied to the view
     * container.
     */
    private String css;

    /**
     * Disables item.
     */
    private Boolean disabled;

    /**
     * Renders window in fullscreen mode.
     */
    private Boolean fullscreen;

    /**
     * Sets the view gravity (1 by default).
     */
    private Integer gravity;

    /**
     * Sets the view header.
     */
    private UnknownType head;

    /**
     * Defines the header height (43 by default).
     */
    private Integer headHeight;

    /**
     * Sets the height of the component.
     */
    private Integer height;

    /**
     * Defines whether the view will be hidden initially.
     */
    private Boolean hidden;

    /**
     * The component ID.
     */
    private String id;

    /**
     * The left offset of the window.
     */
    private Integer left;

    /**
     * Sets the maximum height for the view.
     */
    private Integer maxHeight;

    /**
     * Sets the maximum width for the view.
     */
    private Integer maxWidth;

    /**
     * Sets the minimal height for the view.
     */
    private Integer minHeight;

    /**
     * Sets the minimal width for the view.
     */
    private Integer minWidth;

    /**
     * Switches window modality.
     */
    private Boolean modal;

    /**
     * Makes view movable.
     */
    private Boolean move;

    /**
     * Allows attaching custom handlers to inner events of the
     * component.
     */
    private UnknownType on;

    /**
     * Sets paddings of the chart content.
     */
    private UnknownType padding;

    /**
     * Sets position of the window relative to the the screen.
     */
    private String position;

    /**
     * Positions a popup window relative to the component it's
     * connected with.
     */
    private String relative;

    /**
     * The top offset of a window.
     */
    private Integer top;

    /**
     * Sets the width of the component.
     */
    private Integer width;

    /**
     * Stack order of the component.
     */
    private Integer zIndex;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get defines or disables view change animation.
     * 
     * @return UnknownType
     */
    public UnknownType getAnimate()
    {
        return this.animate;
    } //-- UnknownType getAnimate()

    /**
     * Get the content of window body: template or view.
     * 
     * @return UnknownType
     */
    public UnknownType getBody()
    {
        return this.body;
    } //-- UnknownType getBody()

    /**
     * Get an html container (or its id) where the component needs
     * initializing.
     * 
     * @return UnknownType
     */
    public UnknownType getContainer()
    {
        return this.container;
    } //-- UnknownType getContainer()

    /**
     * Get the name of a css class that will be applied to the view
     * container.
     * 
     * @return String
     */
    public String getCss()
    {
        return this.css;
    } //-- String getCss()

    /**
     * Get sets the view gravity (1 by default).
     * 
     * @return Integer
     */
    public Integer getGravity()
    {
        return this.gravity;
    } //-- Integer getGravity()

    /**
     * Get sets the view header.
     * 
     * @return UnknownType
     */
    public UnknownType getHead()
    {
        return this.head;
    } //-- UnknownType getHead()

    /**
     * Get defines the header height (43 by default).
     * 
     * @return Integer
     */
    public Integer getHeadHeight()
    {
        return this.headHeight;
    } //-- Integer getHeadHeight()

    /**
     * Get sets the height of the component.
     * 
     * @return Integer
     */
    public Integer getHeight()
    {
        return this.height;
    } //-- Integer getHeight()

    /**
     * Get the component ID.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Get the left offset of the window.
     * 
     * @return Integer
     */
    public Integer getLeft()
    {
        return this.left;
    } //-- Integer getLeft()

    /**
     * Get sets the maximum height for the view.
     * 
     * @return Integer
     */
    public Integer getMaxHeight()
    {
        return this.maxHeight;
    } //-- Integer getMaxHeight()

    /**
     * Get sets the maximum width for the view.
     * 
     * @return Integer
     */
    public Integer getMaxWidth()
    {
        return this.maxWidth;
    } //-- Integer getMaxWidth()

    /**
     * Get sets the minimal height for the view.
     * 
     * @return Integer
     */
    public Integer getMinHeight()
    {
        return this.minHeight;
    } //-- Integer getMinHeight()

    /**
     * Get sets the minimal width for the view.
     * 
     * @return Integer
     */
    public Integer getMinWidth()
    {
        return this.minWidth;
    } //-- Integer getMinWidth()

    /**
     * Get allows attaching custom handlers to inner events of the
     * component.
     * 
     * @return UnknownType
     */
    public UnknownType getOn()
    {
        return this.on;
    } //-- UnknownType getOn()

    /**
     * Get sets paddings of the chart content.
     * 
     * @return UnknownType
     */
    public UnknownType getPadding()
    {
        return this.padding;
    } //-- UnknownType getPadding()

    /**
     * Get sets position of the window relative to the the screen.
     * 
     * @return String
     */
    public String getPosition()
    {
        return this.position;
    } //-- String getPosition()

    /**
     * Get positions a popup window relative to the component it's
     * connected with.
     * 
     * @return String
     */
    public String getRelative()
    {
        return this.relative;
    } //-- String getRelative()

    /**
     * Get the top offset of a window.
     * 
     * @return Integer
     */
    public Integer getTop()
    {
        return this.top;
    } //-- Integer getTop()

    /**
     * Get sets the width of the component.
     * 
     * @return Integer
     */
    public Integer getWidth()
    {
        return this.width;
    } //-- Integer getWidth()

    /**
     * Get stack order of the component.
     * 
     * @return Integer
     */
    public Integer getZIndex()
    {
        return this.zIndex;
    } //-- Integer getZIndex()

    /**
     * Get adjusts window size to the size of an html node it is
     * initiated in.
     * 
     * @return Boolean
     */
    public Boolean isAutofit()
    {
        return this.autofit;
    } //-- Boolean isAutofit()

    /**
     * Get sets focus on the window the moment it appears on the
     * page.
     * 
     * @return Boolean
     */
    public Boolean isAutofocus()
    {
        return this.autofocus;
    } //-- Boolean isAutofocus()

    /**
     * Get used to hide the component borders.
     * 
     * @return Boolean
     */
    public Boolean isBorderless()
    {
        return this.borderless;
    } //-- Boolean isBorderless()

    /**
     * Get disables item.
     * 
     * @return Boolean
     */
    public Boolean isDisabled()
    {
        return this.disabled;
    } //-- Boolean isDisabled()

    /**
     * Get renders window in fullscreen mode.
     * 
     * @return Boolean
     */
    public Boolean isFullscreen()
    {
        return this.fullscreen;
    } //-- Boolean isFullscreen()

    /**
     * Get defines whether the view will be hidden initially.
     * 
     * @return Boolean
     */
    public Boolean isHidden()
    {
        return this.hidden;
    } //-- Boolean isHidden()

    /**
     * Get switches window modality.
     * 
     * @return Boolean
     */
    public Boolean isModal()
    {
        return this.modal;
    } //-- Boolean isModal()

    /**
     * Get makes view movable.
     * 
     * @return Boolean
     */
    public Boolean isMove()
    {
        return this.move;
    } //-- Boolean isMove()

    /**
     * Set defines or disables view change animation.
     * 
     * @param animate
     */
    public void setAnimate( UnknownType animate )
    {
        this.animate = animate;
    } //-- void setAnimate( UnknownType )

    /**
     * Set adjusts window size to the size of an html node it is
     * initiated in.
     * 
     * @param autofit
     */
    public void setAutofit( Boolean autofit )
    {
        this.autofit = autofit;
    } //-- void setAutofit( Boolean )

    /**
     * Set sets focus on the window the moment it appears on the
     * page.
     * 
     * @param autofocus
     */
    public void setAutofocus( Boolean autofocus )
    {
        this.autofocus = autofocus;
    } //-- void setAutofocus( Boolean )

    /**
     * Set the content of window body: template or view.
     * 
     * @param body
     */
    public void setBody( UnknownType body )
    {
        this.body = body;
    } //-- void setBody( UnknownType )

    /**
     * Set used to hide the component borders.
     * 
     * @param borderless
     */
    public void setBorderless( Boolean borderless )
    {
        this.borderless = borderless;
    } //-- void setBorderless( Boolean )

    /**
     * Set an html container (or its id) where the component needs
     * initializing.
     * 
     * @param container
     */
    public void setContainer( UnknownType container )
    {
        this.container = container;
    } //-- void setContainer( UnknownType )

    /**
     * Set the name of a css class that will be applied to the view
     * container.
     * 
     * @param css
     */
    public void setCss( String css )
    {
        this.css = css;
    } //-- void setCss( String )

    /**
     * Set disables item.
     * 
     * @param disabled
     */
    public void setDisabled( Boolean disabled )
    {
        this.disabled = disabled;
    } //-- void setDisabled( Boolean )

    /**
     * Set renders window in fullscreen mode.
     * 
     * @param fullscreen
     */
    public void setFullscreen( Boolean fullscreen )
    {
        this.fullscreen = fullscreen;
    } //-- void setFullscreen( Boolean )

    /**
     * Set sets the view gravity (1 by default).
     * 
     * @param gravity
     */
    public void setGravity( Integer gravity )
    {
        this.gravity = gravity;
    } //-- void setGravity( Integer )

    /**
     * Set sets the view header.
     * 
     * @param head
     */
    public void setHead( UnknownType head )
    {
        this.head = head;
    } //-- void setHead( UnknownType )

    /**
     * Set defines the header height (43 by default).
     * 
     * @param headHeight
     */
    public void setHeadHeight( Integer headHeight )
    {
        this.headHeight = headHeight;
    } //-- void setHeadHeight( Integer )

    /**
     * Set sets the height of the component.
     * 
     * @param height
     */
    public void setHeight( Integer height )
    {
        this.height = height;
    } //-- void setHeight( Integer )

    /**
     * Set defines whether the view will be hidden initially.
     * 
     * @param hidden
     */
    public void setHidden( Boolean hidden )
    {
        this.hidden = hidden;
    } //-- void setHidden( Boolean )

    /**
     * Set the component ID.
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set the left offset of the window.
     * 
     * @param left
     */
    public void setLeft( Integer left )
    {
        this.left = left;
    } //-- void setLeft( Integer )

    /**
     * Set sets the maximum height for the view.
     * 
     * @param maxHeight
     */
    public void setMaxHeight( Integer maxHeight )
    {
        this.maxHeight = maxHeight;
    } //-- void setMaxHeight( Integer )

    /**
     * Set sets the maximum width for the view.
     * 
     * @param maxWidth
     */
    public void setMaxWidth( Integer maxWidth )
    {
        this.maxWidth = maxWidth;
    } //-- void setMaxWidth( Integer )

    /**
     * Set sets the minimal height for the view.
     * 
     * @param minHeight
     */
    public void setMinHeight( Integer minHeight )
    {
        this.minHeight = minHeight;
    } //-- void setMinHeight( Integer )

    /**
     * Set sets the minimal width for the view.
     * 
     * @param minWidth
     */
    public void setMinWidth( Integer minWidth )
    {
        this.minWidth = minWidth;
    } //-- void setMinWidth( Integer )

    /**
     * Set switches window modality.
     * 
     * @param modal
     */
    public void setModal( Boolean modal )
    {
        this.modal = modal;
    } //-- void setModal( Boolean )

    /**
     * Set makes view movable.
     * 
     * @param move
     */
    public void setMove( Boolean move )
    {
        this.move = move;
    } //-- void setMove( Boolean )

    /**
     * Set allows attaching custom handlers to inner events of the
     * component.
     * 
     * @param on
     */
    public void setOn( UnknownType on )
    {
        this.on = on;
    } //-- void setOn( UnknownType )

    /**
     * Set sets paddings of the chart content.
     * 
     * @param padding
     */
    public void setPadding( UnknownType padding )
    {
        this.padding = padding;
    } //-- void setPadding( UnknownType )

    /**
     * Set sets position of the window relative to the the screen.
     * 
     * @param position
     */
    public void setPosition( String position )
    {
        this.position = position;
    } //-- void setPosition( String )

    /**
     * Set positions a popup window relative to the component it's
     * connected with.
     * 
     * @param relative
     */
    public void setRelative( String relative )
    {
        this.relative = relative;
    } //-- void setRelative( String )

    /**
     * Set the top offset of a window.
     * 
     * @param top
     */
    public void setTop( Integer top )
    {
        this.top = top;
    } //-- void setTop( Integer )

    /**
     * Set sets the width of the component.
     * 
     * @param width
     */
    public void setWidth( Integer width )
    {
        this.width = width;
    } //-- void setWidth( Integer )

    /**
     * Set stack order of the component.
     * 
     * @param zIndex
     */
    public void setZIndex( Integer zIndex )
    {
        this.zIndex = zIndex;
    } //-- void setZIndex( Integer )

    /**
     * Adjusts the component to the size of the parent HTML container
     */
    public void adjust() {
        return;
    }
    /**
     * Attaches the handler to an inner event of the component (allows behaviour customizations)
     */
    public Byte attachEvent() {
        return null;
    }
    /**
     * Binds components
     */
    public void bind() {
        return;
    }
    /**
     * Temporarily blocks triggering of ALL events of the calling object
     */
    public void blockEvent() {
        return;
    }
    /**
     * Calls an inner event
     */
    public Boolean callEvent() {
        return null;
    }
    /**
     * Removes a window
     */
    public void close() {
        return;
    }
    /**
     * Redefines a single configuration property (or a hash of properties)
     */
    public void define() {
        return;
    }
    /**
     * Destructs the calling object
     */
    public void destructor() {
        return;
    }
    /**
     * Detaches a handler from an event (which was attached before by the attachEvent method)
     */
    public void detachEvent() {
        return;
    }
    /**
     * Disables the calling view (makes it dimmed and unclickable)
     */
    public void disable() {
        return;
    }
    /**
     * Enables the calling view that was disabled by the 'disable' method
     */
    public void enable() {
        return;
    }
    /**
     * Returns child views of the calling component
     */
    public Byte getChildViews() {
        return null;
    }
    /**
     * Returns master form for the input
     */
    public Byte getFormView() {
        return null;
    }
    /**
     * Returns the main HTML container for the calling object
     */
    public Byte getNode() {
        return null;
    }
    /**
     * Returns the parent view of the component
     */
    public Byte getParentView() {
        return null;
    }
    /**
     * Returns top parent view
     */
    public Byte getTopParentView() {
        return null;
    }
    /**
     * Checks whether the component has the specified event
     */
    public Boolean hasEvent() {
        return null;
    }
    /**
     * Hides the view
     */
    public void hide() {
        return;
    }
    /**
     * Checks whether the view is enabled
     */
    public Boolean isEnabled() {
        return null;
    }
    /**
     * Checks whether the view is visible
     */
    public Boolean isVisible() {
        return null;
    }
    /**
     * Routes events from one object to another
     */
    public void mapEvent() {
        return;
    }
    /**
     * Adjusts the view to a new size
     */
    public void resize() {
        return;
    }
    /**
     * Resizes all children of the calling component
     */
    public void resizeChildren() {
        return;
    }
    /**
     * Makes the component visible
     */
    public void show() {
        return;
    }
    /**
     * Breaks "bind" link
     */
    public void unbind() {
        return;
    }
    /**
     * Cancels blocking events that was enabled by the 'blockEvent' command
     */
    public void unblockEvent() {
        return;
    }
}
