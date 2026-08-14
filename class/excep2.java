public class excep2 {
    static void div(int a,int b) throws RuntimeException
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        div(10,0);
        System.out.println();
        System.out.println();
    }
    
}      
