import java.util.Scanner;

public class Wk02Q2 {
    public static void main(String[] args) {
        float average = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        String userInput = input.nextLine();
        input.close();

        System.out.print("The average of ");
        String[] stringArray = userInput.split(" ");
        for (int i = 0; i <= stringArray.length - 1; i++) {
            float num = Float.parseFloat(stringArray[i]);
            System.out.print(num + " ");
            average += num;
        }
        System.out.print("is " + average / stringArray.length);

    }

}
