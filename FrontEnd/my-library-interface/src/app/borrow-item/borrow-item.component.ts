import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../connection.service';

@Component({
  selector: 'app-borrow-item',
  templateUrl: './borrow-item.component.html',
  styleUrls: ['./borrow-item.component.css']
})
export class BorrowItemComponent implements OnInit {
  isbn:number;
  rId:number
  borrowDate:string;

  constructor(private connection:ConnectionService) { }

  ngOnInit() {
  }
borrowitem(){
    console.log(this.isbn);
    let object = {
      "isbn":this.isbn,
      "rId":this.rId,
      "borrowDate":this.borrowDate
  }
  this.connection.postData("http://localhost:9000/borrowItem", object);
    console.log("ugt");
}
}
