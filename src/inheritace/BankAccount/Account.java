package inheritace.BankAccount;

public class Account {
    public String AccountNumber;
    public double AccountBalence;
    public Account(String AccountNumber, double AccountBalence){
        this.AccountNumber=AccountNumber;
        this.AccountBalence=AccountBalence;
    }
    public void deposit(double amount){
        if (amount >0){
            AccountBalence += amount;
            System.out.println("Deposited " + amount);
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
    public void withdrawal(double amount){
        if (amount > 0 && amount <= AccountBalence){
            AccountBalence -= amount;
            System.out.println("withdrawal "+ amount);
        }
        else{
            System.out.println("invalid withdrawal amount");
        }

    }

    public double getAccountBalence() {
        return AccountBalence;
    }
    public void displayAccountBalence(){
        System.out.println("AccountBalence: " +AccountBalence);
    }
}
