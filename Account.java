package task_6;

public class Account {

    private String accountNumber;
    private double balance;

    public Account() {
        this.accountNumber = "0000"; 
        this.balance = 0.0; 
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }


    public double getBalance() {
        return balance;
    }

 
    public static void main(String[] args) {
 
        Account account1 = new Account();
        account1.deposit(500);
        account1.withdraw(100);
        System.out.println("Final Balance: " + account1.getBalance());

        Account account2 = new Account("1234", 1000);
        account2.deposit(200);
        account2.withdraw(300);
        System.out.println("Final Balance: " + account2.getBalance());
    }
}
