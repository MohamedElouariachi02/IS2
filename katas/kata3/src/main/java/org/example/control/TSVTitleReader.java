package org.example.control;

import org.example.model.Title;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TSVTitleReader implements TitleReader {
    private final File file;

    public TSVTitleReader(File file) {
        this.file = file;
    }

    @Override
    public List<Title> read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            readHeader(reader);
            ArrayList<Title> titles = readAll(reader);
            return titles;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ArrayList<Title> readAll(BufferedReader reader) throws IOException {
        TSVDesrializer desrializer = new TSVDesrializer();
        ArrayList<Title> titles = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            Title title = desrializer.deserialize(line);
            titles.add(title);
        }
        return titles;
    }

    private String readHeader(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}
