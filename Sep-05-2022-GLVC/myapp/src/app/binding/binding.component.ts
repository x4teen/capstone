import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string="Nikunj Soni";
	url:string="https://www.google.com";

  //prepare array of products
  we:number=700;
  products=[{name:"pencil",price:"8.3",available:"05-09-2022",ratings:4.8},
            {name:"pen",price:"10",available:"10-09-2022",ratings:5.0},
            {name:"eraser",price:"2.5",available:"11-09-2022",ratings:4.4},
            {name:"duster",price:"12",available:"07-09-2022",ratings:4.6},
            {name:"scale",price:"15",available:"06-09-2022",ratings:4.9}
        ];
  flag=false;
  show(){
    this.flag=!this.flag;
  }
}
