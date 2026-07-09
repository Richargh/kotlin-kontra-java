package de.richargh.ktkonja.dsl;

import java.util.function.Consumer;

public class JTvSeriesDsl {
    private JTvSeriesDsl(){};

    public static JTvSeries jtvSeries(Consumer<JTvSeriesBuilder> init){
        var builder = new JTvSeriesBuilder();
        init.accept(builder);
        return builder.build();
    }
}
