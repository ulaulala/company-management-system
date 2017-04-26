import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import {Person} from "../model/person.model";

@Injectable()
export class UserService {

  constructor(private http: Http) {
  }

  findUser(id: number): Observable<Person> {
    return this.http.get('/api/people/' + id)
      .map((response: Response) => response.json())
      .map((data: Person) => {
        return data;
      });
  }
}
