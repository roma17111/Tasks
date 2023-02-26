package org.example.task9;

public class NoTaskException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Нет времени вообще!!!");
    }
}
