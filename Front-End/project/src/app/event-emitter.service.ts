import { Injectable, EventEmitter } from '@angular/core';    
import { Subscription } from 'rxjs/internal/Subscription';    
    
@Injectable({    
  providedIn: 'root'    
})    
export class EventEmitterService {    
    
  invokeFirstComponentFunction = new EventEmitter();    
  subsVar: Subscription;   
    
  constructor() { }    
    
  onFirstComponent(d,s,t) {    
    this.invokeFirstComponentFunction.emit({d,s,t});    
  }  
}   