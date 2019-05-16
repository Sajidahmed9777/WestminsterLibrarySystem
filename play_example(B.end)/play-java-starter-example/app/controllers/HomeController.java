package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.mvc.*;

import views.html.*;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    static  WestminsterLibraryManager libraryManager= new WestminsterLibraryManager();//accessing the wet..mins..library..mangager


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result addBook(){
        JsonNode data = request().body().asJson();
        System.out.println(data);
        int isbn = data.get("isbn").asInt();
        String title = data.get("title").asText();
        String sector= data.get("sector").asText();
        String publicationDate= data.get("publicationDate").asText();
        String Authors = data.get("Authors").asText();
        String Publisher = data.get("Publisher").asText();
        int Total = data.get("Total").asInt();
        String[] strArr = publicationDate.split("-");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);
        Date date = new Date(year, month, day);


        Book book = new Book(isbn,title,sector,date,null,null,0,Authors,Publisher,Total);
        libraryManager.addItem(book);
        return ok();
    }

    public Result addDVD(){
        JsonNode data = request().body().asJson();
        System.out.println(data);
        int isbn= data.get("isbn").asInt();
        String title= data.get("title").asText();
        String sector= data.get("sector").asText();
        String publicationDate= data.get("publicationDate").asText();
        String actors = data.get("Actors").asText();
        String language=data.get("Language").asText();
        String subtitles= data.get ("Subtitles").asText();
        String Producer= data.get("Producer").asText();
        String[] strArr = publicationDate.split("-");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);
        Date date = new Date(year, month, day);

        DVD dvd =new DVD(isbn,title,sector,date,null,null,language,subtitles,actors,Producer,0);
        libraryManager.addItem(dvd);
        return ok();
    }

    public Result removeItem(int isbn){
        libraryManager.deleteItem(isbn);
        return ok();
    }

    public Result borrowItem(){
        JsonNode data = request().body().asJson();
        System.out.println(data);
        int isbn= data.get("isbn").asInt();
        int  rId= data.get("rId").asInt();
        String borrowDate= data.get("borrowDate").asText();
        String[] strArr = borrowDate.split("-");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);
        Date date = new Date(year, month, day);
        libraryManager.borrow(isbn, rId, date);

        return ok();
    }
    public Result returnItem(){
        System.out.println("working");
       JsonNode data = request().body().asJson();

     int isbn= data.get("isbn").asInt();
      int  rId= data.get("rId").asInt();
        String returnDate= data.get("returnDate").asText();
      String[] strArr = returnDate.split("-");
     int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
      int day = Integer.parseInt(strArr[2]);
        Date date = new Date(year, month, day);
       libraryManager.returnItem(isbn, rId, date);

        return ok();
    }
    public Result report(){
        libraryManager.Report_generate();
        return ok();
    }
    public  Result display(){
        libraryManager.display();
        return  ok();
    }

}
