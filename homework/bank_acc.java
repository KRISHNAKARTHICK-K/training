class BankAccount {

    int accountNumber;
    String customerName;
    String accountType;
    double balance;

    BankAccount(int accountNumber, String customerName, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        balance = 0;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited into Account " + accountNumber);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(BankAccount receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transferred " + amount +
                    " from Account " + accountNumber +
                    " to Account " + receiver.accountNumber);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    void display() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}

public class bank_acc {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Krishna", "Savings");
        BankAccount a2 = new BankAccount(102, "Arun", "Savings");
        BankAccount a3 = new BankAccount(103, "Kumar", "Current");

        a1.deposit(10000);
        a2.deposit(5000);

        a1.transfer(a2, 3000);

        a2.withdraw(2000);

        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        a1.display();
        a2.display();
        a3.display();
    }
}