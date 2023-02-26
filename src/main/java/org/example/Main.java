package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Task7.catchException();

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
        int[] numbersReverse = IntStream.rangeClosed(1, numbers.length)
                .map(i -> numbers[numbers.length - i])
                .toArray();
        System.out.println(Arrays.toString(numbersReverse));
    }

    public static void getTask3() {
        try {
            while (true) {
                String s = JOptionPane.showInputDialog(null, "Введите строку");
                StringBuilder s1 = new StringBuilder(s).reverse();
                if (s.equalsIgnoreCase("")) {
                    throw new RuntimeException();
                }
                if (s.equalsIgnoreCase(String.valueOf(s1))) {
                    JOptionPane.showMessageDialog(null, "Строка - палиндром");
                } else {
                    JOptionPane.showMessageDialog(null, "Строка - не палиндром");
                }
            }
        } catch (NullPointerException e) {
            System.exit(0);
        } catch (RuntimeException t) {
            JOptionPane.showMessageDialog(null, "Введите строку!!!");
            getTask3();
        }
    }

    public static void getTask4() {
        String s = "Много бухла";
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2 + 1, s.length());
        JOptionPane.showMessageDialog(null,"Первая половина строки - " + s1+"\n"
        +"Вторая половина строки - " + s2 );
    }


}