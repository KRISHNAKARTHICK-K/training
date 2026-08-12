
class method_overloading
{
    static void area(int a)
    {
         System.out.println("Area of square "+(a*a));
    }
    static void area(int a,int b)
    {
        System.out.println("area of rectangle "+(a*b));
    }
    static void area(double a,int b,int c)
    {
        System.out.println("Area of triangle "+(float)((a*b*c)/2));
    }
    static void area(double a,int b)
    {
        System.out.println("Area of circle "+(float)(a*b));
    }
    public static void main(String[] args) {
  
        area(4);
        area(4,6);
        area(4.5,5,5);
        area(3.14,4);
    }
}