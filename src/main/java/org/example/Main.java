package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    }

    public static void getTask1() {
        List<String> names = new ArrayList<>(List.of("Roman", "Anna", "Ildar", "Veronika", "Korney","Joy"));
        names.stream().map(name -> name.substring(1, name.length()))
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}