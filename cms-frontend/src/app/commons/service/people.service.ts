import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import {Person} from "../model/person.model";

@Injectable()
export class PeopleService {

  constructor(private http: Http) {
  }

  findAllPeople(): Observable<Array<Person>> {
    return this.http.get('/api/people')
      .map((response: Response) => response.json())
      .map((data: Array<Person>) => {
        return data;
      });
  }

  findPerson(id: number): Observable<Person> {
    return this.http.get('/api/people/'+ id)
      .map((response: Response) => response.json())
      .map((data: Person) => {
        return data;
      });
  }

}
