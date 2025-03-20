package de.richargh.ktkonja.sharedj

import de.richargh.ktkonja.sharedk.api.SharedKotlin
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SharedKotlinTest {
    @Test
    fun `should speak Kotlin`() {
        val testee = SharedKotlin()

        assertThat(testee.speak()).isEqualTo("Kotlin")
    }
}