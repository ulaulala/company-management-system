import { Component, OnInit } from '@angular/core';
import {Project} from "../../commons/model/project.model";
import {ProjectService} from "../../commons/service/projects.service";
import {Router, ActivatedRoute} from "@angular/router";
import {Contract} from "../../commons/model/contract.model";
import {ContractsService} from "../../commons/service/contracts.service";

@Component({
  selector: 'app-project-team-list-page',
  templateUrl: './project-team-list-page.component.html',
  styleUrls: ['./project-team-list-page.component.scss']
})
export class ProjectTeamListPageComponent implements OnInit {

  contracts: Contract[];
  project: Project;
  id: number;

  constructor(private projectsService: ProjectService, private contractsService: ContractsService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.id = params['id'];
    });
    this.projectsService.findProject(this.id).subscribe((data: Project) => {
      this.project = data;
    })
    this.contractsService.findAllContracts().subscribe((data: Array<Contract>) => {
      this.contracts = data;
    })
  }
}
