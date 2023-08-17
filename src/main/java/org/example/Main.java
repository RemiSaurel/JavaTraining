package org.example;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2.0, 3.0);
        shapes[1] = new Circle(1.0);

        for (Shape shape : shapes) {
            shape.print();
        }
    }
}