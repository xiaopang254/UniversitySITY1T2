package Q2;

public class Rectangle extends Shape {

    public Rectangle() {

    }

    public Rectangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double area() {
        return this.dimension1 * this.dimension2;
    }

}
