package Speed_Thru_Slides.ExceptionLab;

public class CheckingAccount {

    private double currentAmount;
    private int accountNumber;

    public CheckingAccount() {
    }

    public CheckingAccount(double amount, int accountNumber) {
        this.currentAmount = amount;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        // Check if amount is a negative value..
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }

        // Check if current amount can be deducted first before actually deducting.
        double newAmount = this.currentAmount - amount;

        if (newAmount >= 0) {
            // Since amount is not negative, proceed to deduct.
            this.currentAmount -= amount;
            System.out.println("Successfully deducted.\nCurrent amount is $" + this.currentAmount);
        }

        throw new InsufficientFundsException(amount);

        // Since it's negative value, don't deduct but throw excpetion here.

    }

    public void deposit(double amount) throws InsufficientFundsException {
        // Check if amount is a negative value.
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        } else {
            this.currentAmount += amount;
            System.out.println("Successfully deposited.\nCurrent amount is $" + this.currentAmount);
        }
    }

    public double getBalance() {
        return this.currentAmount;
    }

    public int getNumber() {
        return this.accountNumber;
    }

}
