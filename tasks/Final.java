class Account_info9 {

    static String bankName = "MARIAMMAN INDIAN BANK";

    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;


    Account_info9(long accountNumber, String accountHolderName,
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

        if(amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            balance += amount;
        }
    }


    public void withdraw(double amount) {

        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if(amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance -= amount;
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
    }
}


public class Final {

    public static void main(String[] args) {

        Account_info9 a1 = new Account_info9(
                1001,
                "Arun",
                9876543210L,
                "Savings",
                25000
        );

        Account_info9 a2 = new Account_info9(
                1002,
                "Kumar",
                9876501234L,
                "Current",
                50000
        );


        a1.displayAccountDetails();

        a1.deposit(5000);
        System.out.println("Balance after deposit: " + a1.getBalance());

        a1.withdraw(3000);
        System.out.println("Balance after withdrawal: " + a1.getBalance());

        a1.setMobileNumber(9999999999L);
        System.out.println("Updated Mobile Number: " + a1.getMobileNumber());

        a1.deposit(-500);
        a1.withdraw(-1000);
        a1.withdraw(100000);


        a2.displayAccountDetails();

        a2.deposit(10000);
        a2.withdraw(5000);

        a2.displayAccountDetails();
    }
}