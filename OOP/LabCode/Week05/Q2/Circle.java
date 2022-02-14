package Q2;

public class Circle extends Shape {

    public Circle() {

    }

    public Circle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double area() {
        return pi * Math.pow(this.dimension1, 2);
    }

}
