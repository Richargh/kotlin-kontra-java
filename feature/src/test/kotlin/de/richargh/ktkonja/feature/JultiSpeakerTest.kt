package de.richargh.ktkonja.feature

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JultiSpeakerTest {

    @Test
    fun `foo test`() {
        val testee = JultiSpeaker()
        assertThat(testee.speak()).isEqualTo("asd")
    }

}