import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../../connection.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
  isbn : number;
  title : string;
  sector:string;
  publicationDate:string;
  Authors:string;
  Publisher:string;
  Total:number;


  constructor(private connection:ConnectionService) { }

  ngOnInit() {
  }

  addBook(){
    console.log(this.isbn);
    let object = {
      "isbn":this.isbn,
      "title":this.title,
      "sector":this.sector,
      "publicationDate":this.publicationDate,
      "Authors":this.Authors,
      "Publisher":this.Publisher,
      "Total":this.Total

    }
    this.connection.postData("http://localhost:9000/addBook", object);
    console.log("ugt");
  }



}
