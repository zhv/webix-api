
package com.webix.ui.model;


public enum Event
{
    /**
     * Fires when the component is ready to receive data from the master component
     **/
    ON_BIND_REQUEST,

    /**
     * Occurs when component destroyed
     **/
    ON_DESTRUCT,

    /**
     * Fires after the context menu was called in the item area
     **/
    ON_AFTER_CONTEXT_MENU,

    /**
     * Occurs when some webix view has been scrolled
     **/
    ON_AFTER_SCROLL,

    /**
     * Fires before the context menu is called in the item area
     **/
    ON_BEFORE_CONTEXT_MENU,

    /**
     * Fires when a component item was clicked
     **/
    ON_ITEM_CLICK,

    /**
     * Fires when a component item was double-clicked
     **/
    ON_ITEM_DBL_CLICK,

    /**
     * Fires on holding finger in some position for a certain period of time
     **/
    ON_LONG_TOUCH,

    /**
     * Fires when the mouse was moved over the specified component
     **/
    ON_MOUSE_MOVE,

    /**
     * Fires when the mouse was moved over the component
     **/
    ON_MOUSE_MOVING,

    /**
     * Fires when the mouse was moved out from the specified item
     **/
    ON_MOUSE_OUT,

    /**
     * Occurs on screen rotating
     **/
    ON_ROTATE,

    /**
     * Occurs on a horizontal swipe movement
     **/
    ON_SWIPE_X,

    /**
     * Occurs on a vertical swipe movement
     **/
    ON_SWIPE_Y,

    /**
     * Occurs when the touch event is ended
     **/
    ON_TOUCH_END,

    /**
     * Occurs during touch movement
     **/
    ON_TOUCH_MOVE,

    /**
     * When some webix view has been touched
     **/
    ON_TOUCH_START,

    /**
     * View size was changed by resizer
     **/
    ON_VIEW_RESIZE,

    /**
     * Occurs immediately after the component has been rendered.
     **/
    ON_AFTER_RENDER,

    /**
     * Occurs immediately before the component has been rendered
     **/
    ON_BEFORE_RENDER,

    /**
     * Fires when the value of the control is changed
     **/
    ON_CHANGE,

    /**
     * Occurs when keyboard key is pressed for the control in focus
     **/
    ON_KEY_PRESS,

    /**
     * Fires after a user has selected a date
     **/
    ON_AFTER_DATE_SELECT,

    /**
     * Called after month in selector is changed.
     **/
    ON_AFTER_MONTH_CHANGE,

    /**
     * Fires after zoom level of the calendar has been changed
     **/
    ON_AFTER_ZOOM,

    /**
     * Fires when a user clicks on a date but before it is selected in the calendar
     **/
    ON_BEFORE_DATE_SELECT,

    /**
     * Triggered immediately before month in selector is changed.
     **/
    ON_BEFORE_MONTH_CHANGE,

    /**
     * Fires before zoom level of the calendar is changed
     **/
    ON_BEFORE_ZOOM,

    /**
     * Fires when a user selects a date.
     **/
    ON_DATE_SELECT,

    /**
     * Fires when a new view is shown in carousel
     **/
    ON_SHOW,

    /**
     * Fires after adding item to datastore
     **/
    ON_AFTER_ADD,

    /**
     * Fires after item deleting
     **/
    ON_AFTER_DELETE,

    /**
     * Fires after xml loading is complete
     **/
    ON_AFTER_LOAD,

    /**
     * Fires after sorting dataset
     **/
    ON_AFTER_SORT,

    /**
     * Fires before adding item to datastore
     **/
    ON_BEFORE_ADD,

    /**
     * Fires before item deleting
     **/
    ON_BEFORE_DELETE,

    /**
     * Occurs immediately before loading xml data has been started
     **/
    ON_BEFORE_LOAD,

    /**
     * Fires before sorting dataset
     **/
    ON_BEFORE_SORT,

