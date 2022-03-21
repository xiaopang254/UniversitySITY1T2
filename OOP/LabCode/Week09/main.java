
import java.util.Scanner;

public class main {
    static RandomCharacter randomCharacter = new RandomCharacter();

    public static void main(String[] args) {
        // System.out.println(randomCharacter.getRandomLowerCaseLetter());
        // System.out.println(randomCharacter.getRandomUpperCaseLetter());
        // System.out.println(randomCharacter.getRandomDigitCharacter());
        // System.out.println(randomCharacter.getRandomCharacter());
        boolean flag = true;
        while (flag) {
            System.out
                    .println(
                            "\n\n1: lower case characters\n2: UPPER CASE CHARACTERS\n3: numbers\n4: Random\n0: To Exit.");
            System.out.print("Choice: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.close();

            switch (choice) {
                case 1:
                    userInput(choice);
                    break;
                case 2:
                    userInput(choice);
                    break;
                case 3:
                    userInput(choice);
                    break;
                case 4:
                    userInput(choice);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Hmm, invalid input..!");
            }
        }
    }

    private static void userInput(int choice) {

        for (int i = 0; i < 15; i++) {
            if (choice == 1) {
                System.out.print(randomCharacter.getRandomLowerCaseLetter());
            } else if (choice == 2) {
                System.out.print(randomCharacter.getRandomUpperCaseLetter());
            } else if (choice == 3) {
                System.out.print(randomCharacter.getRandomDigitCharacter());
            } else if (choice == 4) {
                System.out.print(randomCharacter.getRandomCharacter());
            }
        }
    }

}