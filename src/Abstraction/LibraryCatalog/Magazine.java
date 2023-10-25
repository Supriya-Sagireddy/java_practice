package Abstraction.LibraryCatalog;

public class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber;

    public Magazine(String title, int catalogNumber, String publisher, int issueNumber) {
        super(title, catalogNumber);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkOut() {
        checkedOut = true;
    }

    @Override
    public void checkIn() {
        checkedOut = false;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}