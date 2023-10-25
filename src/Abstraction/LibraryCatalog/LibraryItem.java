package Abstraction.LibraryCatalog;

public abstract class LibraryItem {
    protected String title;
    protected int catalogNumber;
    protected boolean checkedOut;

    public LibraryItem(String title, int catalogNumber) {
        this.title = title;
        this.catalogNumber = catalogNumber;
        this.checkedOut = false;
    }

    public abstract void checkOut();
    public abstract void checkIn();

    public String getTitle() {
        return title;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }
}
