package org.example;

public class Task7 {

    public static void catchException() {
        try {
            getException();
        } catch (RuntimeException e) {
            System.out.println("Мы с Вероникой поймали эксэпшэн йоу");
        }
    }

    private static void getException() {
        throw new RuntimeException();
    }
}
