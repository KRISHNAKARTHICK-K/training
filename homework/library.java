abstract class LibraryItem {
    String title;
    int itemId;
    boolean isAvailable = true;
    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
    }
    abstract int getLoanPeriod();
}
interface Borrowable {
    void borrowItem();
    void returnItem();
}
class Book extends LibraryItem implements Borrowable {
    Book(String title, int itemId) {
        super(title, itemId);
    }
    int getLoanPeriod() {
        return 14;
    }
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book is not available");
        }
    }
    public void returnItem() {
        isAvailable = true;
        System.out.println("Book returned");
    }
}
class Magazine extends LibraryItem {
    Magazine(String title, int itemId) {
        super(title, itemId);
    }
    int getLoanPeriod() {
        return 0;
    }
}
class DVD extends LibraryItem implements Borrowable {
    DVD(String title, int itemId) {
        super(title, itemId);
    }
    int getLoanPeriod() {
        return 7;
    }
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD borrowed");
        } else {
            System.out.println("DVD is not available");
        }
    }
    public void returnItem() {
        isAvailable = true;
        System.out.println("DVD returned");
    }
}
class Librarian {
    LibraryItem[] items = new LibraryItem[3];
    void displayItems() {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Title: " + items[i].title);
            System.out.println("ID: " + items[i].itemId);
            System.out.println("Loan Period: " + items[i].getLoanPeriod() + " days");
            System.out.println();
        }
    }
}
public class library {
    public static void main(String[] args) {
        Book b = new Book("Java", 101);
        Magazine m = new Magazine("Technology", 102);
        DVD d = new DVD("Avengers", 103);
        Librarian l = new Librarian();
        l.items[0] = b;
        l.items[1] = m;
        l.items[2] = d;
        l.displayItems();
        System.out.println();
        b.borrowItem();
        d.borrowItem();
        System.out.println("Magazine cannot be borrowed");
        b.returnItem();
        d.returnItem();
    }
}