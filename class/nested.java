import java.util.*;
class course
{
  int mark=78;
  String course_code="20IT207";
  String staff="Ram";
  void display()
  {
     System.out.println("Marks:"+mark +" Course code:"+course_code +" Staff:"+staff);
  }
  class students
  {
    int rollno=2405049;
  }
}
public class nested
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    course co=new course();
    course.students stu=co.new students();
    co.display();
    System.out.println(stu.rollno);
    sc.close();

  }
}