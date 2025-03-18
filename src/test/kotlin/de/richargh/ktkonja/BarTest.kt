package de.richargh.ktkonja

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BarTest {
    @Test
    fun testBar() {
        val bar = Bar()
        assertTrue(bar.bar())
    }
}