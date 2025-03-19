package de.richargh.ktkonja.feature;

import de.richargh.ktkonja.sharedj.SharedJava;
import de.richargh.ktkonja.sharedk.SharedKotlin;

import java.util.List;

public class JultiSpeaker {
    List<String> speak(){
        return List.of(
                new SharedJava().speak(),
                new SharedKotlin().speak());
    }
}
