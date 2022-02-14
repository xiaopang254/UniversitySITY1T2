package Q2;

public class Square extends Shape {

    public Square() {

    }

    public Square(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double area() {
        return (this.dimension1 * this.dimension2);
    }
}
