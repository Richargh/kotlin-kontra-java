package de.richargh.ktkonja.feature

import de.richargh.ktkonja.sharedj.SharedJava
import de.richargh.ktkonja.sharedk.SharedKotlin

class KultiSpeaker {
    fun speak(): List<String> {
        return listOf(
            SharedKotlin().speak(),
            SharedJava().speak()
        )
    }
}
