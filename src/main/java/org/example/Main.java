package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        getTask2();
    }

    public static void getTask1() {
        //Задача1
        List<String> names = new ArrayList<>(List.of("Roman", "Anna", "Ildar", "Veronika", "Korney", "Joy"));
        names.stream().map(name -> name.substring(1, name.length()))
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }

    public static void getTask2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int[] numbersReverse =  IntStream.rangeClosed(1, numbers.length)
                .map(i -> numbers[numbers.length - i])
                .toArray();
        System.out.println(Arrays.toString(numbersReverse));
    }
}