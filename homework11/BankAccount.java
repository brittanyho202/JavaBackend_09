package homework11;


//Question 1
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have successfully deposited $%.2f. Your new balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Error: The amount to be deposited must be larger than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than 0");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.printf("You have successfully withdrawn $%.2f. Remaining balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Error: Insufficient balance to complete this withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.printf("Your current balance: $%.2f\n", balance);
    }
    
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Owner: " + ownerName + ", Balance: $" + balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}
