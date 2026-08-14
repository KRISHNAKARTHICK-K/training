class Account_info7 {

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    static String bankName = "MARIAMMAN INDIAN BANK";

    Account_info7(long accountNumber, String accountHolderName,
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

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public void displayAccountDetails() {

        System.out.println("====================================");
        System.out.println("       " + bankName);
        System.out.println("====================================");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
        System.out.println();
    }
}

public class Main_method {

    public static void main(String[] args) {

        Account_info7 a1 = new Account_info7(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        Account_info7 a2 = new Account_info7(
                1002,
                "Kumar",
                9876501234L,
                "Current",
                50000
        );

        a1.displayAccountDetails();
        a2.displayAccountDetails();
    }
}