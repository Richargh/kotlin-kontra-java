package de.richargh.ktkonja.feature

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KultiSpeakerTest {
    @Test
    fun `should speak Kotlin and Java`() {
        val testee = KultiSpeaker()

        assertThat(testee.speak()).containsExactly("Kotlin", "Java")
    }
}