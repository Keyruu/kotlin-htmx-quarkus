package de.keyruu.htmx

import kotlinx.html.CommonAttributeGroupFacade
import org.intellij.lang.annotations.Language

//Core Attribute Reference
//The most common attributes when using htmx.
//
//Attribute	Description
//hx-get
//issues a GET to the specified URL
//hx-post
//issues a POST to the specified URL
//hx-on*
//handle events with inline scripts on elements
//hx-push-url
//push a URL into the browser location bar to create history
//hx-select
//select content to swap in from a response
//hx-select-oob
//select content to swap in from a response, somewhere other than the target (out of band)
//hx-swap
//controls how content will swap in (outerHTML, beforeend, afterend, …)
//hx-swap-oob
//mark element to swap in from a response (out of band)
//hx-target
//specifies the target element to be swapped
//hx-trigger
//specifies the event that triggers the request
//hx-vals
//add values to submit with the request (JSON format)

/**
 * Issues a GET to the specified URL
 * @see <a href="https://htmx.org/attributes/hx-get/">hx-get</a>
 */
var CommonAttributeGroupFacade.hxGet: String
    get() = attributes.getValue("hx-get")
    set(value) {
        attributes["hx-get"] = value
    }

/**
 * Issues a POST to the specified URL
 * @see <a href="https://htmx.org/attributes/hx-post/">hx-post</a>
 */
var CommonAttributeGroupFacade.hxPost: String
    get() = attributes.getValue("hx-post")
    set(value) {
        attributes["hx-post"] = value
    }

/**
 * Handle events with inline scripts on elements
 * @see <a href="https://htmx.org/attributes/hx-on/">hx-on</a>
 */
fun CommonAttributeGroupFacade.hxOn(event: String, @Language("javascript") script: String) {
    attributes["hx-on:$event"] = script
}

/**
 * Push a URL into the browser location bar to create history
 * @see <a href="https://htmx.org/attributes/hx-push-url/">hx-push-url</a>
 */
var CommonAttributeGroupFacade.hxPushUrl: String
    get() = attributes.getValue("hx-push-url")
    set(value) {
        attributes["hx-push-url"] = value
    }

/**
 * Select content to swap in from a response
 * @see <a href="https://htmx.org/attributes/hx-select/">hx-select</a>
 */
var CommonAttributeGroupFacade.hxSelect: String
    get() = attributes.getValue("hx-select")
    set(value) {
        attributes["hx-select"] = value
    }

/**
 * Select content to swap in from a response, somewhere other than the target (out of band)
 * @see <a href="https://htmx.org/attributes/hx-select-oob/">hx-select-oob</a>
 */
var CommonAttributeGroupFacade.hxSelectOob: String
    get() = attributes.getValue("hx-select-oob")
    set(value) {
        attributes["hx-select-oob"] = value
    }

//innerHTML - Replace the inner html of the target element
//outerHTML - Replace the entire target element with the response
//beforebegin - Insert the response before the target element
//afterbegin - Insert the response before the first child of the target element
//beforeend - Insert the response after the last child of the target element
//afterend - Insert the response after the target element
//delete - Deletes the target element regardless of the response
//none- Does not append content from response (out of band items will still be processed).

enum class HxSwap(val value: String) {
    InnerHtml("innerHTML"),
    OuterHtml("outerHTML"),
    BeforeBegin("beforebegin"),
    AfterBegin("afterbegin"),
    BeforeEnd("beforeend"),
    AfterEnd("afterend"),
    Delete("delete"),
    None("none")
}

/**
 * Controls how content will swap in (outerHTML, beforeend, afterend, …)
 *
 * innerHTML - Replace the inner html of the target element
 * outerHTML - Replace the entire target element with the response
 * beforebegin - Insert the response before the target element
 * afterbegin - Insert the response before the first child of the target element
 * beforeend - Insert the response after the last child of the target element
 * afterend - Insert the response after the target element
 * delete - Deletes the target element regardless of the response
 * none- Does not append content from response (out of band items will still be processed).
 *
 * @see <a href="https://htmx.org/attributes/hx-swap/">hx-swap</a>
 */
var CommonAttributeGroupFacade.hxSwap: HxSwap
    get() = HxSwap.valueOf(attributes.getValue("hx-swap"))
    set(value) {
        attributes["hx-swap"] = value.value
    }

/**
 * Mark element to swap in from a response (out of band)
 * @see <a href="https://htmx.org/attributes/hx-swap-oob/">hx-swap-oob</a>
 */
var CommonAttributeGroupFacade.hxSwapOob: String
    get() = attributes.getValue("hx-swap-oob")
    set(value) {
        attributes["hx-swap-oob"] = value
    }

/**
 * Specifies the target element to be swapped
 * @see <a href="https://htmx.org/attributes/hx-target/">hx-target</a>
 */
var CommonAttributeGroupFacade.hxTarget: String
    get() = attributes.getValue("hx-target")
    set(value) {
        attributes["hx-target"] = value
    }

/**
 * Specifies the event that triggers the request
 * @see <a href="https://htmx.org/attributes/hx-trigger/">hx-trigger</a>
 */
var CommonAttributeGroupFacade.hxTrigger: String
    get() = attributes.getValue("hx-trigger")
    set(value) {
        attributes["hx-trigger"] = value
    }

/**
 * Add values to submit with the request (JSON format)
 * @see <a href="https://htmx.org/attributes/hx-vals/">hx-vals</a>
 */
var CommonAttributeGroupFacade.hxVals: String
    get() = attributes.getValue("hx-vals")
    set(value) {
        attributes["hx-vals"] = value
    }

