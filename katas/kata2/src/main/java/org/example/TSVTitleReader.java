package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TSVTitleReader implements TitleReader{
    private final File file;

    public TSVTitleReader(File file) {
        this.file = file;
    }

    @Override
    public List<Title> read() {
        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            getHeader(reader);
            return readAll(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Title> readAll(BufferedReader reader) throws IOException {
        ArrayList<Title> res = new ArrayList<Title>();
        TSVDesrializer desrializer = new TSVDesrializer();
        while (true)
        {
            String line = reader.readLine();
            if (line == null) {break;}
            String[] split = line.split("\t");
            Title title = desrializer.deserialize(split);
            res.add(title);
        }
        return res;
    }

    private String getHeader(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}
