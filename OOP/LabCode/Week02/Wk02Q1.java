package Week02;

import java.util.Scanner;

public class Wk02Q1 {
    static double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        input.close();
        double area = radius * radius * PI;

        System.out.print("The area for the circle of radius " + radius + " is " + area);

    }
}
