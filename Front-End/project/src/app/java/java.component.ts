import { Component, OnInit } from '@angular/core';
import {Item} from '../model/item'
import {ItemServiceService} from '../services/item-service.service'
import { EventEmitterService } from '../event-emitter.service'; 

@Component({
  selector: 'app-java',
  templateUrl: './java.component.html',
  styleUrls: ['./java.component.css']
})
export class JavaComponent implements OnInit {

  items:Item[]
 
  constructor(private itemService:ItemServiceService,private eventEmitterService: EventEmitterService) { }

  ngOnInit() {
    this.itemService.findAll().subscribe(data => {this.items=data;})
    
    if (this.eventEmitterService.subsVar==undefined) {    
      this.eventEmitterService.subsVar = this.eventEmitterService.    
      invokeFirstComponentFunction.subscribe((a) => {    
        this.changeItems(a.d,a.s,a.t);  }); 
  }
}

  
  changeItems(d,s,t){
    this.itemService.find(d,s,t).subscribe(data => {this.items=data;})
  }
 

}
