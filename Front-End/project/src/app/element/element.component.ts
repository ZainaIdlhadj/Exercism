import { Component, OnInit, Input } from '@angular/core';
import { Item } from '../model/item';

@Component({
  selector: 'app-element',
  templateUrl: './element.component.html',
  styleUrls: ['./element.component.css']
})
export class ElementComponent implements OnInit {

  @Input() item:Item;
  constructor() { 

  }

  ngOnInit(): void {

  }

}
