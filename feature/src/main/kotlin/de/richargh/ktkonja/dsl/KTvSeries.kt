package de.richargh.ktkonja.dsl

/**
 * For more examples including the @DslMarker check out: https://kotlinlang.org/docs/type-safe-builders.html#full-definition-of-the-com-example-html-package
 */
@DslMarker
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE)
annotation class TvSeriesMarker

fun ktvSeries(init: KTvSeriesBuilder.() -> Unit): KTvSeries {
    return KTvSeriesBuilder().apply(init)._build()
}

@TvSeriesMarker
class KTvSeriesBuilder {
    var name: String = "DORK"

    private val seasons = mutableListOf<KTvSeason>()

    fun season(init: KTvSeasonBuilder.() -> Unit) {
        val season = KTvSeasonBuilder().apply(init)._build()
        seasons.add(season)
    }

    fun _build() = KTvSeries(name, seasons)
}

data class KTvSeries(val name: String, val seasons: List<KTvSeason>)

@TvSeriesMarker
class KTvSeasonBuilder {
    var tagLine: String = "Everything is borken"

    private val episodes = mutableListOf<KTvEpisode>()

    fun episode(init: KTvEpisodeBuilder.() -> Unit) {
        val episode = KTvEpisodeBuilder().apply(init)._build()
        episodes.add(episode)
    }

    fun _build() = KTvSeason(tagLine, episodes)
}

data class KTvSeason(val tagLine: String, val episodes: List<KTvEpisode>)

@TvSeriesMarker
class KTvEpisodeBuilder {
    var name: String = "Holy Moly"
    var type: KTvEpisodeType = KTvEpisodeType.Drama

    fun _build() = KTvEpisode(name, type)
}

data class KTvEpisode(val name: String, val type: KTvEpisodeType)

enum class KTvEpisodeType {Drama, Comedy}
