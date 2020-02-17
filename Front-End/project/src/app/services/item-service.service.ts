import { Injectable } from '@angular/core';
import { Observable,Subject } from 'rxjs';
import { Item } from '../model/item';
import { HttpClient} from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'my-auth-token'
  })
};
@Injectable({
  providedIn: 'root'
})
export class ItemServiceService {

  private itemsUrl: string;
 
  constructor(private http: HttpClient) {
    this.itemsUrl = 'http://localhost:8080/item/items';
  }
 
  public findAll(): Observable<any[]> {
    return this.http.get<Item[]>(this.itemsUrl);
  }
  public find(d,s,t): Observable<any[]> {
    return this.http.get<Item[]>('http://localhost:8080/item/find',{
      params: {
        d: d,
        s:s,
        id:t
      }
  });}
 
}