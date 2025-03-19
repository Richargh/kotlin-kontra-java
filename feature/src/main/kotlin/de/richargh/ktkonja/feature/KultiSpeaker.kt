package de.richargh.ktkonja.feature

import de.richargh.ktkonja.sharedj.api.SharedJava
import de.richargh.ktkonja.sharedk.api.SharedKotlin

class KultiSpeaker {
    fun speak(): List<String> {
        return listOf(
            SharedKotlin().speak(),
            SharedJava().speak()
        )
    }
}
