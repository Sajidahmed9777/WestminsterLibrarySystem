import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationBarComponent } from './navigation-bar/navigation-bar.component';
import { HomeBarComponent } from './home-bar/home-bar.component';
//import { AddComponent } from './add/add.component';
import { AddItemComponent } from './add-item/add-item.component';
import { AddBookComponent } from './AddItem/add-book/add-book.component';
import { AddDVDComponent } from './AddItem/add-dvd/add-dvd.component';
import { RemoveItemComponent } from './remove-item/remove-item.component';
import { DisplayItemComponent } from './display-item/display-item.component';
import { BorrowItemComponent } from './borrow-item/borrow-item.component';
import { ReturnItemComponent } from './return-item/return-item.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';
import{HttpClientModule} from '@angular/common/http';
import{ConnectionService}from './connection.service';

@NgModule({
  declarations: [
    AppComponent,
    NavigationBarComponent,
    HomeBarComponent,
    //AddComponent,
    AddItemComponent,
    AddBookComponent,
    AddDVDComponent,
    RemoveItemComponent,
    DisplayItemComponent,
    BorrowItemComponent,
    ReturnItemComponent,
    GenerateReportComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ConnectionService],
  bootstrap: [AppComponent]
})
export class AppModule { }