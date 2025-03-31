package de.richargh.ktkonja.example.module

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JultiSpeakerTest {

    @Test
    fun `should speak Kotlin and Java`() {
        val testee = JultiSpeaker()

        assertThat(testee.speak()).containsExactly("Kotlin", "Java")
    }

}