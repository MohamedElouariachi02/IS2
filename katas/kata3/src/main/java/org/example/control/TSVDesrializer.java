package org.example.control;


import org.example.model.Title;

public class TSVDesrializer implements Deserializer {
    @Override
    public Title deserialize(String line) {
        String[] fields = line.split("\t");
        return new Title(fields[0], toTitle(fields[1]), fields[2], toBoolean(fields[4]), toGenres(fields[8]));

    }

    private Title.Genres[] toGenres(String field) {
        if (field.equals("\\N")) return null;
        String[] split = field.split(",");
        Title.Genres[] genres = new Title.Genres[split.length];
        for (int i = 0; i < genres.length; i++) {
            genres[i] = Title.Genres.valueOf(normalize(split[i]));
        }
        return genres;
    }

    private String normalize(String word) {
        return word.replace("-", "");
    }

    private boolean toBoolean(String field) {
        return field.equals("1");
    }

    private Title.TitleType toTitle(String field) {
        if (field.equals("\\N")) return null;
        return Title.TitleType.valueOf(capitalize(field));
    }

    private String capitalize(String word) {
        return word.toUpperCase().charAt(0) + word.toLowerCase().substring(1);
    }
}
