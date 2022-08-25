package Speed_Thru_Slides.ExceptionLab;

import java.math.*;
import java.util.*;

//Sadly, was told to do it in 1 class file.
public class CircleWithException {

    private double radius;
    final static double PI = 3.142;

    public void CirclesWithException() {

    }

    public void CirclesWithException(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.radius = radius;
        }
    }

    public boolean isRadiusNegative(double radius) {
        if (radius <= 0) {
            return true;
        }
        return false;
    }

    public void setRadiusOfCircle(double radius) {

        if (this.isRadiusNegative(radius) == false) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("IllegalArgumentException caught! Please input a positive number.");
        }

    }

    public double getRadiusOfCircle() {
        return this.radius;
    }

    public double getAreaOfCircle() throws Exception {
        // Area of circle is PI*R^2
        double area = (PI * Math.pow(this.radius, 2));

        if (area > 1000) {
            throw new Exception("Area of circle is too big! Try something smaller.");
        }

        return area;
    }

    public double getDiameterOfCircle() {
        return (2 * radius);
    }

    public static void main(String[] args) {

        CircleWithException circle = new CircleWithException();
        try {
            boolean flag = false;
            while (flag == false) {

                System.out.print("Enter radius: ");
                Scanner input = new Scanner(System.in);
                double userInput = input.nextDouble();
                circle.setRadiusOfCircle(userInput);
                System.out.println("Radius of the Circle: " + circle.getRadiusOfCircle());
                System.out.println("Diameter of the Circle " + circle.getDiameterOfCircle());
                System.out.println("Area of the Circle " + circle.getAreaOfCircle());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
