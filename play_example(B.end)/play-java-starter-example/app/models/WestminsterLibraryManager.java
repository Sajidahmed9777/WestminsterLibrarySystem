package models;
import java.util.ArrayList;
import java.util.List;

public class WestminsterLibraryManager implements  LibraryManager {
    public List<LibraryItem> list = new ArrayList<>();
    public List<Report> report = new ArrayList<>();

    @Override
    public void addItem(LibraryItem item){
        if (item instanceof Book){
            if(Book.getCount() <= 100) {
                list.add(item);
                Book.addCount();
            }else System.err.println("error max reached");
        }
        if (item instanceof DVD) {
            if (DVD.getCount() <= 50) {
                list.add(item);
            } else System.err.println("error max reached");
        }
        System.out.println("No of Books = " + Book.getCount()+"\nNo of DVD = "+DVD.getCount());
    }

    @Override
    public void deleteItem(int isbn) {
        boolean haveItem = false;
        for (LibraryItem item:list ) {
            if(item.getISBN()==isbn){
                list.remove(item);
                System.out.println("Item Deleted!!");
                haveItem = true;
            }
        }
        if (!haveItem){
            System.out.println("Invalid isbn!");
        }
    }

    @Override
    public void borrow(int isbn, int rId,Date date) {
        boolean haveItem = false;
        Reader rd = new Reader("student",rId,"077","mmm@mmm");
        for (LibraryItem libraryItem : list) {
            if (libraryItem.getISBN() == isbn) {
                libraryItem.setReader(rd);
                libraryItem.setBorrowedDate(date);
                System.out.println("Borrowed book by reader id "+rId+" !!");
                haveItem = true;

            }
        }
        if (!haveItem){
            System.out.println("Invalid isbn!");
        }
    }

    @Override
    public void returnItem(int isbn, int rId,Date date) {
        int index=0;
        boolean valid = false;
        double fine=0;
        for (int i= 0 ; i< list.size() ; i++) {
            if (list.get(i).getISBN() == isbn) {
                if (list.get(i).getReader().getId() == rId){

                    index = i;

                    Date borrowDate=list.get(i).getBorrowedDate();
                    int borrowYear=borrowDate.getYear();
                    int borrowMonth=borrowDate.getMonth();
                    int borrowDay=borrowDate.getDay();

                    int returnYear=date.getYear();
                    int returnMonth=date.getMonth();
                    int returnDay=date.getDay();

                    if(returnYear>=borrowYear){
                        if((returnYear==borrowYear)&&(returnMonth<borrowMonth)){
                            System.out.println("Invalid month");
                        }else{
                            if((returnYear==borrowYear)&&(returnMonth==borrowMonth)&&(returnDay<borrowDay)){
                                System.out.println("Invalid Day");
                            }else{

                                System.out.println("Calculating Fine...!!1");
                                int totalYear=returnYear-borrowYear;
                                int totalMonth=returnMonth-borrowMonth;
                                int totalDay= returnDay-borrowDay;
                                int finalDays= (totalYear*12*30)+(totalMonth*30)+totalDay;
                                if(finalDays>7) {
                                    if (finalDays < 10) {
                                        fine=(finalDays-7)*0.2*24;
                                    } else{
                                        fine=(3*0.2*24)+(((finalDays-7)-3)*0.5*24);
                                    }
                                }
                                valid = true;
                            }
                        }

                    }else System.out.println("Invalid Year");

                }
            }
        }
        if (valid){
            report.add(new Report(list.get(index).getISBN(), list.get(index).getReader().getId(), fine));
            list.get(index).setReader(null);
            list.get(index).setBorrowedDate(null);
            System.out.println("Book isbn "+isbn+" is returned by reader id "+rId+" Fine is "+fine);

        }else{
            System.out.println("Date or isbn is invalid!");
        }
    }

    @Override
    public void Report_generate() {
        System.out.println("report generating...");
        System.out.println("ISBN\t\t"+"r_id\t\t"+"fine");
        for(Report report: report){
            System.out.println(report.getIsbn()+"\t\t"+report.getReaderId()+"\t\t"+report.getFine());
        }
    }

    @Override
    public void display(){
        System.out.println("ISBN\t\t"+"title");
        for(LibraryItem item: list){

            System.out.println(item.getISBN()+"\t\t"+item.getTitle());
        }
    }
}
