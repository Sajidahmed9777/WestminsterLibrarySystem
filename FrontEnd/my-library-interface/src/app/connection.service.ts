import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ConnectionService {

  constructor(private link:HttpClient) { }

  postData(url:string,object?:any){
    this.link.post(url,object).subscribe();
    console.log("Success");
    
  }

  removeData(isbn:number){
    const linkUrl=`http://localhost:9000/removeItem/${isbn}`;
    return this.link.delete(linkUrl).toPromise();
  }
}
