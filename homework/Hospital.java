abstract class Employee {
    private int id;
    private String name;
    private double basicSalary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        basicSalary = 0;
    }

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

class Doctor extends Employee {
    Doctor(int id, String name) {
        super(id, name);
    }

    Doctor(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    double calculateSalary() {
        return getBasicSalary() + 10000;
    }
}

class Nurse extends Employee {
    Nurse(int id, String name) {
        super(id, name);
    }

    Nurse(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    double calculateSalary() {
        return getBasicSalary() + 5000;
    }
}

class LabTechnician extends Employee {
    LabTechnician(int id, String name) {
        super(id, name);
    }

    LabTechnician(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    double calculateSalary() {
        return getBasicSalary() + 4000;
    }
}

public class Hospital {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Doctor(101, "Krishna", 50000);
        employees[1] = new Nurse(102, "Karthick", 30000);
        employees[2] = new LabTechnician(103, "Arun", 25000);

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
            System.out.println();
        }

        Employee highest = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].calculateSalary() > highest.calculateSalary()) {
                highest = employees[i];
            }
        }

        System.out.println("Highest Paid Employee:");
        highest.displayDetails();
    }
}