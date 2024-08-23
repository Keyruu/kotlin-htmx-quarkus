package de.keyruu.components

import kotlinx.html.*

fun FlowOrPhrasingContent.icon(icon: String, width: Int = 20, height: Int = 20, classes: String = "") {
    span("$icon w-[${width}px] h-[${height}px] $classes") {}
}
