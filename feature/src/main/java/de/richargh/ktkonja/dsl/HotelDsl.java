package de.richargh.ktkonja.dsl;

import java.util.function.Consumer;

public class HotelDsl {
    private HotelDsl(){};

    public static JHotel aHotel(Consumer<JHotelBuilder> init){
        var builder = new JHotelBuilder();
        init.accept(builder);
        return builder.build();
    }
}
