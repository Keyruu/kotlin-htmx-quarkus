package de.keyruu.alpinejs

import kotlinx.html.CommonAttributeGroupFacade
import org.intellij.lang.annotations.Language

var CommonAttributeGroupFacade.xData: String
    get() = attributes.getValue("x-data")
    set(value) {
        attributes["x-data"] = value
    }

var CommonAttributeGroupFacade.xShow: String
    get() = attributes.getValue("x-show")
    set(value) {
        attributes["x-show"] = value
    }

fun CommonAttributeGroupFacade.xBind(attribute: String, @Language("javascript") value: String) {
    attributes["x-bind:$attribute"] = value
}

fun CommonAttributeGroupFacade.xOn(event: String, @Language("javascript") script: String) {
    attributes["x-on:$event"] = script
}

var CommonAttributeGroupFacade.xText: String
    get() = attributes.getValue("x-text")
    set(value) {
        attributes["x-text"] = value
    }
