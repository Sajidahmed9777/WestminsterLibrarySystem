import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../../connection.service';

@Component({
  selector: 'app-add-dvd',
  templateUrl: './add-dvd.component.html',
  styleUrls: ['./add-dvd.component.css']
})
export class AddDVDComponent implements OnInit {
  isbn : number;
  title : string;
  sector:string;
  publicationDate:string;
  Subtitles:string;
  Producer:string;
  Actors:string;
  Language:string;


  constructor(private connection:ConnectionService) { }

  ngOnInit() {
  }
  addDVD(){
    console.log(this.isbn);
    let object = {
      "isbn":this.isbn,
      "title":this.title,
      "sector":this.sector,
      "publicationDate":this.publicationDate,
      "Subtitles":this.Subtitles,
      "Producer":this.Producer,
      "Actors":this.Actors,
      "Language":this.Language
    
  }
  this.connection.postData("http://localhost:9000/addDVD", object);
    console.log("ugt");
}
}
