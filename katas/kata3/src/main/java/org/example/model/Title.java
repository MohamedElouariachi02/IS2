package org.example.model;

public record Title(String id, Title.TitleType titleType, String primaryTitle, boolean isAdult,
                    Genres[] genres) {

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
