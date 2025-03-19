package de.richargh.ktkonja.moduleusage.hidden;

import de.richargh.ktkonja.sharedj.api.SharedJava;

public class HiddenMain {
    public static void main(String[] args) {
        var shared = new SharedJava();
        System.out.println("I am hidden and calling:");
        System.out.println(shared.speak());
    }
}
