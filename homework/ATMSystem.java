import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;
    int pin;

    BankAccount(int accountNumber, String holderName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.pin = pin;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String holderName, double balance, int pin, double interestRate) {
        super(accountNumber, holderName, balance, pin);
        this.interestRate = interestRate;
    }

    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Minimum balance of 1000 must be maintained.");
        }
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String holderName, double balance, int pin, double overdraftLimit) {
        super(accountNumber, holderName, balance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

class ATM {
    int atmId;
    String location;
    double cashAvailable;

    ATM(int atmId, String location, double cashAvailable) {
        this.atmId = atmId;
        this.location = location;
        this.cashAvailable = cashAvailable;
    }

    void insertCard() {
        System.out.println("Card inserted.");
    }

    void enterPin() {
        System.out.println("PIN entered.");
    }

    void withdrawCash(BankAccount account, double amount) {
        if (amount <= cashAvailable) {
            account.withdraw(amount);
            cashAvailable = cashAvailable - amount;
        } else {
            System.out.println("ATM does not have enough cash.");
        }
    }

    void depositCash(BankAccount account, double amount) {
        account.deposit(amount);
    }

    void checkBalance(BankAccount account) {
        account.checkBalance();
    }

    void exit() {
        System.out.println("Thank you. Please take your card.");
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(1001, "Krishna", 30000, 1234, 4.5);
        ATM atm = new ATM(101, "Coimbatore", 100000);

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (acc == account.accountNumber && pin == account.pin) {
            System.out.println("Login Successful!");

            while (true) {
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                if (choice == 1) {
                    atm.checkBalance(account);
                } else if (choice == 2) {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    System.out.println("Processing...");
                    atm.withdrawCash(account, amount);
                    account.checkBalance();
                } else if (choice == 3) {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    atm.depositCash(account, amount);
                } else if (choice == 4) {
                    account.displayDetails();
                } else if (choice == 5) {
                    atm.exit();
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Invalid Account Number or PIN");
        }

        sc.close();
    }
}