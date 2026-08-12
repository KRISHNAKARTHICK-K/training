abstract class Vehicle {
    String vehicleNumber;
    String brand;
    double baseRate;
    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }
    abstract double calculateRentalCost(int days);
}
interface Insurable {
    double getInsuranceCost();
}
class Car extends Vehicle implements Insurable {
    Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }
    double calculateRentalCost(int days) {
        return baseRate * days;
    }
    public double getInsuranceCost() {
        return 500;
    }
}
class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }
    double calculateRentalCost(int days) {
        return baseRate * days;
    }
}
class Truck extends Vehicle implements Insurable {
    Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }
    double calculateRentalCost(int days) {
        return baseRate * days + 1000;
    }
    public double getInsuranceCost() {
        return 1000;
    }
}
class RentalAgency {
    Vehicle[] vehicles = new Vehicle[3];
    void generateBill(String number, int days) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].vehicleNumber.equals(number)) {
                double bill = vehicles[i].calculateRentalCost(days);
                if (vehicles[i] instanceof Insurable) {
                    bill = bill + ((Insurable) vehicles[i]).getInsuranceCost();
                }
                System.out.println("Vehicle: " + vehicles[i].brand);
                System.out.println("Number: " + vehicles[i].vehicleNumber);
                System.out.println("Days: " + days);
                System.out.println("Rental Cost: " + bill);
                System.out.println();
            }
        }
    }
}
public class vehicle{
    public static void main(String[] args) {
        Car c = new Car("C101", "Toyota", 2000);
        Bike b = new Bike("B101", "Yamaha", 500);
        Truck t = new Truck("T101", "Tata", 3000);
        RentalAgency r = new RentalAgency();
        r.vehicles[0] = c;
        r.vehicles[1] = b;
        r.vehicles[2] = t;
        r.generateBill("C101", 3);
        r.generateBill("T101", 2);
        r.generateBill("B101", 4);
    }
}