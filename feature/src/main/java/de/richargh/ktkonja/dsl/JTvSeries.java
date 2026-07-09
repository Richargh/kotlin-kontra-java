package de.richargh.ktkonja.dsl;

import java.util.List;

public record JTvSeries(String name, List<JTvSeason> seasons) {
}
