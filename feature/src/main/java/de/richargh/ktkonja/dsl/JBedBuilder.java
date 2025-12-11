package de.richargh.ktkonja.dsl;

public class JBedBuilder {
    // assumption here is that this is for test data initiation
    public JBedType type = JBedType.Single;

    public JBed build(){
        return new JBed(type);
    }
}