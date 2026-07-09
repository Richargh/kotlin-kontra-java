package de.richargh.ktkonja.dsl;

public class JTvEpisodeBuilder {
    // assumption here is that this is for test data initiation
    private String name = "Holy Moly";
    private JTvEpisodeType type = JTvEpisodeType.Drama;

    public void name(String name){
        this.name = name;
    }

    public void type(JTvEpisodeType type){
        this.type = type;
    }

    public JTvEpisode build(){
        return new JTvEpisode(name, type);
    }
}