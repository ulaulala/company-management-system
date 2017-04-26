import {Address} from "./address.model";
import {Project} from "./project.model";

export class Person {

  id: number;
  firstName: string;
  lastName: string;
  birthday: Date;
  address: Address;
  projects: Project[];

}
