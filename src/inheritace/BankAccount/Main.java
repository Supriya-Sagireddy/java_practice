package inheritace.BankAccount;
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 5.0);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 500.0, 200.0);

        savingsAccount.deposit(500.0);

        savingsAccount.displayAccountBalence();


        // Withdraw and display balances

        checkingAccount.withdrawal(700.0);

        checkingAccount.displayAccountBalence();

        // Apply interest to the savings account
        savingsAccount.applyInterest();
        savingsAccount.displayAccountBalence();
    }
}

