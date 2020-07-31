import { Component, OnInit } from '@angular/core';

export class Vehicle{

  constructor(
    public plateNum: string,
    public model:string,
    public brand:string,
    public millage:number

  ){
  }

}

@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.css']
})
export class VehiclesComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
