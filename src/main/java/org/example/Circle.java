package org.example;

public class Circle extends Shape {

    public String name = "Circle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    void common() {
        System.out.println(name);
    }
}
