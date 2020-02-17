import { Component, OnInit, Output,EventEmitter, Input } from '@angular/core';
import { EventEmitterService } from '../event-emitter.service';  
import {Topic} from '../model/topic'
import {TopicService} from '../services/topic.service'
@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.css']
})
export class FilterComponent implements OnInit {
topics: Topic[]
@Input() counter:number

  constructor(private eventEmitterService: EventEmitterService, private topicService: TopicService ) { }

  ngOnInit(): void {
         this.topicService.findAll().subscribe(data => {this.topics=data;})
       
  }
change(d,s,t){
  this.eventEmitterService.onFirstComponent(d,s,t);
}

}
