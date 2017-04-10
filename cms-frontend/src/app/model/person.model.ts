export class Person {

  id: number;
  firstName: string;
  lastName: string;
  birthday: Date;

  constructor(id: number, firstName: string, lastName: string, birthday: Date) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
  }

}
