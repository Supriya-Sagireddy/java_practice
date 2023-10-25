package inheritace.BankAccount;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getAccountBalence() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interestRate);
    }
}


