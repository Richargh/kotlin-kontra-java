package de.richargh.ktkonja.dsl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class JTvSeasonBuilder {
    // assumption here is that this is for test data initiation
    private String tagLine = "Everything is borken";
    private final List<JTvEpisode> episodes = new ArrayList<>();

    public JTvSeason build(){
        return new JTvSeason(tagLine, this.episodes);
    }

    public void tagLine(String tagLine){
        this.tagLine = tagLine;
    }

    public JTvSeasonBuilder episode(Consumer<JTvEpisodeBuilder> init){
        var builder = new JTvEpisodeBuilder();
        init.accept(builder);
        episodes.add(builder.build());
        return this;
    }
}