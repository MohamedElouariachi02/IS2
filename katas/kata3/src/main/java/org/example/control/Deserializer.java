package org.example.control;

import org.example.model.Title;

public interface Deserializer {
    Title deserialize(String line);
}
