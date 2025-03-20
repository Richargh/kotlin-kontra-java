package de.richargh.ktkonja.sharedk

import de.richargh.ktkonja.sharedj.api.SharedJava
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SharedJavaTest {
    @Test
    fun `should speak Java`() {
        val testee = SharedJava()

        assertThat(testee.speak()).isEqualTo("Java")
    }
}