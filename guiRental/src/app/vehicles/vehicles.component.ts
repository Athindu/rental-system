import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {ModalDismissReasons, NgbModal} from '@ng-bootstrap/ng-bootstrap';
import { NgForm, FormBuilder, FormGroup } from '@angular/forms';

export class Vehicle{

  constructor(
    public plateNum: string,
    public model:string,
    public brand:string,
    public millage:string,
    public ac:string,
    public transmission:string,
    public starttype:string,
    public type:string
  ){
  }

}

@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.css']
})
export class VehiclesComponent implements OnInit {

  vehicles: Vehicle[];
  result: string;
  editForm: FormGroup;
 

  constructor(
    private httpClient: HttpClient ,
    private modalService: NgbModal,
   
    
  ) { }

  ngOnInit() {
    this.getVehicles();

  }

  getVehicles(){
    this.httpClient.get<any>('http://localhost:9001/vehicles').subscribe(
      response => {
        console.log(response);
        this.vehicles = response;
      }
    );
  }

  open(content) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.result = `Closed with: ${result}`;
    }, (reason) => {
      this.result = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

  onSubmit(f: NgForm) {
    const url = 'http://localhost:9001/vehicles/add';
    this.httpClient.post(url, f.value)
      .subscribe((result) => {
        this.ngOnInit(); 
      });
    this.modalService.dismissAll(); 
  }


}
