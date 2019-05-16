import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../connection.service';


@Component({
  selector: 'app-display-item',
  templateUrl: './display-item.component.html',
  styleUrls: ['./display-item.component.css']
})
export class DisplayItemComponent implements OnInit {

  constructor(private connec:ConnectionService) { }

  ngOnInit() {
  }
  display(){
    this.connec.postData("http://localhost:9000/display");
  }
}
