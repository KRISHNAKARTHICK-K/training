class Account_info3 {

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Account_info3(long accountNumber, String accountHolderName,
                  long mobileNumber, String accountType, double balance) {

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
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }


    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Insufficient balance");
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


public class setter {

    public static void main(String[] args) {

        Account_info3 a1 = new Account_info3(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        a1.display();
        a1.setMobileNumber(9952477645L);

        System.out.println("\nAfter Mobile Number Update:");
        a1.display();
        a1.deposit(5000);
        a1.withdraw(3000);

        System.out.println("\nAfter Banking Operations:");
        a1.display();
    }
}