import java.util.*;
class Person
{
    String name;
    String work;
    void activity()
    {
        System.out.println("Nothing");
    }
}
class Student extends Person{
      @Override
      void activity()
      {
        System.out.println("Doing Classworks");
      }
}
class Child extends Student{
    @Override
    void activity()
    {
        System.out.println("Cleaning");
    }
}
class Customer extends Child{
    @Override
    void activity()
    {
        System.out.println("Buying snacks");
    }
}
class Visitor extends Customer{
    @Override
    void activity()
    {
        System.out.println("Watching Sunset");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           Visitor visit=new Visitor();
           visit.activity();
        sc.close();
    }
}
