package models;

public class Book extends LibraryItem{

    private String authors;
    private String publisher;
    private int noPages;
    private static int count;

    public Book(int ISBN, String title, String sector, Date publicationDate, Date borrowedDate, Reader reader,
                double overdue, String author, String publisher, int pages) {
        super(ISBN, title, sector, publicationDate, borrowedDate, reader, overdue);
        this.authors = author;
        this.publisher = publisher;
        this.noPages = pages;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoPages() {
        return noPages;
    }

    public void setNoPages(int noPages) {
        this.noPages = noPages;
    }

    public static int getCount() {
        return count;
    }

    public static void addCount() {
        Book.count += 1;
    }
}
