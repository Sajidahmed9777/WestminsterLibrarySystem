import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NavigationBarComponent } from './navigation-bar/navigation-bar.component';
import { HomeBarComponent } from './home-bar/home-bar.component';
import { AddItemComponent } from './add-item/add-item.component';
import { AddBookComponent } from './AddItem/add-book/add-book.component';
import { AddDVDComponent } from './AddItem/add-dvd/add-dvd.component';
import { RemoveItemComponent } from './remove-item/remove-item.component';
import { DisplayItemComponent } from './display-item/display-item.component';
import { BorrowItemComponent } from './borrow-item/borrow-item.component';
import { ReturnItemComponent } from './return-item/return-item.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';

//const routes: Routes = [];
const route : Routes=[
  {path:"",component:NavigationBarComponent},
  {path:"homepage",component:HomeBarComponent},
  {path:"addItem",component:AddItemComponent},
  {path:"addBook",component:AddBookComponent},
  {path:"addDvD",component:AddDVDComponent},
  {path:"removeItem",component:RemoveItemComponent},
  {path:"displayItem",component:DisplayItemComponent},
  {path:"borrowItem",component:BorrowItemComponent},
  {path:"returnItem",component:ReturnItemComponent},
  {path:"generateReport",component:GenerateReportComponent}
]
@NgModule({
  imports: [RouterModule.forRoot(route)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
