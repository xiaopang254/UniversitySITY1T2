public class CheckingAccount {

    double amount;
    String accountNumber;

    public void deposit(double amount) throws Exception{

        if (amount < 0){
            throw new Exception("Invalid amount");
        }
        this.amount += amount;
        System.out.println("The balance after deposit is: $" + this.amount);
        
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        double check = this.amount - amount;
        if (check < 0){
            throw new InsufficientFundsException(amount);
        } else {
            this.amount -= amount;
            System.out.println("The balance after withdraw is: $" + this.amount);
        }
    }

    public double getBalance() {
        return this.amount;
    }

    public String getNumber() {
        return this.accountNumber;
    }

}
