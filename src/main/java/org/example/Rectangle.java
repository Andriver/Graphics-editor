package org.example;

public class Rectangle extends Shape {

    public String name = "Rectangle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    void common() {
        System.out.println(name);
    }
}
