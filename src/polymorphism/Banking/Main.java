package polymorphism.Banking;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Smith", "12345");

        SavingsAccount savingsAccount = new SavingsAccount(customer, 5000.0, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(customer, 3000.0, 1000.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(customer, 10000.0, 12, 4.0);

        savingsAccount.calculateInterest();
        fixedDepositAccount.calculateInterest();

        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
        System.out.println("Fixed Deposit Account Balance: $" + fixedDepositAccount.getBalance());
    }
}
