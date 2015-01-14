// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.7,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.auxiliary;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.webix.ui.model.UnknownType;
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
 * A static text that is rendered in the absolutely positioned
 * container.Generally, the component isn't intended for direct
 * initialization. But if you decide to use it, use mouse events
 * (onMouseOut, onMouseIn, onMouseMove etc.) to show/hide the
 * tooltip box in the specified position. Check <a
 * href="http://docs.webix.com/desktop__tooltip.html">tooltip</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
@com.webix.ui.model.SupportsEvent({com.webix.ui.model.Event.ON_AFTER_RENDER, com.webix.ui.model.Event.ON_AFTER_SCROLL, com.webix.ui.model.Event.ON_BEFORE_RENDER, com.webix.ui.model.Event.ON_BIND_REQUEST, com.webix.ui.model.Event.ON_DESTRUCT, com.webix.ui.model.Event.ON_LONG_TOUCH, com.webix.ui.model.Event.ON_ROTATE, com.webix.ui.model.Event.ON_SWIPE_X, com.webix.ui.model.Event.ON_SWIPE_Y, com.webix.ui.model.Event.ON_TOUCH_END, com.webix.ui.model.Event.ON_TOUCH_MOVE, com.webix.ui.model.Event.ON_TOUCH_START, com.webix.ui.model.Event.ON_VIEW_RESIZE})
public class Tooltip
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
     * Used to hide the component borders.
     */
    private Boolean borderless;

    /**
     * An html container (or its id) where the component needs
     * initializing.
     */
    private UnknownType container;

    /**
     * The id or node, whose content will be moved to the view.
     */
    private UnknownType content;

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
     * The left offset of the tooltip from the mouse pointer.
     */
    private Integer dx;

    /**
     * The top offset of the tooltip from the mouse pointer.
     */
    private Integer dy;

    /**
     * Sets the view gravity (1 by default).
     */
    private Integer gravity;

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
     * Allows attaching custom handlers to inner events of the
     * component.
     */
    private UnknownType on;

    /**
     * The component template.
     */
    private UnknownType template;

    /**
     * Sets the width of the component.
     */
    private Integer width;


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
     * Get the id or node, whose content will be moved to the view.
     * 
     * @return UnknownType
     */
    public UnknownType getContent()
    {
        return this.content;
    } //-- UnknownType getContent()

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
     * Get the left offset of the tooltip from the mouse pointer.
     * 
     * @return Integer
     */
    public Integer getDx()
    {
        return this.dx;
    } //-- Integer getDx()

    /**
     * Get the top offset of the tooltip from the mouse pointer.
     * 
     * @return Integer
     */
    public Integer getDy()
    {
        return this.dy;
    } //-- Integer getDy()

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
     * Get the component template.
     * 
     * @return UnknownType
     */
    public UnknownType getTemplate()
    {
        return this.template;
    } //-- UnknownType getTemplate()

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
     * Get defines whether the view will be hidden initially.
     * 
     * @return Boolean
     */
    public Boolean isHidden()
    {
        return this.hidden;
    } //-- Boolean isHidden()

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
     * Set the id or node, whose content will be moved to the view.
     * 
     * @param content
     */
    public void setContent( UnknownType content )
    {
        this.content = content;
    } //-- void setContent( UnknownType )

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
     * Set the left offset of the tooltip from the mouse pointer.
     * 
     * @param dx
     */
    public void setDx( Integer dx )
    {
        this.dx = dx;
    } //-- void setDx( Integer )

    /**
     * Set the top offset of the tooltip from the mouse pointer.
     * 
     * @param dy
     */
    public void setDy( Integer dy )
    {
        this.dy = dy;
    } //-- void setDy( Integer )

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
     * Set the component template.
     * 
     * @param template
     */
    public void setTemplate( UnknownType template )
    {
        this.template = template;
    } //-- void setTemplate( UnknownType )

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
     * Redefines the 'type' property
     */
    public void customize() {
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
     * Disables the tooltip (tooltips won't appear anymore)
     */
    public void disable() {
        return;
    }
    /**
     * Enables the tooltip (after it has beed disabled)
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
     * Hides the tooltip
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
     * Renders the specified item or the whole component
     */
    public void render() {
        return;
    }
    /**
     * Adjusts the view to a new size
     */
    public void resize() {
        return;
    }
    /**
     * Shows the tooltip at a specific position
     */
    public void show() {
        return;
    }
    /**
     * Allows you to sync two copy of data (all or just a part of it) from one DataCollection to another
     */
    public void sync() {
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
