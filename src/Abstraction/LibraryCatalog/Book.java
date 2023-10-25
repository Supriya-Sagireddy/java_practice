package Abstraction.LibraryCatalog;

public class Book extends LibraryItem {
    private String author;
    private int pageCount;

    public Book(String title, int catalogNumber, String author, int pageCount) {
        super(title, catalogNumber);
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public void checkOut() {
        checkedOut = true;
    }

    @Override
    public void checkIn() {
        checkedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }
}


