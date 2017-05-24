import { Component, OnInit } from '@angular/core';
import {ContractsService} from "../../commons/service/contracts.service";
import {Contract} from "../../commons/model/contract.model";
import {Router} from "@angular/router";

@Component({
  selector: 'app-team-list-page',
  templateUrl: './team-list-page.component.html',
  styleUrls: ['./team-list-page.component.scss']
})
export class TeamListPageComponent implements OnInit {

  contracts: Contract[];

  constructor(private contractsService: ContractsService, private router: Router) { }

  ngOnInit() {
  this.contractsService.findAllContracts().subscribe((data: Array<Contract>) => {
    this.contracts = data;
  })

  }
  goToListOfProjects(id: number) {
    this.router.navigateByUrl('/contracts/' + id + '/person', id);
  }
}
