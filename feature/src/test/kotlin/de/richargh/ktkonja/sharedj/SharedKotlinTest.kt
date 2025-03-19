package de.richargh.ktkonja.sharedj

import de.richargh.ktkonja.sharedk.SharedKotlin
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SharedKotlinTest {
    @Test
    fun `testKonja testee`() {
        val testee = SharedKotlin()
        assertThat(testee.speak()).isEqualTo("asd")
    }
}