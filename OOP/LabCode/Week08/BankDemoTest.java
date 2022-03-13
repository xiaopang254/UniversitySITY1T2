import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args) throws Exception {
        CheckingAccount ca = new CheckingAccount();

        boolean loop = true;
        while (loop) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance");
            System.out.println("Enter your choice:");
            Scanner c = new Scanner(System.in);
            int choice = c.nextInt();
            try{
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    Scanner amountDeposit = new Scanner(System.in);
                    ca.deposit(amountDeposit.nextDouble());
                    break;
                case 2:
                System.out.println("Enter amount to withdraw:");
                    Scanner amountWithdraw = new Scanner(System.in);
                    ca.withdraw(amountWithdraw.nextDouble());
                    break;
                case 3:
                    System.out.println("Your current blanace is: " + ca.getBalance());
                    break;
                case 0:
                    System.out.println("Exiting..");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        catch (InsufficientFundsException e){
            System.out.println("Sorry, but your account is short by: " + e.getAmount());
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());

        }
        }
    }

}
