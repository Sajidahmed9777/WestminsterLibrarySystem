package models;

public class DVD extends LibraryItem{
    private String languages;
    private String subtitles;
    private String actors;
    private String producer;
    private static int count;


    public DVD(int ISBN, String title, String sector, Date publicationDate, Date borrowedDate, Reader reader, String languages,
               String subtitles, String actors, String producer,double overdue) {
        super(ISBN, title, sector, publicationDate,  borrowedDate, reader, overdue);


        /*if (getCount() > 50) {
            System.out.println("error");
        }*/
        this.languages = languages;
        this.subtitles = subtitles;
        this.actors = actors;
        this.producer = producer;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public static int getCount() {
        return count;
    }

    public static void addCount() {
        DVD.count += 1;
    }
}


