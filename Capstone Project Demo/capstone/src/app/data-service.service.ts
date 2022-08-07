import { Injectable } from '@angular/core';
import{HttpClient} from  '@angular/common/http'
import { Observable } from 'rxjs';
import { UserClass } from './UserClass';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
  //url
  url:string="http://localhost:8082/api/user/";
  //inject the DI
  constructor(private http:HttpClient) {

   }

   //method to get all  values from API
   getAllUsers(): Observable<UserClass[]>{
    return this.http.get<UserClass[]>(this.url);
  }
}
