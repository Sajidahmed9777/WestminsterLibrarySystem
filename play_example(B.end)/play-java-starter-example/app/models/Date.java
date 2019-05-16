package models;

public class Date {
    private int day;
    private int month;
    private int year;
    private int dayOfYear;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate(){
        return String.format  ("%d/%d/%d",day,month,year);

    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public Date(int day, int month, int year, int dayOfYear){
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayOfYear = dayOfYear;
    }

    public Date(){

    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public int subtractDate(int currentDay, int borrowedDay){
        return currentDay - borrowedDay;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
