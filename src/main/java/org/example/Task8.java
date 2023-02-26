package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Task8 {

    // Отлавливание исключения в сигнатуре метода
    public static void signatureMethodCheckException() throws FileNotFoundException {
        // Это просто строки для вызова проверяемого исключения
        String s = null;
        FileOutputStream fileOutputStream = new FileOutputStream(s);
    }
}
