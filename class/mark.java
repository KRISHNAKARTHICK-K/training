import java.util.*;
class InvalidMarkException extends RuntimeException
{
    InvalidMarkException(String mes)
    {
        super(mes);
    }
}

class InsufficientMarkException extends RuntimeException
{
    InsufficientMarkException(String mes)
    {
        super(mes);
    }
}

class mark_avg{
    double res=0;
      double avg(int[] arr)
      {
          for(int i=0;i<5;i++)
          {
           res+=arr[i]; 
          }
          res=res/5;
          return res;
      }
}

public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n=sc.nextInt();
        if(n!=5)
        {
           throw new InvalidMarkException("Enter 5 Subjects marks only");
        }
        int[] marks=new int[n];
        mark_avg av=new mark_avg();
        for(int i=0;i<5;i++)
        {
              marks[i]=sc.nextInt();
              if(marks[i]>100 || marks[i]<0)
              {
                throw new InvalidMarkException("Marks must be between 0 and 100");
              }
        }
        if(av.avg(marks)<35)
        {
            throw new InsufficientMarkException("Average mark is below 35");
        }else{
            System.out.println("Average is "+av.avg(marks));
        }

        sc.close();
         
    }
}
