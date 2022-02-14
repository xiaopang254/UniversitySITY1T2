package Q2;

public class Ellipse extends Shape {

    public Ellipse() {

    }

    public Ellipse(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double area() {
        return this.pi * this.dimension1 * this.dimension2;
    }

}
