import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-service-demo',
  templateUrl: './service-demo.component.html',
  styleUrls: ['./service-demo.component.css']
})
export class ServiceDemoComponent implements OnInit {

  constructor(private service:UserService) { }

  ngOnInit(): void {
  }

}
