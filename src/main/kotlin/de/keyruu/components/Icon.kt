package de.keyruu.components

import kotlinx.html.*

//Required attribute:
//
//icon, IconifyIcon|string icon name or icon data. Because attributes can only be strings, if you want to provide IconifyIcon data, you need to either use property or JSON.stringify() it. See icon data.
//Optional attributes:
//
//mode, string sets icon rendering mode. See rendering modes.
//inline, boolean changes vertical alignment. See vertical alignment.
//width, string|number icon width. See icon dimensions.
//height, string|number icon height. See icon dimensions.
//flip, string flip icon. See icon transformations.
//rotate, number|string rotates icon. See icon transformations.
class ICON(icon: String, consumer: TagConsumer<*>) :
    HTMLTag(
        "iconify-icon", consumer, mapOf("icon" to icon),
        inlineTag = true,
        emptyTag = false
    ), HtmlInlineTag {
    var mode: String
        get() = attributes["mode"]!!
        set(value) {
            attributes["mode"] = value
        }

    var inline: Boolean
        get() = attributes["inline"]!!.toBoolean()
        set(value) {
            attributes["inline"] = value.toString()
        }

    var width: Int
        get() = attributes["width"]!!.toInt()
        set(value) {
            attributes["width"] = value.toString()
        }

    var height: Int
        get() = attributes["height"]!!.toInt()
        set(value) {
            attributes["height"] = value.toString()
        }

    var flip: String
        get() = attributes["flip"]!!
        set(value) {
            attributes["flip"] = value
        }

    var rotate: Int
        get() = attributes["rotate"]!!.toInt()
        set(value) {
            attributes["rotate"] = value.toString()
        }
}

fun FlowOrPhrasingContent.icon(icon: String, block: ICON.() -> Unit = {}) {
    ICON(icon, consumer).visit(block)
}
