import {Injectable, Pipe, PipeTransform} from "@angular/core";
import {Contract} from "../../commons/model/contract.model";

@Pipe({
  name: 'NameFilter'
})
@Injectable()
export class NameFilter implements PipeTransform {
  transform(contracts: Contract[], args: string): any {
    console.log(args);
    console.log(contracts);
    if (contracts || args) return contracts.filter(contract => (contract.person.lastName.toLowerCase().indexOf(args.toLowerCase()) !== -1 || contract.person.firstName.toLowerCase().indexOf(args.toLowerCase()) !== -1));
  }

}
