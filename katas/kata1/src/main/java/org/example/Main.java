package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person mario = new Person("Mario", LocalDate.of(2002, 12, 2));
        System.out.println(mario);
        Person laura = new Person("Laura", LocalDate.of(2004,  3, 1));
    }
}
