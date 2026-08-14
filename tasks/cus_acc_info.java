class Account1
{
    long accountNumber;
    String accountHolderName;
    long mobileNumber;
    String accountType;
    double balance;
    Account1(long accountNumber, String accountHolderName,long mobileNumber,String accountType,double balance)
    {
          this.accountNumber=accountNumber;
          this.accountHolderName=accountHolderName;
          this.mobileNumber=mobileNumber;
          this.accountType=accountType;
          this.balance=balance;
    }

    void display()
    {
        System.out.println("Account Details:\nAccount Number: "+accountNumber+"\nAccount Holder Name: "+accountHolderName+"\nMobile Number: "+mobileNumber+"\nAccount Type: "+accountType+"\nBalance: "+balance);
        System.out.println();
    }
}
public class cus_acc_info {
    public static void main(String[] args) {
        
    
    Account1 a1=new Account1(1001,"Arun",9876543210L,"Savings",25000);
    Account1 a2=new Account1(1002,"Kumar",9876501234L,"Current",50000);
    a1.display();
    a2.display();

    }
    
}
