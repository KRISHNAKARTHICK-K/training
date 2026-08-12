public class bank1 {   
public static void main(String[] args) {
    // current cur=new current();
    savings sav=new savings();
    sav.deposit(4500);
    sav.deposit(4500,"Amount deposited of");
    sav.interest_calculation(6);
}
}
class bankacc
{
     double balance;
    void deposit(double amt)
    {
        balance+=amt;
    }
    void deposit(double amt,String des)
    {
        balance+=amt;
        System.out.println(des+" "+amt);
    }
    void deposit(double amt,String des,int id)
    {
      balance+=amt;
      System.out.println(des+" "+id+"of "+amt);
    }
}
class savings extends bankacc
{
void interest_calculation(int a)
{
    double inter=(balance*a)/100;
    System.out.println("Your interest amount is "+inter);
}

}
class current extends bankacc{
   void interest_calculation(int a)
{
    double inter=(balance*a)/100;
    System.out.println("Your interest amount is "+inter);
}
}

