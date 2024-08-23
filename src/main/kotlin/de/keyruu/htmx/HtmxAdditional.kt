package de.keyruu.htmx

import kotlinx.html.CommonAttributeGroupFacade

//Additional Attribute Reference
//All other attributes available in htmx.
//
//Attribute	Description
//hx-boost
//add progressive enhancement for links and forms
//hx-confirm
//shows a confirm() dialog before issuing a request
//hx-delete
//issues a DELETE to the specified URL
//hx-disable
//disables htmx processing for the given node and any children nodes
//hx-disabled-elt
//adds the disabled attribute to the specified elements while a request is in flight
//hx-disinherit
//control and disable automatic attribute inheritance for child nodes
//hx-encoding
//changes the request encoding type
//hx-ext
//extensions to use for this element
//hx-headers
//adds to the headers that will be submitted with the request
//hx-history
//prevent sensitive data being saved to the history cache
//hx-history-elt
//the element to snapshot and restore during history navigation
//hx-include
//include additional data in requests
//hx-indicator
//the element to put the htmx-request class on during the request
//hx-params
//filters the parameters that will be submitted with a request
//hx-patch
//issues a PATCH to the specified URL
//hx-preserve
//specifies elements to keep unchanged between requests
//hx-prompt
//shows a prompt() before submitting a request
//hx-put
//issues a PUT to the specified URL
//hx-replace-url
//replace the URL in the browser location bar
//hx-request
//configures various aspects of the request
//hx-sse
//has been moved to an extension. Documentation for older versions
//hx-sync
//control how requests made by different elements are synchronized
//hx-validate
//force elements to validate themselves before a request
//hx-vars
//adds values dynamically to the parameters to submit with the request (deprecated, please use hx-vals)
//hx-ws
//has been moved to an extension. Documentation for older versions

/**
 * Add progressive enhancement for links and forms
 * @see <a href="https://htmx.org/attributes/hx-boost/">hx-boost</a>
 */
var CommonAttributeGroupFacade.hxBoost: Boolean
    get() = attributes.getValue("hx-boost").toBoolean()
    set(value) {
        attributes["hx-boost"] = value.toString()
    }

/**
 * Shows a confirm() dialog before issuing a request
 * @see <a href="https://htmx.org/attributes/hx-confirm/">hx-confirm</a>
 */
var CommonAttributeGroupFacade.hxConfirm: String
    get() = attributes.getValue("hx-confirm")
    set(value) {
        attributes["hx-confirm"] = value
    }

/**
 * Issues a DELETE to the specified URL
 * @see <a href="https://htmx.org/attributes/hx-delete/">hx-delete</a>
 */
var CommonAttributeGroupFacade.hxDelete: String
    get() = attributes.getValue("hx-delete")
    set(value) {
        attributes["hx-delete"] = value
    }

/**
 * Disables htmx processing for the given node and any children nodes
 * @see <a href="https://htmx.org/attributes/hx-disable/">hx-disable</a>
 */
var CommonAttributeGroupFacade.hxDisable: Boolean
    get() = attributes.getValue("hx-disable").toBoolean()
    set(value) {
        attributes["hx-disable"] = value.toString()
    }

/**
 * Adds the disabled attribute to the specified elements while a request is in flight
 * @see <a href="https://htmx.org/attributes/hx-disabled-elt/">hx-disabled-elt</a>
 */
var CommonAttributeGroupFacade.hxDisabledElt: String
    get() = attributes.getValue("hx-disabled-elt")
    set(value) {
        attributes["hx-disabled-elt"] = value
    }

/**
 * Control and disable automatic attribute inheritance for child nodes
 * @see <a href="https://htmx.org/attributes/hx-disinherit/">hx-disinherit</a>
 */
var CommonAttributeGroupFacade.hxDisinherit: Boolean
    get() = attributes.getValue("hx-disinherit").toBoolean()
    set(value) {
        attributes["hx-disinherit"] = value.toString()
    }

/**
 * Changes the request encoding type
 * @see <a href="https://htmx.org/attributes/hx-encoding/">hx-encoding</a>
 */
var CommonAttributeGroupFacade.hxEncoding: String
    get() = attributes.getValue("hx-encoding")
    set(value) {
        attributes["hx-encoding"] = value
    }

/**
 * Extensions to use for this element
 * @see <a href="https://htmx.org/attributes/hx-ext/">hx-ext</a>
 */
var CommonAttributeGroupFacade.hxExt: String
    get() = attributes.getValue("hx-ext")
    set(value) {
        attributes["hx-ext"] = value
    }

