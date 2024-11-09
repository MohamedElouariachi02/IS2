package org.example.pruebas;

import org.example.control.TSVTitleReader;
import org.example.model.Title;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Magickio\\Downloads\\title.basics.tsv");
        TSVTitleReader reader = new TSVTitleReader(file);
        List<Title> titles = reader.read();
        MainFrame mainFrame = new MainFrame();
        mainFrame.putHistogram(titles);


    }



}
