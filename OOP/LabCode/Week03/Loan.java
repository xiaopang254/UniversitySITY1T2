import java.util.Date;
import java.lang.Math;
import java.util.Scanner;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment() {

        double monthlyPayment = 0;
        double monthlyInterestRate = this.annualInterestRate / 1200;
        monthlyPayment = (this.loanAmount * monthlyInterestRate)
                / (1 - Math.pow((1 + monthlyInterestRate), this.numberOfYears * -12));
        return monthlyPayment;

    }

    public double getTotalPayment() {
        return (getMonthlyPayment() * numberOfYears * 12);
    }

    public static void main(String[] args) {

        double annualInterestRate = 0;
        int numberOfYears = 0;
        double loanAmount = 0.0;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        annualInterestRate = userInput.nextDouble();

        System.out.print("Enter number of years as integer: ");
        numberOfYears = userInput.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        loanAmount = userInput.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.02f", loan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.02f", loan.getTotalPayment()));

    }

}
