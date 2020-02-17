import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Observable, Subject} from 'rxjs';
import { Topic } from '../model/topic';

@Injectable({
  providedIn: 'root'
})
export class TopicService {

  private topicsUrl: string;
 
  constructor(private http: HttpClient) {
    this.topicsUrl = 'http://localhost:8080/topic';
  }
  public findAll(): Observable<any[]> {
    return this.http.get<Topic[]>(this.topicsUrl + "/items");
  }
 
}