import java.util.*;

public class PlayGround {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println("Enter 3 numbers");
        Scanner threeValuesInput = new Scanner(System.in);
        int value1 = threeValuesInput.nextInt();
        int value2 = threeValuesInput.nextInt();
        int value3 = threeValuesInput.nextInt();

        AverageSum averageSum = new AverageSum();
        int average = averageSum.Calculate(value1, value2, value3);
        System.out.printf("\nThe average of %d, %d, %d is %d", value1, value2, value3, average);

    }
}