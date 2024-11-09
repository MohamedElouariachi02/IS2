package org.example.view;

import org.example.model.Title;

import java.util.HashMap;
import java.util.List;

public class HashMapDataVisualizer implements DataVisualizer{
    private final List<Title> titles;

    public HashMapDataVisualizer(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public void generateTitleType() {
        HashMap<Title.TitleType, Integer> histogram = new HashMap<>();
        fill(histogram);
        print(histogram);
    }

    private void print(HashMap<Title.TitleType, Integer> histogram) {
        for (Title.TitleType titleType : histogram.keySet()) {
            System.out.println(titleType + ":" + histogram.get(titleType));
        }
    }

    private void fill(HashMap<Title.TitleType, Integer> histogram) {
        for (Title title : titles) {
            histogram.put(title.titleType(), histogram.getOrDefault(title.titleType(), 0) + 1);
        }
    }
}
