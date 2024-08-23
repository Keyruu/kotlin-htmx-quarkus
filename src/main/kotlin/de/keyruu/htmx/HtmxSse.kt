package de.keyruu.htmx

import kotlinx.html.CommonAttributeGroupFacade

//sse-connect="<url>" - The URL of the SSE server.
//sse-swap="<message-name>" - The name of the message to swap into the DOM.
//hx-swap - You can control the swap strategy by using the hx-swap attribute, though note that modifiers like scroll are not supported.
//hx-trigger="sse:<message-name>" - SSE messages can also trigger HTTP callbacks using the hx-trigger attribute.

/**
 * The URL of the SSE server.
 * @see <a href="https://htmx.org/extensions/server-sent-events/">Server Sent Events</a>
 */
var CommonAttributeGroupFacade.sseConnect: String
    get() = attributes.getValue("sse-connect")
    set(value) {
        attributes["sse-connect"] = value
    }

/**
 * You can control the swap strategy by using the hx-swap attribute, though note that modifiers like scroll are not supported.
 * @see <a href="https://htmx.org/extensions/server-sent-events/">Server Sent Events</a>
 */
var CommonAttributeGroupFacade.sseSwap: String
    get() = attributes.getValue("sse-swap")
    set(value) {
        attributes["sse-swap"] = value
    }
