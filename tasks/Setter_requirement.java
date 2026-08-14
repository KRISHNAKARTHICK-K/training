class Account_info2 {

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Account_info2(long accountNumber, String accountHolderName, long mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Invalid balance");
        }
    }

    void display() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class Setter_requirement {

    public static void main(String[] args) {

        Account_info2 a1 = new Account_info2(1001, "Arun", 9876543210L, "Savings", 25000);

        a1.display();
        // a1.setBalance(500000);
        // System.out.println("\nAfter Update:");
        // a1.display();
        a1.setMobileNumber(9952477645L);
        a1.display();
    } 
}