package de.richargh.ktkonja.dsl

/**
 * For more examples including the @DslMarker check out: https://kotlinlang.org/docs/type-safe-builders.html#full-definition-of-the-com-example-html-package
 */

fun hotel(init: HotelBuilder.() -> Unit): Hotel {
    return HotelBuilder().apply(init)._build()
}

class HotelBuilder {
    var name: String = "Fhloston Paradise Hotel"

    private val rooms = mutableListOf<Room>()

    fun room(init: RoomBuilder.() -> Unit) {
        val room = RoomBuilder().apply(init)._build()
        rooms.add(room)
    }

    fun _build() = Hotel(name, rooms)
}

data class Hotel(val name: String, val rooms: List<Room>)

class RoomBuilder {
    var number: Int = 314

    private val beds = mutableListOf<Bed>()

    fun bed(init: BedBuilder.() -> Unit) {
        val bed = BedBuilder().apply(init)._build()
        beds.add(bed)
    }

    fun _build() = Room(number, beds)
}

data class Room(val number: Int, val beds: List<Bed>)

class BedBuilder {
    var type: BedType = BedType.Single

    fun _build() = Bed(type)
}

data class Bed(val type: BedType)

enum class BedType {Single, Double, Queen}