package Q1;

public class Circle extends GeometricObject {
    private double radius;
    private double pi = Math.PI;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        super.color = color;
        super.filled = filled;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return pi * (Math.pow(getRadius(), 2));
    }

    public double getPerimeter() {
        // 2 PI r
        return 2 * pi * getRadius();
    }

    public double getDiameter() {

        return 2 * getRadius();
    }

    public void printCircle() {
        System.out.println("A circle " + toString());
    }

}
