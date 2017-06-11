import {Injectable, Pipe, PipeTransform} from "@angular/core";
import {Contract} from "../../commons/model/contract.model";

@Pipe({
  name: 'TopNumberLimitFilter'
})
@Injectable()
export class TopNumberLimitFilter implements PipeTransform {
  transform(contracts: Contract[], args: number): any {
    if (contracts){
      if(args) return contracts.filter(contract => contract.salary <= args);
      else return contracts;
    }
  }
}