    /**
     * Fires when data from the server side is requested (part of dynamic loading)
     **/
    ON_DATA_REQUEST,

    /**
     * Fires when data item is in update process
     **/
    ON_DATA_UPDATE,

    /**
     * Fires when an error occurs during data loading ( invalid server side response )
     **/
    ON_LOAD_ERROR,

    /**
     * Fires after typing has been finished in the field
     **/
    ON_TIMED_KEY_PRESS,

    /**
     * Fires the moment context menu is called
     **/
    ON_BEFORE_SHOW,

    /**
     * Fires when window is hidden
     **/
    ON_HIDE,

    /**
     * Fires while view is moving
     **/
    ON_VIEW_MOVE,

    /**
     * Fires when view has stopped moving
     **/
    ON_VIEW_MOVE_END,

    /**
     * Fires after drag-n-drop was finished
     **/
    ON_AFTER_DROP,

    /**
     * Fires after item was selected
     **/
    ON_AFTER_SELECT,

    /**
     * Fires before the mouse button is pressed and the cursor is moved over a draggable item
     **/
    ON_BEFORE_DRAG,

    /**
     * Fires before a dragged element is moved over the droppable area
     **/
    ON_BEFORE_DRAG_IN,

    /**
     * Fires before a dragged element is released over the droppable area
     **/
    ON_BEFORE_DROP,

    /**
     * Fires before a dragged element is released over the droppable area
     **/
    ON_BEFORE_DROP_OUT,

    /**
     * Fires before item selection is started
     **/
    ON_BEFORE_SELECT,

    /**
     * Fires when a dragged element is moved outside of the droppable area
     **/
    ON_DRAG_OUT,

    /**
     * For each item rendering, occurs only for items with custom templates
     **/
    ON_ITEM_RENDER,

    /**
     * Fires when menu item has been clicked
     **/
    ON_MENU_ITEM_CLICK,

    /**
     * Fires when the user presses ctrl+v keys combination
     **/
    ON_PASTE,

    /**
     * Fires after selection state was changed
     **/
    ON_SELECT_CHANGE,

    /**
     * Fires when newly loaded/added/edited data fails to pass validation
     **/
    ON_VALIDATION_ERROR,

    /**
     * Fires after the newlyloaded/added/edited data has passes validation successfully
     **/
    ON_VALIDATION_SUCCESS,

    /**
     * Some item selected in the suggest control
     **/
    ON_VALUE_SUGGEST,

    /**
     * Fires after the column has been dragged and dropped to the target position
     **/
    ON_AFTER_COLUMN_DROP,

    /**
     * Fires after the column order was changed with the help of drag-and-drop
     **/
    ON_AFTER_COLUMN_DROP_ORDER,

    /**
     * Fires after edit operation was initiated, editor opened and ready for input
     **/
    ON_AFTER_EDIT_START,

    /**
     * Fires after edit operation finished
     **/
    ON_AFTER_EDIT_STOP,

    /**
     * Occurs after datatable was filtered
     **/
    ON_AFTER_FILTER,

    /**
     * Fires after a cell is unselected
     **/
    ON_AFTER_UNSELECT,

    /**
     * Fires the monent you start dragging the column from its source potition
     **/
    ON_BEFORE_COLUMN_DRAG,

    /**
     * Fires the moment you drop the column to its target position
     **/
    ON_BEFORE_COLUMN_DROP,

    /**
     * Fires the moment you drop the column over the target area
     **/
    ON_BEFORE_COLUMN_DROP_ORDER,

    /**
     * Fires before edit operation is initiated
     **/
    ON_BEFORE_EDIT_START,

    /**
     * Fires before stop edit command is received
     **/
    ON_BEFORE_EDIT_STOP,

    /**
     * Called when filtering process is started, but data is not filtered yet
     **/
    ON_BEFORE_FILTER,

    /**
     * Fired before a cell is unselected
     **/
    ON_BEFORE_UN_SELECT,

