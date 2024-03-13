package de.keyruu.components

import io.quarkiverse.web.bundler.runtime.Bundle
import kotlinx.html.*
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize


fun layout(bundle: Bundle, block: HtmlBlockTag.() -> Unit = {}): String  {
    return createHTMLDocument().html {
        head {
            title { +"DSL Index" }
            script { src = bundle.script("main") }
            link { rel = "stylesheet"; href = bundle.style("main") }
        }
        body {
            block()
        }
    }.serialize(true)
}
