import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {Observable} from "rxjs/Observable";
import 'rxjs/add/operator/map'
import {Project} from "../model/project.model";

@Injectable()
export class ProjectService {

  constructor(private http: Http) {
  }

  findAllProjects(): Observable<Array<Project>> {
    return this.http.get('/api/projects')
      .map((response: Response) => response.json())
      .map((data: Array<Project>) => {
        return data;
      });
  }

  findProject(id: number): Observable<Project> {
    return this.http.get('/api/projects/'+ id)
      .map((response: Response) => response.json())
      .map((data: Project) => {
        return data;
      });
  }

}
