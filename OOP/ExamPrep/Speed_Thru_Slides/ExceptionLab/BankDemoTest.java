package Speed_Thru_Slides.ExceptionLab;

import java.io.*;
import java.util.InputMismatchException;

public class BankDemoTest {

    public static void main(String[] args) throws IOException {

        // Initialize an object for a checking account.
        // Let's start with a value and an account number.
        CheckingAccount cAccount = new CheckingAccount(1000.00, 50012345);

        // Setting a flag so we can exit the while loop later.
        boolean flag = true;
        while (flag == true) {

            // Start to print out the choices available for users to decide.
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Get Account Number\n0.To Exit.");
            System.out.println("Enter your choice: ");

            // Instead of using Scanner, let's try to use BufferedReader and
            // InputStreamReader just to test it out!
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // We will need to retrieve the value from the buffer and set it to a variable.
            String choice = br.readLine();

            // Create a switch case so that the chosen choice will go to the right location.
            switch (choice) {
                case "1":
                    System.out.print("Enter amount to deposit: ");

                    // A try catch is required because there is an exception handling when calling
                    // the deposit method.
                    try {
                        // We take the value from the buffer and set it to a variable.
                        // Although we do a shortcut it here, but this is much clearer to read.
                        double amount = Double.parseDouble(br.readLine());
                        cAccount.deposit(amount);

                        // Custom Exception Handling that was thrown back, print the error message.
                        // Currently this is expecting to throw an error when there is a negative value
                        // input.
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                        // This is a built-in exception, let's use this too since we want to handle
                        // numbers only.
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    // We want a break here after each case has been chosen because we want to get
                    // out of the switch case.
                    break;
                case "2":
                    // Similar to case "1", the way it's written is similar as explained above.
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double amount = Double.parseDouble(br.readLine());
                        cAccount.withdraw(amount);
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getAmount());
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    System.out.println("\nYour current balance is " + cAccount.getBalance());
                    break;
                case "4":
                    System.out.println("\nYour account number is " + cAccount.getNumber());
                    break;
                case "0":
                    System.out.println("Exiting!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input type, Try choosing one of the choices available.");
            }
        }
    }

}
