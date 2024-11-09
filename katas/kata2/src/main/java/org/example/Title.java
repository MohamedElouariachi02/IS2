package org.example;

import java.util.List;
import java.util.Objects;

public final class Title {
    private final String id;
    private final TitleType titleType;
    private final String primaryTitle;
    private final boolean isAdult;
    private final List<Genres> genres;

    public Title(String id, TitleType titleType, String primaryTitle, boolean isAdult,
                 List<Genres> genres) {
        this.id = id;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.isAdult = isAdult;
        this.genres = genres;
    }

    public String id() {
        return id;
    }

    public TitleType titleType() {
        return titleType;
    }

    public String primaryTitle() {
        return primaryTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public List<Genres> genres() {
        return genres;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Title) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.titleType, that.titleType) &&
                Objects.equals(this.primaryTitle, that.primaryTitle) &&
                this.isAdult == that.isAdult &&
                Objects.equals(this.genres, that.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleType, primaryTitle, isAdult, genres);
    }

    @Override
    public String toString() {
        return "Title[" +
                "id=" + id + ", " +
                "titleType=" + titleType + ", " +
                "primaryTitle=" + primaryTitle + ", " +
                "isAdult=" + isAdult + ", " +
                "genres=" + genres + ']';
    }


    public enum TitleType {
        Videogame,
        Tvpilot,
        Movie,
        Tvseries,
        Tvminiseries,
        Short,
        Tvspecial,
        Tvshort,
        Video,
        Tvmovie,
        Tvepisode
    }

    public enum Genres {
        Action, Adult, Adventure, Animation, Biography, Comedy, Crime, Documentary, Drama, Family, Fantasy, FilmNoir, GameShow, genres, History, Horror, Music, Musical, Mystery, News, RealityTV, Romance, SciFi, Short, Sport, TalkShow, Thriller, War, Western
    }
}