    /**
     * Fires when a checkbox is checked or unchecked in the datatable item
     **/
    ON_CHECK,

    /**
     * Fires when width of column was changed
     **/
    ON_COLUMN_RESIZE,

    /**
     * Occurs after clicking on header
     **/
    ON_HEADER_CLICK,

    /**
     * Occurs when data was changed in the editor
     **/
    ON_LIVE_EDIT,

    /**
     * Fires when the width or height of datatable was changed
     **/
    ON_RESIZE,

    /**
     * Fires when height of row was changed
     **/
    ON_ROW_RESIZE,

    /**
     * Fires when the user scrolls the table left or right
     **/
    ON_SCROLL_X,

    /**
     * Fires when the user scrolls the table up or down
     **/
    ON_SCROLL_Y,

    /**
     * Fires when the structure of datatable (columns configuration) is initialized
     **/
    ON_STRUCTURE_LOAD,

    /**
     * Fires when structure of datatable was changed ( column added, hidden or reconfigured )
     **/
    ON_STRUCTURE_UPDATE,

    /**
     * Fires after data has been validated
     **/
    ON_AFTER_VALIDATION,

    /**
     * Called before runing validation
     **/
    ON_BEFORE_VALIDATE,

    /**
     * Fires when enter key is pressed for a focused control in the form
     **/
    ON_SUBMIT,

    /**
     * Fires the moment back() fucntion is triggered
     **/
    ON_BEFORE_BACK,

    /**
     * Fires when the views are switched in the component (regardless of the switching method)
     **/
    ON_VIEW_CHANGE,

    /**
     * Fires after the 'search' icon has been clicked in the input
     **/
    ON_SEARCH_ICON_CLICK,

    /**
     * Fires after a segment has been clicked
     **/
    ON_AFTER_TAB_CLICK,

    /**
     * Fires before a segment is clicked
     **/
    ON_BEFORE_TAB_CLICK,

    /**
     * Fires after the option (tab, segment) has been removed
     **/
    ON_OPTION_REMOVE,

    /**
     * Fires when the handle of slider was dragged ( but not released yet )
     **/
    ON_SLIDER_DRAG,

    /**
     * Fires before the tab is closed
     **/
    ON_BEFORE_TAB_CLOSE,

    /**
     * Fires after the branch has been closed
     **/
    ON_AFTER_CLOSE,

    /**
     * Fires after the branch has been opened
     **/
    ON_AFTER_OPEN,

    /**
     * Fires the moment you attempt to close the tree branch
     **/
    ON_BEFORE_CLOSE,

    /**
     * Fires the moment you attempt to open the tree branch
     **/
    ON_BEFORE_OPEN,

    /**
     * Fires when you check an item in tree and treetable
     **/
    ON_ITEM_CHECK,

    /**
     * Called when part of tree is repainted
     **/
    ON_PARTIAL_RENDER;

    public String toWebixName() {
        StringBuffer sb = new StringBuffer();
    	String n = this.name();
    	String nLower = n.toLowerCase();
    	for (int i = 0, c = n.length() - 1; i < c; i++) {
    		if (n.charAt(i + 1) == '_') {
    			sb.append(n.charAt(i));
    			i++;
    		} else {
    			sb.append(nLower.charAt(i));
    		}
    	}
        return sb.toString();
    }

    public Event fromWebixName(String webixName) {
        StringBuffer sb = new StringBuffer();
    	if (webixName.length() > 0) {
    		sb.append(Character.toUpperCase(webixName.charAt(0)));
    	}
    	for (int i = 1, c = webixName.length(); i < c; i++) {
    		char ch = webixName.charAt(i);
    		if (Character.isLowerCase(webixName.charAt(i - 1)) && Character.isUpperCase(ch)) {
    			sb.append('_');
    		}
    		sb.append(Character.toUpperCase(ch));
    	}
        return valueOf(Event.class, sb.toString());
    }
}

