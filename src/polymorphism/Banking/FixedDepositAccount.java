package polymorphism.Banking;

public class FixedDepositAccount extends Account {
    private int termInMonths;
    private double interestRate;

    public FixedDepositAccount(Customer accountHolder, double balance, int termInMonths, double interestRate) {
        super(accountHolder, balance);
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100 * (termInMonths / 12);
        balance += interest;
    }
}
