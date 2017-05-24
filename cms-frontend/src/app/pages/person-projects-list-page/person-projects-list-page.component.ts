import { Component, OnInit } from '@angular/core';
import {Project} from "../../commons/model/project.model";
import {ProjectService} from "../../commons/service/projects.service";
import {Router, ActivatedRoute} from "@angular/router";
import {Contract} from "../../commons/model/contract.model";
import {ContractsService} from "../../commons/service/contracts.service";
import {Person} from "../../commons/model/person.model";
import {PeopleService} from "../../commons/service/people.service";

@Component({
  selector: 'app-person-projects-list-page',
  templateUrl: './person-projects-list-page.component.html',
  styleUrls: ['./person-projects-list-page.component.scss']
})
export class PersonProjectsListPageComponent implements OnInit {

  contract: Contract;
  person: Person;
  id: number;

  constructor(private contractsService: ContractsService, private peopleService: PeopleService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.id = params['id'];
    });
    this.contractsService.findContract(this.id).subscribe((data: Contract) => {
      this.contract = data;
    })
    this.peopleService.findPerson(this.id).subscribe((data: Person) => {
      this.person = data;
    })
  }
}
