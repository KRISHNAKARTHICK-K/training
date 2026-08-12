public class excep {
    static float balance=0;
   static void deposit(int a)
    {
      balance+=a;
    }
    static void withdraw(int a)
    {
        if(a>balance)
        {
             throw new IllegalArgumentException("Insufficient balance");
        }else{
            System.out.println("Withdraw successful");
        }
    }
    public static void main(String[] args) {
        deposit(500);
        withdraw(501);
    }
}
