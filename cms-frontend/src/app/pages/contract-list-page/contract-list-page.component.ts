import { Component, OnInit } from '@angular/core';
import {Contract} from "../../commons/model/contract.model";
import {ContractsService} from "../../commons/service/contracts.service";
import {NameFilter} from "../pipes/name-filter";
import {TopNumberLimitFilter} from "../pipes/top-number-limit-filter";
import {BottomNumberLimitFilter} from "../pipes/bottom-number-limit-filter";

@Component({
  selector: 'app-contract-list-page',
  templateUrl: './contract-list-page.component.html',
  styleUrls: ['./contract-list-page.component.scss'],
  providers: [NameFilter, TopNumberLimitFilter, BottomNumberLimitFilter]
})
export class ContractListPageComponent implements OnInit {

  contracts: Contract[];
  firstOrLastName: string = '';
  bottomLimit: number;
  topLimit: number;

  constructor(private contractService: ContractsService) { }

  ngOnInit() {
    this.contractService.findAllContracts().subscribe((data: Array<Contract>) => {
      this.contracts = data;
    })
  }
}
