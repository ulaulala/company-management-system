import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {Person} from "../model/person.model";
import {Address} from "../model/address.model";

@Injectable()
export class AddressesService {

  constructor(private http: Http) {
  }

  findAllAddressOwners(): Observable<Array<Person>> {
    return this.http.get('/api/people')
      .map((response: Response) => response.json())
      .map((data: Array<Person>) => {
        return data;
      });
  }
  findAllAddresses(): Observable<Array<Address>> {
    return this.http.get('/api/addresses')
      .map((response: Response) => response.json())
      .map((data: Array<Address>) => {
        return data;
      });
  }
}
