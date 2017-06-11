import {Injectable, Pipe, PipeTransform} from "@angular/core";
import {Address} from "../../commons/model/address.model";
import {Person} from "../../commons/model/person.model";

@Pipe({
  name: 'CityFilter'
})
@Injectable()
export class CityFilter implements PipeTransform {
  transform(people: Person[], args: string): any {
    if (people || args)return people.filter(person => (person.address.city.toLowerCase().indexOf(args.toLowerCase()) !== -1));
  }
}
