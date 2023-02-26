package org.example;

public enum Task5 {
    EXAMPLE1("s1"),
    EXAMPLE2("s2"),
    EXAMPLE3("s3"),
    EXAMPLE4("s4"),
    EXAMPLE5("s5");

  private  final String example;

    Task5(String example) {
        this.example = example;
    }

    public String getExample() {
        return example;
    }
}
