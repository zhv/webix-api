// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.7,
// any modifications will be overwritten.
// ==============================================================

package com.webix.ui.model.html;

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
 * A control for integration with an HTML form.The component allows
 * you to get an HTML Form as a lib-based view, so that to use it
 * together with the other lib components (common API, techniques,
 * architecture etc.). Check <a
 * href="http://docs.webix.com/desktop__htmlform.html">htmlform</a>
 * documentation for more detailed description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
@com.webix.ui.model.SupportsEvent({com.webix.ui.model.Event.ON_AFTER_LOAD, com.webix.ui.model.Event.ON_AFTER_RENDER, com.webix.ui.model.Event.ON_AFTER_SCROLL, com.webix.ui.model.Event.ON_AFTER_VALIDATION, com.webix.ui.model.Event.ON_BEFORE_LOAD, com.webix.ui.model.Event.ON_BEFORE_RENDER, com.webix.ui.model.Event.ON_BEFORE_VALIDATE, com.webix.ui.model.Event.ON_BIND_REQUEST, com.webix.ui.model.Event.ON_CHANGE, com.webix.ui.model.Event.ON_DESTRUCT, com.webix.ui.model.Event.ON_LOAD_ERROR, com.webix.ui.model.Event.ON_LONG_TOUCH, com.webix.ui.model.Event.ON_ROTATE, com.webix.ui.model.Event.ON_SWIPE_X, com.webix.ui.model.Event.ON_SWIPE_Y, com.webix.ui.model.Event.ON_TOUCH_END, com.webix.ui.model.Event.ON_TOUCH_MOVE, com.webix.ui.model.Event.ON_TOUCH_START, com.webix.ui.model.Event.ON_VALIDATION_ERROR, com.webix.ui.model.Event.ON_VALIDATION_SUCCESS, com.webix.ui.model.Event.ON_VIEW_RESIZE})
public class Htmlform
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
     * Lets the component autosize to its contents.
     */
    private UnknownType autoheight;

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
     * An inline dataset that data to the component will be load
     * from.
     */
    private UnknownType data;

    /**
     * The url to the data source that the component will use to
     * reload data from.
     */
    private UnknownType dataFeed;

    /**
     * The type of loaded data.
     */
    private String datatype;

    /**
     * Disables item.
     */
    private Boolean disabled;

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
     * Attaches a click behavior for component items with the
     * specified CSS class.
     */
    private UnknownType onClick;

    /**
     * Defines a set of rules for input field(s) of the
     * form(htmlform).
     */
    private UnknownType rules;

    /**
     * Enables/disables the scroll bar.
     */
    private UnknownType scroll;

    /**
     * The time during which the component is scrolled to the
     * specified position (in milliseconds).
     */
    private String scrollSpeed;

    /**
     * The path to an external template that is loaded by Ajax.
     */
    private String src;

    /**
     * The component template.
     */
    private UnknownType template;

    /**
     * Name of predefined styling type.
     */
    private String type;

    /**
     * The url of a data feed which will be loaded after component
     * initialization.
     */
    private String url;

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
     * Get lets the component autosize to its contents.
     * 
     * @return UnknownType
     */
    public UnknownType getAutoheight()
    {
        return this.autoheight;
    } //-- UnknownType getAutoheight()

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
     * Get an inline dataset that data to the component will be
     * load from.
     * 
     * @return UnknownType
     */
    public UnknownType getData()
    {
        return this.data;
    } //-- UnknownType getData()

    /**
     * Get the url to the data source that the component will use
     * to reload data from.
     * 
     * @return UnknownType
     */
    public UnknownType getDataFeed()
    {
        return this.dataFeed;
    } //-- UnknownType getDataFeed()

    /**
     * Get the type of loaded data.
     * 
     * @return String
     */
    public String getDatatype()
    {
        return this.datatype;
    } //-- String getDatatype()

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
     * Get attaches a click behavior for component items with the
     * specified CSS class.
     * 
     * @return UnknownType
     */
    public UnknownType getOnClick()
    {
        return this.onClick;
    } //-- UnknownType getOnClick()

    /**
     * Get defines a set of rules for input field(s) of the
     * form(htmlform).
     * 
     * @return UnknownType
     */
    public UnknownType getRules()
    {
        return this.rules;
    } //-- UnknownType getRules()

    /**
     * Get enables/disables the scroll bar.
     * 
     * @return UnknownType
     */
    public UnknownType getScroll()
    {
        return this.scroll;
    } //-- UnknownType getScroll()

    /**
     * Get the time during which the component is scrolled to the
     * specified position (in milliseconds).
     * 
     * @return String
     */
    public String getScrollSpeed()
    {
        return this.scrollSpeed;
    } //-- String getScrollSpeed()

    /**
     * Get the path to an external template that is loaded by Ajax.
     * 
     * @return String
     */
    public String getSrc()
    {
        return this.src;
    } //-- String getSrc()

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
     * Get name of predefined styling type.
     * 
     * @return String
     */
    public String getType()
    {
        return this.type;
    } //-- String getType()

    /**
     * Get the url of a data feed which will be loaded after
     * component initialization.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

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
     * Set lets the component autosize to its contents.
     * 
     * @param autoheight
     */
    public void setAutoheight( UnknownType autoheight )
    {
        this.autoheight = autoheight;
    } //-- void setAutoheight( UnknownType )

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
     * Set an inline dataset that data to the component will be
     * load from.
     * 
     * @param data
     */
    public void setData( UnknownType data )
    {
        this.data = data;
    } //-- void setData( UnknownType )

    /**
     * Set the url to the data source that the component will use
     * to reload data from.
     * 
     * @param dataFeed
     */
    public void setDataFeed( UnknownType dataFeed )
    {
        this.dataFeed = dataFeed;
    } //-- void setDataFeed( UnknownType )

    /**
     * Set the type of loaded data.
     * 
     * @param datatype
     */
    public void setDatatype( String datatype )
    {
        this.datatype = datatype;
    } //-- void setDatatype( String )

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
     * Set attaches a click behavior for component items with the
     * specified CSS class.
     * 
     * @param onClick
     */
    public void setOnClick( UnknownType onClick )
    {
        this.onClick = onClick;
    } //-- void setOnClick( UnknownType )

    /**
     * Set defines a set of rules for input field(s) of the
     * form(htmlform).
     * 
     * @param rules
     */
    public void setRules( UnknownType rules )
    {
        this.rules = rules;
    } //-- void setRules( UnknownType )

    /**
     * Set enables/disables the scroll bar.
     * 
     * @param scroll
     */
    public void setScroll( UnknownType scroll )
    {
        this.scroll = scroll;
    } //-- void setScroll( UnknownType )

    /**
     * Set the time during which the component is scrolled to the
     * specified position (in milliseconds).
     * 
     * @param scrollSpeed
     */
    public void setScrollSpeed( String scrollSpeed )
    {
        this.scrollSpeed = scrollSpeed;
    } //-- void setScrollSpeed( String )

    /**
     * Set the path to an external template that is loaded by Ajax.
     * 
     * @param src
     */
    public void setSrc( String src )
    {
        this.src = src;
    } //-- void setSrc( String )

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
     * Set name of predefined styling type.
     * 
     * @param type
     */
    public void setType( String type )
    {
        this.type = type;
    } //-- void setType( String )

    /**
     * Set the url of a data feed which will be loaded after
     * component initialization.
     * 
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

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
     * Restores initial form values
     */
    public void clear() {
        return;
    }
    /**
     * Removes "data incorrect" highlighting from invalid text fields
     */
    public void clearValidation() {
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
     * Sets focus into the necessary component
     */
    public void focus() {
        return;
    }
    /**
     * Returns child views of the calling component
     */
    public Byte getChildViews() {
        return null;
    }
    /**
     * Returns hash of original form values
     */
    public Byte getCleanValues() {
        return null;
    }
    /**
     * Returns hash of changed values
     */
    public Byte getDirtyValues() {
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
     * Returns the scroll position
     */
    public Byte getScrollState() {
        return null;
    }
    /**
     * Returns top parent view
     */
    public Byte getTopParentView() {
        return null;
    }
    /**
     * Derives input values from the form
     */
    public Byte getValues() {
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
     * Checks whether changes within form were made
     */
    public Boolean isDirty() {
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
     * Loads data from an external data source
     */
    public Byte load() {
        return null;
    }
    /**
     * Routes events from one object to another
     */
    public void mapEvent() {
        return;
    }
    /**
     * Loads data to the component from an inline data source
     */
    public void parse() {
        return;
    }
    /**
     * Repaints the component
     */
    public void refresh() {
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
     * Scrolls the data container to a certain position
     */
    public void scrollTo() {
        return;
    }
    /**
     * Marks the form as the one with changed values and vice versa
     */
    public void setDirty() {
        return;
    }
    /**
     * Set hmlt for template
     */
    public void setHTML() {
        return;
    }
    /**
     * Sets values into all the form inputs
     */
    public void setValues() {
        return;
    }
    /**
     * Makes the component visible
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
    /**
     * Checks data in the component during adding new item or editing existing ones
     */
    public Boolean validate() {
        return null;
    }
}
