import { Component, OnInit } from '@angular/core';
import{ConnectionService}from '../connection.service';

@Component({
  selector: 'app-generate-report',
  templateUrl: './generate-report.component.html',
  styleUrls: ['./generate-report.component.css']
})
export class GenerateReportComponent implements OnInit {

  constructor(private con: ConnectionService) { }

  ngOnInit() {
  }

  report(){
    this.con.postData("http://localhost:9000/report");
  }
}
