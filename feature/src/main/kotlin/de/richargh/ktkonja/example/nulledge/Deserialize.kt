package de.richargh.ktkonja.example.nulledge

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun main(){
    val mapper = jacksonObjectMapper()

    val json = """{ "name": "Good Boy" }""".trimIndent()
    val result = mapper.readValue(json, Dog::class.java)
    println(result)
}

data class Dog(var id: String, var name: String)