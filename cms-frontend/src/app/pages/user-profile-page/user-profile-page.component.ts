import { Component, OnInit } from '@angular/core';
import {Person} from "../../commons/model/person.model";
import {Contract} from "../../commons/model/contract.model";
import {ContractsService} from "../../commons/service/contracts.service";
import {PeopleService} from "../../commons/service/people.service";

@Component({
  selector: 'app-user-profile-page',
  templateUrl: './user-profile-page.component.html',
  styleUrls: ['./user-profile-page.component.scss']
})
export class UserProfilePageComponent implements OnInit {

  person: Person;
  contract: Contract;

  constructor(private peopleService: PeopleService, private contractsService: ContractsService) { }

  ngOnInit() {
    this.peopleService.findPerson(1).subscribe((data: Person) => {
      this.person = data;
    })
    this.contractsService.findContract(1).subscribe((data: Contract) => {
      this.contract = data;
    })
  }

}

