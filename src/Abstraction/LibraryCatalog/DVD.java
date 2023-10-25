package Abstraction.LibraryCatalog;

public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, int catalogNumber, String director, int duration) {
        super(title, catalogNumber);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void checkOut() {
        checkedOut = true;
    }

    @Override
    public void checkIn() {
        checkedOut = false;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }
}


