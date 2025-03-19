package de.richargh.ktkonja.sharedj.api;

import de.richargh.ktkonja.sharedj.hidden.HiddenSpeaker;

public class SharedJava {
    public String speak(){
        return new HiddenSpeaker().speak();
    }
}
