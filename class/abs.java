
public class abs {
public static void main(String[] args) {
    person p=new person();
    p.process();
}    
}
abstract class bank
{
    void show()
    {
        System.out.println("Ac no:");
    }
    abstract void process();
}
class person extends bank{
    @Override
    void process()
    {
System.out.println("Process");
    }
}
