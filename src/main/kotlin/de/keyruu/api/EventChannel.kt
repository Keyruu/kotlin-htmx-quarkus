package de.keyruu.api

import io.quarkus.scheduler.Scheduled
import io.smallrye.mutiny.Multi
import io.smallrye.mutiny.operators.multi.processors.BroadcastProcessor
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class EventChannel {

    var stuff: BroadcastProcessor<String> = BroadcastProcessor.create()

    @Scheduled(every = "10s")
    fun sendStuff() {
        stuff.onNext("Hello, Bitch!")
    }
}
