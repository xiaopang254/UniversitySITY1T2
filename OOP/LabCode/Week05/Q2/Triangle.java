package Q2;

public class Triangle extends Shape {

    public Triangle() {

    }

    public Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double area() {
        return (this.dimension1 * this.dimension2) / 2;
    }
}
