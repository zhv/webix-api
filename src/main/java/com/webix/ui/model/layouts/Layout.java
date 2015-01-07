// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.7,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.layouts;

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

/**
 * A vertical or horizontal layout without the headers.The
 * component allows you to programmatically define interface
 * structure by organizing views in a vertical or horizontal
 * layout. By including layouts one by one, it's possible to create
 * the final screen of any complexity. Check layout documentation
 * for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Layout
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Defines or disables view change animation.
     */
    private Byte animate;

    /**
     * Used to hide the component borders.
     */
    private Byte borderless;

    /**
     * Array of views objects arranged horizontally.
     */
    private Byte cols;

    /**
     * An html container (or its id) where the component needs
     * initializing.
     */
    private Byte container;

    /**
     * The name of a css class that will be applied to the view
     * container.
     */
    private Byte css;

    /**
     * Disables item.
     */
    private Byte disabled;

    /**
     * Sets the view gravity (1 by default).
     */
    private Byte gravity;

    /**
     * Sets the height of the component.
     */
    private Byte height;

    /**
     * Defines whether the view will be hidden initially.
     */
    private Byte hidden;

    /**
     * The component ID.
     */
    private Byte id;

    /**
     * Masks IDs of all inner element.
     */
    private Byte isolate;

    /**
     * Defines the space around elements (applies the specified
     * value to all elements).
     */
    private Byte margin;

    /**
     * Sets the maximum height for the view.
     */
    private Byte maxHeight;

    /**
     * Sets the maximum width for the view.
     */
    private Byte maxWidth;

    /**
     * Sets the minimal height for the view.
     */
    private Byte minHeight;

    /**
     * Sets the minimal width for the view.
     */
    private Byte minWidth;

    /**
     * Allows attaching custom handlers to inner events of the
     * component.
     */
    private Byte on;

    /**
     * Defines the space between the element borders and content
     * (applies the specified value to all sides).
     */
    private Byte padding;

    /**
     * Sets the right and left padding (applies the specified value
     * to both sides).
     */
    private Byte paddingX;

    /**
     * Sets the top and bottom padding (applies the specified value
     * to both sides).
     */
    private Byte paddingY;

    /**
     * Enables responsive mode for horizontal layout.
     */
    private Byte responsive;

    /**
     * Array of views objects arranged vertically.
     */
    private Byte rows;

    /**
     * Defines the layout borders.
     */
    private Byte type;

    /**
     * Sets the batch that will be shown initially.
     */
    private Byte visibleBatch;

    /**
     * Sets the width of the component.
     */
    private Byte width;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get defines or disables view change animation.
     * 
     * @return Byte
     */
    public Byte getAnimate()
    {
        return this.animate;
    } //-- Byte getAnimate()

    /**
     * Get used to hide the component borders.
     * 
     * @return Byte
     */
    public Byte getBorderless()
    {
        return this.borderless;
    } //-- Byte getBorderless()

    /**
     * Get array of views objects arranged horizontally.
     * 
     * @return Byte
     */
    public Byte getCols()
    {
        return this.cols;
    } //-- Byte getCols()

    /**
     * Get an html container (or its id) where the component needs
     * initializing.
     * 
     * @return Byte
     */
    public Byte getContainer()
    {
        return this.container;
    } //-- Byte getContainer()

    /**
     * Get the name of a css class that will be applied to the view
     * container.
     * 
     * @return Byte
     */
    public Byte getCss()
    {
        return this.css;
    } //-- Byte getCss()

    /**
     * Get disables item.
     * 
     * @return Byte
     */
    public Byte getDisabled()
    {
        return this.disabled;
    } //-- Byte getDisabled()

    /**
     * Get sets the view gravity (1 by default).
     * 
     * @return Byte
     */
    public Byte getGravity()
    {
        return this.gravity;
    } //-- Byte getGravity()

    /**
     * Get sets the height of the component.
     * 
     * @return Byte
     */
    public Byte getHeight()
    {
        return this.height;
    } //-- Byte getHeight()

    /**
     * Get defines whether the view will be hidden initially.
     * 
     * @return Byte
     */
    public Byte getHidden()
    {
        return this.hidden;
    } //-- Byte getHidden()

    /**
     * Get the component ID.
     * 
     * @return Byte
     */
    public Byte getId()
    {
        return this.id;
    } //-- Byte getId()

    /**
     * Get masks IDs of all inner element.
     * 
     * @return Byte
     */
    public Byte getIsolate()
    {
        return this.isolate;
    } //-- Byte getIsolate()

    /**
     * Get defines the space around elements (applies the specified
     * value to all elements).
     * 
     * @return Byte
     */
    public Byte getMargin()
    {
        return this.margin;
    } //-- Byte getMargin()

    /**
     * Get sets the maximum height for the view.
     * 
     * @return Byte
     */
    public Byte getMaxHeight()
    {
        return this.maxHeight;
    } //-- Byte getMaxHeight()

    /**
     * Get sets the maximum width for the view.
     * 
     * @return Byte
     */
    public Byte getMaxWidth()
    {
        return this.maxWidth;
    } //-- Byte getMaxWidth()

    /**
     * Get sets the minimal height for the view.
     * 
     * @return Byte
     */
    public Byte getMinHeight()
    {
        return this.minHeight;
    } //-- Byte getMinHeight()

    /**
     * Get sets the minimal width for the view.
     * 
     * @return Byte
     */
    public Byte getMinWidth()
    {
        return this.minWidth;
    } //-- Byte getMinWidth()

    /**
     * Get allows attaching custom handlers to inner events of the
     * component.
     * 
     * @return Byte
     */
    public Byte getOn()
    {
        return this.on;
    } //-- Byte getOn()

    /**
     * Get defines the space between the element borders and
     * content (applies the specified value to all sides).
     * 
     * @return Byte
     */
    public Byte getPadding()
    {
        return this.padding;
    } //-- Byte getPadding()

    /**
     * Get sets the right and left padding (applies the specified
     * value to both sides).
     * 
     * @return Byte
     */
    public Byte getPaddingX()
    {
        return this.paddingX;
    } //-- Byte getPaddingX()

    /**
     * Get sets the top and bottom padding (applies the specified
     * value to both sides).
     * 
     * @return Byte
     */
    public Byte getPaddingY()
    {
        return this.paddingY;
    } //-- Byte getPaddingY()

    /**
     * Get enables responsive mode for horizontal layout.
     * 
     * @return Byte
     */
    public Byte getResponsive()
    {
        return this.responsive;
    } //-- Byte getResponsive()

    /**
     * Get array of views objects arranged vertically.
     * 
     * @return Byte
     */
    public Byte getRows()
    {
        return this.rows;
    } //-- Byte getRows()

    /**
     * Get defines the layout borders.
     * 
     * @return Byte
     */
    public Byte getType()
    {
        return this.type;
    } //-- Byte getType()

    /**
     * Get sets the batch that will be shown initially.
     * 
     * @return Byte
     */
    public Byte getVisibleBatch()
    {
        return this.visibleBatch;
    } //-- Byte getVisibleBatch()

    /**
     * Get sets the width of the component.
     * 
     * @return Byte
     */
    public Byte getWidth()
    {
        return this.width;
    } //-- Byte getWidth()

    /**
     * Set defines or disables view change animation.
     * 
     * @param animate
     */
    public void setAnimate( Byte animate )
    {
        this.animate = animate;
    } //-- void setAnimate( Byte )

    /**
     * Set used to hide the component borders.
     * 
     * @param borderless
     */
    public void setBorderless( Byte borderless )
    {
        this.borderless = borderless;
    } //-- void setBorderless( Byte )

    /**
     * Set array of views objects arranged horizontally.
     * 
     * @param cols
     */
    public void setCols( Byte cols )
    {
        this.cols = cols;
    } //-- void setCols( Byte )

    /**
     * Set an html container (or its id) where the component needs
     * initializing.
     * 
     * @param container
     */
    public void setContainer( Byte container )
    {
        this.container = container;
    } //-- void setContainer( Byte )

    /**
     * Set the name of a css class that will be applied to the view
     * container.
     * 
     * @param css
     */
    public void setCss( Byte css )
    {
        this.css = css;
    } //-- void setCss( Byte )

    /**
     * Set disables item.
     * 
     * @param disabled
     */
    public void setDisabled( Byte disabled )
    {
        this.disabled = disabled;
    } //-- void setDisabled( Byte )

    /**
     * Set sets the view gravity (1 by default).
     * 
     * @param gravity
     */
    public void setGravity( Byte gravity )
    {
        this.gravity = gravity;
    } //-- void setGravity( Byte )

    /**
     * Set sets the height of the component.
     * 
     * @param height
     */
    public void setHeight( Byte height )
    {
        this.height = height;
    } //-- void setHeight( Byte )

    /**
     * Set defines whether the view will be hidden initially.
     * 
     * @param hidden
     */
    public void setHidden( Byte hidden )
    {
        this.hidden = hidden;
    } //-- void setHidden( Byte )

    /**
     * Set the component ID.
     * 
     * @param id
     */
    public void setId( Byte id )
    {
        this.id = id;
    } //-- void setId( Byte )

    /**
     * Set masks IDs of all inner element.
     * 
     * @param isolate
     */
    public void setIsolate( Byte isolate )
    {
        this.isolate = isolate;
    } //-- void setIsolate( Byte )

    /**
     * Set defines the space around elements (applies the specified
     * value to all elements).
     * 
     * @param margin
     */
    public void setMargin( Byte margin )
    {
        this.margin = margin;
    } //-- void setMargin( Byte )

    /**
     * Set sets the maximum height for the view.
     * 
     * @param maxHeight
     */
    public void setMaxHeight( Byte maxHeight )
    {
        this.maxHeight = maxHeight;
    } //-- void setMaxHeight( Byte )

    /**
     * Set sets the maximum width for the view.
     * 
     * @param maxWidth
     */
    public void setMaxWidth( Byte maxWidth )
    {
        this.maxWidth = maxWidth;
    } //-- void setMaxWidth( Byte )

    /**
     * Set sets the minimal height for the view.
     * 
     * @param minHeight
     */
    public void setMinHeight( Byte minHeight )
    {
        this.minHeight = minHeight;
    } //-- void setMinHeight( Byte )

    /**
     * Set sets the minimal width for the view.
     * 
     * @param minWidth
     */
    public void setMinWidth( Byte minWidth )
    {
        this.minWidth = minWidth;
    } //-- void setMinWidth( Byte )

    /**
     * Set allows attaching custom handlers to inner events of the
     * component.
     * 
     * @param on
     */
    public void setOn( Byte on )
    {
        this.on = on;
    } //-- void setOn( Byte )

    /**
     * Set defines the space between the element borders and
     * content (applies the specified value to all sides).
     * 
     * @param padding
     */
    public void setPadding( Byte padding )
    {
        this.padding = padding;
    } //-- void setPadding( Byte )

    /**
     * Set sets the right and left padding (applies the specified
     * value to both sides).
     * 
     * @param paddingX
     */
    public void setPaddingX( Byte paddingX )
    {
        this.paddingX = paddingX;
    } //-- void setPaddingX( Byte )

    /**
     * Set sets the top and bottom padding (applies the specified
     * value to both sides).
     * 
     * @param paddingY
     */
    public void setPaddingY( Byte paddingY )
    {
        this.paddingY = paddingY;
    } //-- void setPaddingY( Byte )

    /**
     * Set enables responsive mode for horizontal layout.
     * 
     * @param responsive
     */
    public void setResponsive( Byte responsive )
    {
        this.responsive = responsive;
    } //-- void setResponsive( Byte )

    /**
     * Set array of views objects arranged vertically.
     * 
     * @param rows
     */
    public void setRows( Byte rows )
    {
        this.rows = rows;
    } //-- void setRows( Byte )

    /**
     * Set defines the layout borders.
     * 
     * @param type
     */
    public void setType( Byte type )
    {
        this.type = type;
    } //-- void setType( Byte )

    /**
     * Set sets the batch that will be shown initially.
     * 
     * @param visibleBatch
     */
    public void setVisibleBatch( Byte visibleBatch )
    {
        this.visibleBatch = visibleBatch;
    } //-- void setVisibleBatch( Byte )

    /**
     * Set sets the width of the component.
     * 
     * @param width
     */
    public void setWidth( Byte width )
    {
        this.width = width;
    } //-- void setWidth( Byte )

    /**
     * Add new view to layout-like component
     */
    public Byte addView() {
        return null;
    }
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
     * Returns the cell index in the layout collection
     */
    public Integer index() {
        return null;
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
     * Rebuilds the layout
     */
    public void reconstruct() {
        return;
    }
    /**
     * Removes view from layout-like component
     */
    public void removeView() {
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
     * Makes visible those elements which parameter 'batch' is set to the specified name
     */
    public void showBatch() {
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
