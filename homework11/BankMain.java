package homework11;

//Question 1
public class BankMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("00112233", "Brittany Ho", 500.00);

        System.out.println("Welcome, " + myAccount.getOwnerName());
        System.out.println(myAccount);

        myAccount.deposit(150.75);
        myAccount.withdraw(100.00);
        myAccount.withdraw(1000.00);
        myAccount.deposit(-20.00);
        myAccount.checkBalance();
    }
}
