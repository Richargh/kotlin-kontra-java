package de.richargh.ktkonja

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FooTest {
    @Test
    fun `foo test`() {
        val foo = Foo()
        assertEquals(foo, true)
    }
}