import { Component, OnInit } from '@angular/core';
import {UsersService} from "./users.service";
import {Person} from "../model/person.model";

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  people: Person[];

  constructor(private userService: UsersService) { }

  ngOnInit() {
    this.userService.findAllPeople().subscribe((data: Array<Person>) => {
      this.people = data;
    });
  }

}
