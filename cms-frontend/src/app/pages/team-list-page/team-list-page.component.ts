import { Component, OnInit } from '@angular/core';
import {ContractsService} from "../../commons/service/contracts.service";
import {Contract} from "../../commons/model/contract.model";

@Component({
  selector: 'app-team-list-page',
  templateUrl: './team-list-page.component.html',
  styleUrls: ['./team-list-page.component.scss']
})
export class TeamListPageComponent implements OnInit {

  contracts: Contract[];

  constructor(private contractsService: ContractsService) { }

  ngOnInit() {
  this.contractsService.findAllContracts().subscribe((data: Array<Contract>) => {
    this.contracts = data;
  })
}

}
