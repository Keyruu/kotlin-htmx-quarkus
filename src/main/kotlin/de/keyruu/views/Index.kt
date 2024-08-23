package de.keyruu.views

import de.keyruu.alpinejs.xBind
import de.keyruu.alpinejs.xData
import de.keyruu.alpinejs.xOn
import de.keyruu.alpinejs.xText
import de.keyruu.api.EVENTS_PATH
import de.keyruu.components.icon
import de.keyruu.components.layout
import de.keyruu.htmx.*
import io.quarkiverse.web.bundler.runtime.Bundle
import io.vertx.mutiny.ext.web.Router
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import kotlinx.html.*

@Path("/")
class Index {

    @Inject
    lateinit var bundle: Bundle

    @Inject
    lateinit var router: Router

    @GET
    @Produces(MediaType.TEXT_HTML)
    fun index(): String {
        return layout(bundle) {
            section("bg-white dark:bg-gray-900") {
                div("py-8 px-4 mx-auto max-w-screen-xl text-center lg:py-16 lg:px-12") {
                    a(classes = "inline-flex justify-between items-center py-1 px-1 pr-4 mb-7 text-sm text-gray-700 bg-gray-100 rounded-full dark:bg-gray-800 dark:text-white hover:bg-gray-200 dark:hover:bg-gray-700") {
                        href = "#"
                        role = "alert"
                        hxExt = "sse"
                        sseConnect = EVENTS_PATH
                        sseSwap = "message"
                        hxSwap = HxSwap.BeforeEnd
                        span("text-xs bg-primary-600 rounded-full text-white px-4 py-1.5 mr-3") { +"""New""" }
                        span("text-sm font-medium") { +"""Flowbite is out! See what's new""" }
                        icon("mdi:close-circle-outline")
                        span("icon-[mdi-light--home] w-6 h-6") {  }
                    }
                    div {
                        xData = "{ count: 0 }"
                        button(classes = "mb-4 px-4 py-2 text-sm font-medium text-white bg-primary-700 rounded-lg hover:bg-primary-800 focus:ring-4 focus:ring-primary-300 dark:focus:ring-primary-900") {
                            xOn("click", "count--")
                            +"Decrease"
                        }
                        span(classes = "text-2xl font-bold text-gray-900 dark:text-white") {
                            xText = "count"
                            hxGet = "/api/count"
                            xBind("hx-vals", "JSON.stringify({ count: count })")
                        }
                        button(classes = "px-4 py-2 text-sm font-medium text-white bg-primary-700 rounded-lg hover:bg-primary-800 focus:ring-4 focus:ring-primary-300 dark:focus:ring-primary-900") {
                            xOn("click", "count++")
                            +"Increase"
                        }
                    }
                    h1("mb-4 text-4xl font-extrabold tracking-tight leading-none text-gray-900 md:text-5xl lg:text-6xl dark:text-white") { +"""We invest in the world’s potential""" }
                    p("mb-8 text-lg font-normal text-gray-500 lg:text-xl sm:px-16 xl:px-48 dark:text-gray-400") { +"""Here at Flowbite we focus on markets where technology, innovation, and capital can unlock long-term value and drive economic growth.""" }
                    div(classes = "flex flex-col mb-8 lg:mb-16 space-y-4 sm:flex-row sm:justify-center sm:space-y-0 sm:space-x-4") {
                        a(classes = "inline-flex justify-center items-center py-3 px-5 text-base font-medium text-center text-white rounded-lg bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:ring-primary-300 dark:focus:ring-primary-900") {
                            href = "#"
                            +"""Learn more"""

                        }
                        a(classes = "inline-flex justify-center items-center py-3 px-5 text-base font-medium text-center text-gray-900 rounded-lg border border-gray-300 hover:bg-gray-100 focus:ring-4 focus:ring-gray-100 dark:text-white dark:border-gray-700 dark:hover:bg-gray-700 dark:focus:ring-gray-800") {
                            href = "#"
                            +"""Watch video"""
                        }
                    }
                    div("px-4 mx-auto text-center md:max-w-screen-md lg:max-w-screen-lg lg:px-36") {
                        span("font-semibold text-gray-400 uppercase") { +"""FEATURED IN""" }
                        div("flex flex-wrap justify-center items-center mt-8 text-gray-500 sm:justify-between") {
                            a(classes = "mr-5 mb-5 lg:mb-0 hover:text-gray-800 dark:hover:text-gray-400") {
                                href = "#"
                            }
                            a(classes = "mr-5 mb-5 lg:mb-0 hover:text-gray-800 dark:hover:text-gray-400") {
                                href = "#"
                            }
                            a(classes = "mr-5 mb-5 lg:mb-0 hover:text-gray-800 dark:hover:text-gray-400") {
                                href = "#"
                            }
                        }
                    }
                }
            }
            section("bg-white dark:bg-gray-900") {
                div("grid max-w-screen-xl px-4 py-8 mx-auto lg:gap-8 xl:gap-0 lg:py-16 lg:grid-cols-12") {
                    div("mr-auto place-self-center lg:col-span-7") {
                        h1("max-w-2xl mb-4 text-4xl font-extrabold tracking-tight leading-none md:text-5xl xl:text-6xl dark:text-white") { +"""Payments tool for software companies""" }
                        p("max-w-2xl mb-6 font-light text-gray-500 lg:mb-8 md:text-lg lg:text-xl dark:text-gray-400") {
                            +"""From checkout to global sales tax compliance, companies around the world use Flowbite to simplify their payment stack."""
                        }
                        a(classes = "inline-flex items-center justify-center px-5 py-3 mr-3 text-base font-medium text-center text-white rounded-lg bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:ring-primary-300 dark:focus:ring-primary-900") {
                            href = "#"
                            +"""Get started"""
                        }
                        a(classes = "inline-flex items-center justify-center px-5 py-3 text-base font-medium text-center text-gray-900 border border-gray-300 rounded-lg hover:bg-gray-100 focus:ring-4 focus:ring-gray-100 dark:text-white dark:border-gray-700 dark:hover:bg-gray-700 dark:focus:ring-gray-800") {
                            href = "#"
                            +"""Speak to Sales"""
                        }
                    }
                    div("hidden lg:mt-0 lg:col-span-5 lg:flex") {
                        img {
                            src = "https://flowbite.s3.amazonaws.com/blocks/marketing-ui/hero/phone-mockup.png"
                            alt = "mockup"
                        }
                    }
                }
            }
        }
    }
}
