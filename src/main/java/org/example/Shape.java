package org.example;

public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getName();

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
