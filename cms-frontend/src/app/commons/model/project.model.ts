import {Person} from "./person.model";

export class Project {

  id: number;
  title: string;
  principal: string;
  price: number;
  startDate: Date;
  endDate: Date;
  description: string;

  //team: Set<Person>;
}
