package org.example.task9;

public class TestException {

    public static void catchEx() {
        try {
            testEx();
        } catch (NoTaskException e) {
            e.printStackTrace();
            System.out.println("Проверка созданного исключения");
        }
    }

    private static void testEx() throws NoTaskException {
        throw new NoTaskException();
    }
}
