package de.richargh.ktkonja.moduleusage.hidden;

import de.richargh.ktkonja.sharedj.api.SharedJava;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharedJUsageTest {
    @Test
    public void should_speak_java() {
        var testee = new SharedJava();

        assertThat(testee.speak()).isEqualTo("Java");
    }
}
