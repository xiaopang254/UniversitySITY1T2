import java.util.InputMismatchException;

public class CheckingAccount {

    double amount;
    String accountNumber;

    public void deposit(double amount) throws Exception {

        if (this.checkValueIsNegative(amount)) {
            if (amount <= 0) {
                throw new Exception("Invalid amount");
            }
            this.amount += amount;
            System.out.println("The balance after deposit is: $" + this.amount);
        }

    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (this.checkValueIsNegative(amount)) {
            double check = this.amount - amount;
            if (check <= 0) {
                throw new InsufficientFundsException(amount - this.amount);
            } else {
                this.amount -= amount;
                System.out.println("The balance after withdraw is: $" + this.amount);
            }
        }
    }

    private Boolean checkValueIsNegative(double value) {

        if (value >= 0) {
            return true;
        } else {
            throw new InputMismatchException("Value entered is negative.");
        }
    }

    public double getBalance() {
        return this.amount;
    }

    public String getNumber() {
        return this.accountNumber;
    }

}
