class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double total() {
        return price * quantity;
    }

    void display() {
        System.out.println(name + " = " + total());
    }
}

public class product {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Pen", 10, 5);
        Product p2 = new Product(2, "Book", 50, 2);
        Product p3 = new Product(3, "Bag", 500, 1);
        Product p4 = new Product(4, "Bottle", 100, 2);
        Product p5 = new Product(5, "Box", 200, 3);

        System.out.println("Product Bill");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        double subtotal = p1.total() + p2.total() + p3.total()
                        + p4.total() + p5.total();

        double discount = subtotal * 0.10;
        double gst = (subtotal - discount) * 0.18;
        double finalBill = subtotal - discount + gst;

        int totalItems = p1.quantity + p2.quantity + p3.quantity
                       + p4.quantity + p5.quantity;

        System.out.println("\nSubtotal : " + subtotal);
        System.out.println("Discount : " + discount);
        System.out.println("GST      : " + gst);
        System.out.println("Final Bill : " + finalBill);
        System.out.println("Total Items : " + totalItems);
    }
}