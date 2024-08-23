package de.keyruu.api

import de.keyruu.BASE_V1
import io.smallrye.mutiny.Multi
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.MediaType
import org.jboss.resteasy.reactive.RestStreamElementType

const val EVENTS_PATH = "$BASE_V1/events"
@Path(EVENTS_PATH)
class Events {

    @Inject
    lateinit var eventChannel: EventChannel

    @GET
    @RestStreamElementType(MediaType.TEXT_HTML)
    fun events(): Multi<String> {
        return eventChannel.stuff
    }
}
