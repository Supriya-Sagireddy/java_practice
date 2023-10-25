package Abstraction.LibraryCatalog;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", 101, "F. Scott Fitzgerald", 180);
        DVD dvd = new DVD("Inception", 201, "Christopher Nolan", 148);
        Magazine magazine = new Magazine("National Geographic", 301, "National Geographic Society", 127);

        book.checkOut();
        dvd.checkOut();
        magazine.checkOut();

        System.out.println("Title: " + book.getTitle());
        System.out.println("Checked Out: " + book.isCheckedOut());

        System.out.println("Title: " + dvd.getTitle());
        System.out.println("Checked Out: " + dvd.isCheckedOut());

        System.out.println("Title: " + magazine.getTitle());
        System.out.println("Checked Out: " + magazine.isCheckedOut());
    }
}