/**
 * Adds to the headers that will be submitted with the request
 * @see <a href="https://htmx.org/attributes/hx-headers/">hx-headers</a>
 */
var CommonAttributeGroupFacade.hxHeaders: String
    get() = attributes.getValue("hx-headers")
    set(value) {
        attributes["hx-headers"] = value
    }

/**
 * Prevent sensitive data being saved to the history cache
 * @see <a href="https://htmx.org/attributes/hx-history/">hx-history</a>
 */
var CommonAttributeGroupFacade.hxHistory: Boolean
    get() = attributes.getValue("hx-history").toBoolean()
    set(value) {
        attributes["hx-history"] = value.toString()
    }

/**
 * The element to snapshot and restore during history navigation
 * @see <a href="https://htmx.org/attributes/hx-history-elt/">hx-history-elt</a>
 */
var CommonAttributeGroupFacade.hxHistoryElt: String
    get() = attributes.getValue("hx-history-elt")
    set(value) {
        attributes["hx-history-elt"] = value
    }

/**
 * Include additional data in requests
 * @see <a href="https://htmx.org/attributes/hx-include/">hx-include</a>
 */
var CommonAttributeGroupFacade.hxInclude: String
    get() = attributes.getValue("hx-include")
    set(value) {
        attributes["hx-include"] = value
    }

/**
 * The element to put the htmx-request class on during the request
 * @see <a href="https://htmx.org/attributes/hx-indicator/">hx-indicator</a>
 */
var CommonAttributeGroupFacade.hxIndicator: String
    get() = attributes.getValue("hx-indicator")
    set(value) {
        attributes["hx-indicator"] = value
    }

/**
 * Filters the parameters that will be submitted with a request
 * @see <a href="https://htmx.org/attributes/hx-params/">hx-params</a>
 */
var CommonAttributeGroupFacade.hxParams: String
    get() = attributes.getValue("hx-params")
    set(value) {
        attributes["hx-params"] = value
    }

/**
 * Issues a PATCH to the specified URL
 * @see <a href="https://htmx.org/attributes/hx-patch/">hx-patch</a>
 */
var CommonAttributeGroupFacade.hxPatch: String
    get() = attributes.getValue("hx-patch")
    set(value) {
        attributes["hx-patch"] = value
    }

/**
 * Specifies elements to keep unchanged between requests
 * @see <a href="https://htmx.org/attributes/hx-preserve/">hx-preserve</a>
 */
var CommonAttributeGroupFacade.hxPreserve: String
    get() = attributes.getValue("hx-preserve")
    set(value) {
        attributes["hx-preserve"] = value
    }

/**
 * Shows a prompt() before submitting a request
 * @see <a href="https://htmx.org/attributes/hx-prompt/">hx-prompt</a>
 */
var CommonAttributeGroupFacade.hxPrompt: String
    get() = attributes.getValue("hx-prompt")
    set(value) {
        attributes["hx-prompt"] = value
    }

/**
 * Issues a PUT to the specified URL
 * @see <a href="https://htmx.org/attributes/hx-put/">hx-put</a>
 */
var CommonAttributeGroupFacade.hxPut: String
    get() = attributes.getValue("hx-put")
    set(value) {
        attributes["hx-put"] = value
    }

/**
 * Replace the URL in the browser location bar
 * @see <a href="https://htmx.org/attributes/hx-replace-url/">hx-replace-url</a>
 */
var CommonAttributeGroupFacade.hxReplaceUrl: String
    get() = attributes.getValue("hx-replace-url")
    set(value) {
        attributes["hx-replace-url"] = value
    }

/**
 * Configures various aspects of the request
 * @see <a href="https://htmx.org/attributes/hx-request/">hx-request</a>
 */
var CommonAttributeGroupFacade.hxRequest: String
    get() = attributes.getValue("hx-request")
    set(value) {
        attributes["hx-request"] = value
    }

/**
 * Control how requests made by different elements are synchronized
 * @see <a href="https://htmx.org/attributes/hx-sync/">hx-sync</a>
 */
var CommonAttributeGroupFacade.hxSync: String
    get() = attributes.getValue("hx-sync")
    set(value) {
        attributes["hx-sync"] = value
    }

/**
 * Force elements to validate themselves before a request
 * @see <a href="https://htmx.org/attributes/hx-validate/">hx-validate</a>
 */
var CommonAttributeGroupFacade.hxValidate: String
    get() = attributes.getValue("hx-validate")
    set(value) {
        attributes["hx-validate"] = value
    }
