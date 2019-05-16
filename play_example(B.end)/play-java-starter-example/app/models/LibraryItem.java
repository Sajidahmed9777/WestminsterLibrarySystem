package models;

public abstract class LibraryItem {
    private int ISBN;
    private String title;
    private String sector;
    private Date publicationDate;
    private Date borrowedDate;
    private Reader reader;
    private double overdue;



    public LibraryItem(int ISBN, String title, String sector, Date publicationDate, Date borrowedDate, Reader reader,double overdue) {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = publicationDate;
        this.borrowedDate = borrowedDate;
        this.reader = reader;
        this.overdue =overdue ;
        this.sector=sector;

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public double getOverdue() {
        return overdue;
    }

    public void setOverdue(double overdue) {
        this.overdue = overdue;
    }
}
