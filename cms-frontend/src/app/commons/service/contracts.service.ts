import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Contract } from '../model/contract.model';
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import {Person} from "../model/person.model";

@Injectable()
export class ContractsService {

  constructor(private http: Http) {
  }

  findAllContracts(): Observable<Array<Contract>> {
    return this.http.get('/api/contracts')
      .map((response: Response) => response.json())
      .map((data: Array<Contract>) => {
        return data;
      });
  }

  findContract(id: number): Observable<Contract> {
    return this.http.get('/api/contracts/' + id)
      .map((response: Response) => response.json())
      .map((data: Contract) => {
        return data;
      });
  }

}
