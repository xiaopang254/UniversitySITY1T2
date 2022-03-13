import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) throws Exception {
        CircleWithException circleWithException = new CircleWithException();

        try {
            boolean loop = true;
            while (loop) {
                System.out.println("Enter a radius of a circle: ");
                Scanner input = new Scanner(System.in);
                circleWithException.setRadius(input.nextDouble());

                System.out.println("Choice 1: Get Area of Circle.\nChoice 2: Get Diameter of Circle.");
                System.out.println("Enter choice:");
                Scanner c = new Scanner(System.in);

                int choice = c.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Area of Circle is " + circleWithException.getAreaOfCircle());
                        break;
                    case 2:
                        System.out.println("Diameter of Circle is " + circleWithException.getDiameterOfCircle());
                        break;
                    case 0:
                        System.out.println("Exiting");
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }
        }

        catch (IllegalArgumentException e) {
            System.out.println("Caught Illegal Argument! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught an Exception! " + e.getMessage());
        }

    }
}