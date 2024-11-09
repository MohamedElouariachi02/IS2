package org.example;

import java.util.ArrayList;
import java.util.List;

public class TSVDesrializer implements Deserializer{
    @Override
    public Title deserialize(String[] fields) {
        return new Title(fields[0], toTitleType(fields[1]), fields[2], toBoolean(fields[4]), toGenres(fields[8]));
    }

    private String capitalice(String field) {
        String temp = "";
        temp = field.toUpperCase();
        return temp.charAt(0) + temp.substring(1).toLowerCase();
    }

    private Title.TitleType toTitleType(String split) {
        return Title.TitleType.valueOf(capitalice(split));
    }

    private boolean toBoolean(String s) {
        int valor = Integer.parseInt(s);
        return valor != 0;
    }

    private List<Title.Genres> toGenres(String s) {
        if (s.equals("\\N")) return new ArrayList<>();
        String[] genres = s.split(",");
        ArrayList<Title.Genres> res = new ArrayList<>();
        for (String genre : genres) {
            res.add(Title.Genres.valueOf(change(genre)));
        }
        return res;
    }

    private String change(String s)
    {
        return s.replace("-", "");
    }
}
