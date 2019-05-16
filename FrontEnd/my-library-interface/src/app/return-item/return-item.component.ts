import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../connection.service';

@Component({
  selector: 'app-return-item',
  templateUrl: './return-item.component.html',
  styleUrls: ['./return-item.component.css']
})
export class ReturnItemComponent implements OnInit {
  isbn:number;
  rId:number
  returnDate:string;

  constructor(private connection:ConnectionService) { }

  ngOnInit() {
  }
  returnitem(){
    console.log(this.isbn);
    let object = {
      "isbn":this.isbn,
      "rId":this.rId,
      "returnDate":this.returnDate


}
this.connection.postData("http://localhost:9000/returnItem", object);
    console.log("ugt");
  }
}
