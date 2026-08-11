class Employee {
    int id;
    String name;
    double basic, hra, da, bonus, tax, gross, net;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    void calculate() {
        hra = basic * 0.20;
        da = basic * 0.10;
        bonus = basic * 0.05;

        gross = basic + hra + da + bonus;

        tax = gross * 0.08;

        net = gross - tax;
    }

    void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + net);
    }
}

public class emp_sal_cal {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Arun", 20000);
        Employee e2 = new Employee(102, "Kumar", 25000);
        Employee e3 = new Employee(103, "Ravi", 30000);
        Employee e4 = new Employee(104, "Manoj", 22000);
        Employee e5 = new Employee(105, "Vijay", 28000);

        e1.calculate();
        e2.calculate();
        e3.calculate();
        e4.calculate();
        e5.calculate();

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();

        Employee highest = e1;
        Employee lowest = e1;

        if (e2.net > highest.net) highest = e2;
        if (e3.net > highest.net) highest = e3;
        if (e4.net > highest.net) highest = e4;
        if (e5.net > highest.net) highest = e5;

        if (e2.net < lowest.net) lowest = e2;
        if (e3.net < lowest.net) lowest = e3;
        if (e4.net < lowest.net) lowest = e4;
        if (e5.net < lowest.net) lowest = e5;

        double average = (e1.net + e2.net + e3.net
        + e4.net + e5.net) / 5;

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Highest Salary: " + highest.name + " - " + highest.net);
        System.out.println("Lowest Salary: " + lowest.name + " - " + lowest.net);
        System.out.println("Average Salary: " + average);
    }
}