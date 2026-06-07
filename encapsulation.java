class BankAccount {

    // Public Access Modifier
    public String name;

    // Protected Access Modifier
    protected String accountNumber;

    // Private Access Modifier
    private double balance;

    // Constructor
    BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposit Successfully!");
    }

    // Withdraw Method
    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " টাকা Withdraw Successfully!");
        }
    }

    // Getter Method
    double getBalance() {
        return balance;
    }

    // Display Info
    void showInfo() {

        System.out.println("\n=== Bank Account Information ===");
        System.out.println("Name           : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

public class encapsulation {

    public static void main(String[] args) {

        // Object Create
        BankAccount user1 = new BankAccount(
                "Kamal",
                "123456789",
                5000
        );

        System.out.println(user1.name);

        System.out.println(user1.accountNumber);

        user1.deposit(2000);

        user1.withdraw(1000);

        System.out.println("Current Balance: " + user1.getBalance());

        // Show Full Info
        user1.showInfo();
    }
}