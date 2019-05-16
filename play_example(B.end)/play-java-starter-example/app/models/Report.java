package models;

public class Report {
    private int isbn;
    private int readerId;
    private double fine;

    public Report(int isbn, int readerId, double fine) {
        this.isbn = isbn;
        this.readerId = readerId;
        this.fine = fine;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
