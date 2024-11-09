package org.example;

import org.example.control.TSVTitleReader;
import org.example.model.Title;
import org.example.view.HashMapDataVisualizer;

import java.io.*;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Magickio\\Downloads\\title.basics.tsv");
        TSVTitleReader reader = new TSVTitleReader(file);
        List<Title> titles = reader.read();
        HashMapDataVisualizer dataVisualizer = new HashMapDataVisualizer(titles);

        dataVisualizer.generateTitleType();

    }

}