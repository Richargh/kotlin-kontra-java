package de.richargh.ktkonja.dsl

/**
 * For more examples including the @DslMarker check out: https://kotlinlang.org/docs/type-safe-builders.html#full-definition-of-the-com-example-html-package
 */
@DslMarker
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE)
annotation class TvSeriesMarker

fun tvSeries(init: KTvSeriesBuilder.() -> Unit): KTvSeries {
    return KTvSeriesBuilder().apply(init)._build()
}

@TvSeriesMarker
class KTvSeriesBuilder {
    var name: String = "DORK"

    private val seasons = mutableListOf<KSeason>()

    fun season(init: KSeasonBuilder.() -> Unit) {
        val season = KSeasonBuilder().apply(init)._build()
        seasons.add(season)
    }

    fun _build() = KTvSeries(name, seasons)
}

data class KTvSeries(val name: String, val seasons: List<KSeason>)

@TvSeriesMarker
class KSeasonBuilder {
    var tagLine: String = "Everything is borken"

    private val episodes = mutableListOf<KEpisode>()

    fun episode(init: KEpisodeBuilder.() -> Unit) {
        val episode = KEpisodeBuilder().apply(init)._build()
        episodes.add(episode)
    }

    fun _build() = KSeason(tagLine, episodes)
}

data class KSeason(val tagLine: String, val episodes: List<KEpisode>)

@TvSeriesMarker
class KEpisodeBuilder {
    var name: String = "Holy Moly"
    var type: KEpisodeType = KEpisodeType.Drama

    fun _build() = KEpisode(type)
}

data class KEpisode(val type: KEpisodeType)

enum class KEpisodeType {Drama, Comedy}