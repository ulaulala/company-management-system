import { Component, OnInit } from '@angular/core';
import {Address} from "../../commons/model/address.model";
import {AddressesService} from "../../commons/service/addresses.service";
import {Person} from "../../commons/model/person.model";
import {CityFilter} from "../pipes/city-filter";

@Component({
  selector: 'app-address-data-list-page',
  templateUrl: './address-data-list-page.component.html',
  styleUrls: ['./address-data-list-page.component.scss'],
  providers: [CityFilter]
})
export class AddressDataListPageComponent implements OnInit {

  addresses: Address[];
  people: Person[];
  city: string = '';

  constructor(private addressService: AddressesService) { }

  ngOnInit() {
    this.addressService.findAllAddressOwners().subscribe((data: Array<Person>) => {
      this.people = data;
    })
    this.addressService.findAllAddresses().subscribe((data: Array<Address>) => {
      this.addresses = data;
    })
  }
}
