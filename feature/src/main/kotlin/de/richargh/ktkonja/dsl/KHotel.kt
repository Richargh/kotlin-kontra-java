package de.richargh.ktkonja.dsl

/**
 * For more examples including the @DslMarker check out: https://kotlinlang.org/docs/type-safe-builders.html#full-definition-of-the-com-example-html-package
 */

fun hotel(init: KHotelBuilder.() -> Unit): KHotel {
    return KHotelBuilder().apply(init)._build()
}

class KHotelBuilder {
    var name: String = "Fhloston Paradise Hotel"

    private val rooms = mutableListOf<KRoom>()

    fun room(init: KRoomBuilder.() -> Unit) {
        val room = KRoomBuilder().apply(init)._build()
        rooms.add(room)
    }

    fun _build() = KHotel(name, rooms)
}

data class KHotel(val name: String, val rooms: List<KRoom>)

class KRoomBuilder {
    var number: Int = 314

    private val beds = mutableListOf<KBed>()

    fun bed(init: KBedBuilder.() -> Unit) {
        val bed = KBedBuilder().apply(init)._build()
        beds.add(bed)
    }

    fun _build() = KRoom(number, beds)
}

data class KRoom(val number: Int, val beds: List<KBed>)

class KBedBuilder {
    var type: KBedType = KBedType.Single

    fun _build() = KBed(type)
}

data class KBed(val type: KBedType)

enum class KBedType {Single, Double, Queen}