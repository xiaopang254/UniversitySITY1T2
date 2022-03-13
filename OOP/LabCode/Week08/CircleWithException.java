import java.security.InvalidParameterException;

public class CircleWithException {

    double radius;
    final static double PI = 3.142;

    public CircleWithException(){

    }

    public void setRadius(Double radius) throws Exception{

        if (radius < 0){
            throw new IllegalArgumentException("Value cannot be negative.");
        }
        this.radius = radius;
    }

    public double getRadius(double radius){
        return radius;
    }

    public double getAreaOfCircle() throws Exception{
        double area = PI * (this.radius * this.radius);
        if (area > 1000){
            throw new Exception("Area too big!");
        }
        
        return area;
    }

    public double getDiameterOfCircle() throws Exception{
        double diameter = 2 * this.radius;
        if (diameter > 100){
            throw new Exception("Diameter is too big!");
        }
        return diameter;
    }
    
}
