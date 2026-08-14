class Account {

    int accountNumber;
    String customerName;

    static String bankName = "Mariamman Indian Bank";

    Account(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank Name: " + bankName);
        System.out.println();
    }
}

public class bank2 {
    public static void main(String[] args) {

        Account a1 = new Account(1, "Krishna");
        Account a2 = new Account(2, "Karthick");
        Account a3 = new Account(3, "Jothis");

        a1.display();
        a2.display();
        a3.display();
    }
}