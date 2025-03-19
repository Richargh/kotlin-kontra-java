package de.richargh.ktkonja.sharedk

import de.richargh.ktkonja.sharedj.SharedJava
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SharedJavaTest {
    @Test
    fun `testKonja testee`() {
        val testee = SharedJava()

        assertThat(testee.speak()).isEqualTo("Java")
    }
}