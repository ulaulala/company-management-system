import {Injectable, Pipe, PipeTransform} from "@angular/core";
import {Contract} from "../../commons/model/contract.model";

@Pipe({
  name: 'BottomNumberLimitFilter'
})
@Injectable()
export class BottomNumberLimitFilter implements PipeTransform {
  transform(contracts: Contract[], args: number): any {
    if (contracts){
      if(args) return contracts.filter(contract => contract.salary >= args);
      else return contracts;
    }
  }
}
