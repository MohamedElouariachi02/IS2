package org.example.pruebas;

import org.example.model.Title;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class JFreeChartBarChartDiagram extends ChartPanel {
    public JFreeChartBarChartDiagram(JFreeChart chart) {
        super(chart);
    }

    public static CategoryDataset createDataSet(List<Title> titles)
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        HashMap<Title.TitleType, Integer> histogram = new HashMap<>();
        for (Title title : titles) {
            histogram.put(title.titleType(), histogram.getOrDefault(title.titleType(), 0) + 1);
        }
        for (Title.TitleType titleType : histogram.keySet()) {
            dataset.addValue(histogram.get(titleType), "Type", titleType);
        }
        return dataset;
    }
    public static JFreeChart generar(List<Title> titles)
    {
        CategoryDataset dataset = createDataSet(titles);
        JFreeChart chart = ChartFactory.createBarChart(
                "Title type",     // Título del gráfico
                "Type",                  // Etiqueta del eje X
                "Repes",               // Etiqueta del eje y
                dataset
        );
        return chart;
    }
}
