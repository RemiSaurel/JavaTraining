package abstraction;

public abstract class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
