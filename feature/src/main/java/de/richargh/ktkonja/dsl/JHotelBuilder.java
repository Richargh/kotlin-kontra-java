package de.richargh.ktkonja.dsl;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class JHotelBuilder {
    // assumption here is that this is for test data initiation
    public String name = "Fhloston Paradise Hotel";
    private final List<JRoom> rooms = new LinkedList<>();

    public JHotel build(){
        return new JHotel(name, rooms);
    }

    public JHotelBuilder withRoom(Consumer<JRoomBuilder> init){
        var builder = new JRoomBuilder();
        init.accept(builder);
        rooms.add(builder.build());
        return this;
    }
}
