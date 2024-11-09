package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        TSVTitleReader titleReader = new TSVTitleReader(new File("C:\\Users\\Magickio\\Desktop\\IS2\\kata2\\src\\main\\java\\org\\example\\title.basics.tsv"));
        List<Title> titles = titleReader.read();
        HashMap<Title.TitleType, Integer> histogram = new HashMap<>();

        histogramGenerate(titles, histogram);
        histogramShow(histogram);

        /*System.out.println("Listo");
        for (Title title : titles) {
            if (title.titleType() == Title.TitleType.Tvshort)
            {
                System.out.println(title.primaryTitle() + " Adulto: " + title.isAdult() + " Generos: " + title.genres());
            }
        }*/

    }

    private static void histogramShow(HashMap<Title.TitleType, Integer> histogram) {
        for (Title.TitleType titleType : histogram.keySet()) {
            System.out.println(titleType + " " + histogram.get(titleType));
        }
    }

    private static void histogramGenerate(List<Title> titles, HashMap<Title.TitleType, Integer> histogram) {
        for (Title title : titles) {
            histogram.put(title.titleType(), histogram.getOrDefault(title.titleType(),0) + 1);
        }
    }
}
