import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map'
import {Person} from "../model/person.model";

@Injectable()
export class UsersService {

  constructor(private http: Http) {
  }

  findAllPeople(): Observable<Array<Person>> {
    return this.http.get('/api/people')
      .map((response: Response) => response.json())
      .map((data: Array<Person>) => {
        return data;
      });
  }

}
