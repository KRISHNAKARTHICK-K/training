abstract class Employee {

    private String name;
    private double salary;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    abstract void bonus_cal();

    abstract void display_all();
}

class Developer extends Employee {

    private String type;

    Developer(String name, double salary, String type) {
        setname(name);
        setsalary(salary);
        this.type = type;
    }

    @Override
    void bonus_cal() {

        if (type.equalsIgnoreCase("Full Stack")) {
            System.out.println("Bonus = " + (getsalary() * 0.15));
        } 
        else if (type.equalsIgnoreCase("MERN Stack")) {
            System.out.println("Bonus = " + (getsalary() * 0.20));
        }
    }
    @Override
    void display_all() {
        System.out.println("Name   : " + getname());
        System.out.println("Salary : " + getsalary());
        System.out.println("Type   : " + type);
        bonus_cal();
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        setname(name);
        setsalary(salary);
    }

    @Override
    void bonus_cal() {
        System.out.println("Bonus = " + (getsalary() * 0.25));
    }

    @Override
    void display_all() {
        System.out.println("Name   : " + getname());
        System.out.println("Salary : " + getsalary());
        bonus_cal();
    }
}

public class emp {

    public static void main(String[] args) {

        Developer d1 = new Developer(
            "Krishna", 50000, "Full Stack"
        );

        Developer d2 = new Developer(
            "Karthick", 60000, "MERN Stack"
        );

        Manager m1 = new Manager(
            "Arun", 80000
        );

        System.out.println("Developer - Full Stack");
        d1.display_all();

        System.out.println();

        System.out.println("Developer - MERN Stack");
        d2.display_all();

        System.out.println();

        System.out.println("Manager");
        m1.display_all();
    }
}