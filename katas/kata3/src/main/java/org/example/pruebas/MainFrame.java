package org.example.pruebas;

import org.example.model.Title;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        setSize(500,400);

    }

    void putHistogram(List<Title> titles)
    {

        JFreeChart chart = JFreeChartBarChartDiagram.generar(titles);
        JFreeChartBarChartDiagram barChartPanel = new JFreeChartBarChartDiagram(chart);
        this.add(barChartPanel);
        this.setVisible(true);
    }


}
