package inheritace.BankAccount;


public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String AccountNumber, double AccountBalance, double overdraftLimit) {
        super(AccountNumber, AccountBalance);
        this.overdraftLimit = overdraftLimit;
    }

}

