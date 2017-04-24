import { Component, OnInit } from '@angular/core';
import {Contract} from "../../commons/model/contract.model";
import {ContractsService} from "../../commons/service/contracts.service";

@Component({
  selector: 'app-contract-list-page',
  templateUrl: './contract-list-page.component.html',
  styleUrls: ['./contract-list-page.component.css']
})
export class ContractListPageComponent implements OnInit {

  contracts: Contract[];

  constructor(private contractService: ContractsService) { }

  ngOnInit() {
    this.contractService.findAllContracts().subscribe((data: Array<Contract>) => {
      this.contracts = data;
    })
  }
}
