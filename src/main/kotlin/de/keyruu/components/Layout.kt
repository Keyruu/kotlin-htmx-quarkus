package de.keyruu.components

import io.quarkiverse.web.bundler.runtime.Bundle
import kotlinx.html.*
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize
import kotlinx.html.stream.createHTML


fun layout(bundle: Bundle, block: HtmlBlockTag.() -> Unit = {}): String  {
    println(bundle.mapping().names())

    return createHTML(true).html {
        head {
            title { +"DSL Index" }
//            script {
//                defer = true
//                type = "text/javascript"
//                src = bundle.script("main")
//            }
            script {
                src = "https://unpkg.com/htmx.org@1.9.11"
                integrity = "sha384-0gxUXCCR8yv9FM2b+U3FDbsKthCI66oH5IA9fHppQq9DDMHuMauqq1ZHBpJxQ0J0"
                crossorigin = ScriptCrossorigin.anonymous
            }
            script {
                src = "https://unpkg.com/htmx.org@1.9.11/dist/ext/sse.js"
            }
            script {
                defer = true
                src = "https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js"
            }
            link { rel = "stylesheet"; href = bundle.style("main") }
        }
        body {
            block()
        }
    }
}
