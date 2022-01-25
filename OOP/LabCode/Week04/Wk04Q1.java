import java.util.Scanner;

public class Wk04Q1 {

    public static void main(String[] args) {

        double pounds = 0;
        double inches = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();

        BMI bmi = new BMI(pounds, inches);

        bmi.calculateBMI();
    }
}