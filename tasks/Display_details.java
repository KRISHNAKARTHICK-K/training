class Account_info6 {

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Account_info6(long accountNumber, String accountHolderName,
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


    public void displayAccountDetails() {

        System.out.println("====================================");
        System.out.println("       " + "Mari Amman Indian Bank");
        System.out.println("====================================");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}


public class Display_details {

    public static void main(String[] args) {

        Account_info6 a1 = new Account_info6(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );
        a1.displayAccountDetails();
    }
}