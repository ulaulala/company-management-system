import { Component, OnInit } from '@angular/core';
import {Project} from "../../commons/model/project.model";
import {ProjectService} from "../../commons/service/projects.service";
import {Router} from "@angular/router";
import {ProjectTeamListPageComponent} from "../project-team-list-page/project-team-list-page.component";

@Component({
  selector: 'app-project-list-page',
  templateUrl: './project-list-page.component.html',
  styleUrls: ['./project-list-page.component.scss']
})
export class ProjectListPageComponent implements OnInit {

  projects: Project[];

  constructor(private projectsService: ProjectService, private router: Router) { }

  ngOnInit() {
    this.projectsService.findAllProjects().subscribe((data: Array<Project>) => {
      this.projects = data;
    })
  }
  goToTeamDetails(id: number) {
    this.router.navigateByUrl('/projects/' + id + '/people', id);
    this.projectsService.findProject(id).subscribe((data: Project) => {
      ProjectTeamListPageComponent.arguments.project = data;
    })
  }
}
