package models;
import play.mvc.Result;

import java.util.List;

public interface LibraryManager {
    public abstract void addItem(LibraryItem item);
    public abstract void borrow(int isbn, int rId,Date date);
    public abstract void returnItem(int isbn, int rId,Date date);
    public abstract void Report_generate();
    public abstract void deleteItem(int isbn);
    public abstract void display();
}
