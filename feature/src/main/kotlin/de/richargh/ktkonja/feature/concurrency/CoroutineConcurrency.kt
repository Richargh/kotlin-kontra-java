package de.richargh.ktkonja.feature.concurrency

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.time.Duration
import java.time.Instant

suspend fun main(): Unit = coroutineScope {
    launch {
        println("Starting")
    }

    val begin = Instant.now()
    coroutineScope { // scope for coroutines
        repeat(10_000) { i ->
            launch {
                delay(1_000)
                i
            }
        }
    }
    val end = Instant.now()
    println(Duration.between(begin, end))
}
