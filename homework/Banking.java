abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        balance = 0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    void withdraw(double amount) {
        if (getBalance() - amount >= 1000) {
            super.deposit(-amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance of 1000 must be maintained");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    void withdraw(double amount) {
        if (getBalance() - amount >= -5000) {
            super.deposit(-amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit of 5000 exceeded");
        }
    }
}

public class Banking {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount(101, "Krishna", 5000);
        BankAccount b2 = new CurrentAccount(102, "Karthick", 2000);

        b1.displayDetails();
        b1.withdraw(3000);
        b1.displayDetails();
        System.out.println();

        b2.displayDetails();
        b2.withdraw(6000);
        b2.displayDetails();

        System.out.println();
        b1.deposit(2000);
        b1.displayDetails();
    }
}