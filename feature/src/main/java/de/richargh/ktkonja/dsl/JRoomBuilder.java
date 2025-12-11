package de.richargh.ktkonja.dsl;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class JRoomBuilder {
    // assumption here is that this is for test data initiation
    public int number = 1;
    private final List<JBed> beds = new LinkedList<>();

    public JRoom build(){
        return new JRoom(number, this.beds);
    }

    public JRoomBuilder withBed(Consumer<JBedBuilder> init){
        var builder = new JBedBuilder();
        init.accept(builder);
        beds.add(builder.build());
        return this;
    }
}