import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../connection.service';

@Component({
  selector: 'app-remove-item',
  templateUrl: './remove-item.component.html',
  styleUrls: ['./remove-item.component.css']
})
export class RemoveItemComponent implements OnInit {
  isbn : number = null;

  constructor(private connection:ConnectionService) { }

  ngOnInit() {
  }
  removeItem(){
    this.connection.removeData(this.isbn);
    console.log("Request item has been deleted!!")

  }
}
