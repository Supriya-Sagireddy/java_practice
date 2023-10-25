package polymorphism.Banking;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(Customer accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
        }
    }
}


