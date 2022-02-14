package Q2;

public abstract class Shape {

    protected double dimension1;
    protected double dimension2;
    protected double pi = Math.PI;

    public Shape() {

    }

    public Shape(double dimension1) {
        this.dimension1 = dimension1;

    }

    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;

    }

    public Shape(double dimension1, double dimension2, double pi) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.pi = pi;
    }

    public double getDimension1() {
        return this.dimension1;
    }

    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getDimension2() {
        return this.dimension2;
    }

    public abstract double area();

}