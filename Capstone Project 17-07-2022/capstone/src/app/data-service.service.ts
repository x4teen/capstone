import { Injectable } from '@angular/core';
import{HttpClient, HttpHeaders} from '@angular/common/http'
import { Observable, observable } from 'rxjs';
import { UserClass } from './UserClass';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  //url:https://jsonplaceholder.typicode.com/users
  //url:string="https://jsonplaceholder.typicode.com/users";
  url:string="http://localhost:8082/api/user/";

  //inject the DI
  constructor(private http: HttpClient) { }

  getAllUser():Observable<UserClass[]>{
      return this.http.get<UserClass[]>(this.url);
  }

   

   
  deletePost(id:number) {
    let endPoints = id;
    this.http.delete(this.url + endPoints).subscribe(data => {
       return this.getAllUser();
    });
  }
  


   
}
