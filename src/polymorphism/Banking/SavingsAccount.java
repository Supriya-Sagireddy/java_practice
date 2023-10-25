package polymorphism.Banking;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(Customer accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }
}


