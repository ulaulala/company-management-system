import {Injectable, Pipe, PipeTransform} from "@angular/core";
import {Contract} from "../../commons/model/contract.model";

@Pipe({
  name: 'JobTitleFilter'
})
@Injectable()
export class JobTitleFilter implements PipeTransform {
  transform(contracts: Contract[], args: string): any {
    if (!JobTitleFilter) return true;
    return contracts.filter(contract => contract.jobTitle.toLowerCase().indexOf(args.toLowerCase()) !== -1);
  }
}
