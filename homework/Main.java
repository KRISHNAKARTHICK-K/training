import java.util.Scanner;

class Student {
    int id;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double average;
    char grade;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter 5 marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        sc.close();
    }
    void calculate() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;
        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }
    void display() {
        System.out.println("\nID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println("Enter Student 1");
        s1.accept();
        System.out.println("\nEnter Student 2");
        s2.accept();
        System.out.println("\nEnter Student 3");
        s3.accept();
        System.out.println("\nEnter Student 4");
        s4.accept();
        System.out.println("\nEnter Student 5");
        s5.accept();
        s1.calculate();
        s2.calculate();
        s3.calculate();
        s4.calculate();
        s5.calculate();
        System.out.println("\n===== STUDENT RESULTS =====");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        Student highest = s1;
        Student lowest = s1;
        if (s2.total > highest.total) highest = s2;
        if (s3.total > highest.total) highest = s3;
        if (s4.total > highest.total) highest = s4;
        if (s5.total > highest.total) highest = s5;
        if (s2.total < lowest.total) lowest = s2;
        if (s3.total < lowest.total) lowest = s3;
        if (s4.total < lowest.total) lowest = s4;
        if (s5.total < lowest.total) lowest = s5;
        double classAverage =
                (s1.average + s2.average + s3.average + s4.average + s5.average) / 5;
        System.out.println("\n===== SUMMARY =====");
        System.out.println("Highest Total : " + highest.name + " - " + highest.total);
        System.out.println("Lowest Total  : " + lowest.name + " - " + lowest.total);
        System.out.println("Class Average : " + classAverage);
        
    }
}