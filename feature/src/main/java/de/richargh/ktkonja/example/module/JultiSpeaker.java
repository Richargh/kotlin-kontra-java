package de.richargh.ktkonja.example.module;

import de.richargh.ktkonja.sharedj.api.SharedJava;
import de.richargh.ktkonja.sharedk.api.SharedKotlin;

import java.util.List;

public class JultiSpeaker {
    List<String> speak(){
        return List.of(
                new SharedKotlin().speak(),
                new SharedJava().speak()
        );
    }
}
