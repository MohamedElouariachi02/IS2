package org.example;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int age()
    {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age() +
                '}';
    }
}
