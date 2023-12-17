package de.keyruu

import io.quarkus.arc.Arc
import io.quarkus.csrf.reactive.runtime.CsrfTokenParameterProvider
import io.quarkus.qute.TemplateGlobal


@TemplateGlobal
object Globals {
    @JvmStatic
    fun buttonColors() = "border border-gray-300 hover:bg-gray-100 focus:ring-4 " +
            "focus:ring-gray-100 dark:text-white dark:border-gray-700 dark:hover:bg-gray-700 " +
            "dark:focus:ring-gray-800"
}
