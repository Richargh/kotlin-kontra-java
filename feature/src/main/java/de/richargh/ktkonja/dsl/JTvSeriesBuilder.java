package de.richargh.ktkonja.dsl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class JTvSeriesBuilder {
    // assumption here is that this is for test data initiation
    private String name = "DORK";
    private final List<JTvSeason> seasons = new ArrayList<>();

    public JTvSeries build(){
        return new JTvSeries(name, seasons);
    }

    public void name(String name){
        this.name = name;
    }

    public JTvSeriesBuilder season(Consumer<JTvSeasonBuilder> init){
        var builder = new JTvSeasonBuilder();
        init.accept(builder);
        seasons.add(builder.build());
        return this;
    }
}
