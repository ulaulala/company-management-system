package pl.ulaulala.cms_backend.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ulaulala.cms_backend.dto.ContractData;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.entity.Contract;
import pl.ulaulala.cms_backend.entity.Person;

@Component
public class ContractFactory implements Factory<ContractData, Contract>{

    private PersonFactory personFactory;

    @Autowired
    public ContractFactory(PersonFactory personFactory) {
        this.personFactory = personFactory;
    }

    @Override
    public ContractData create(Contract contract) {
        if(contract == null) {
            return null;
        }

        ContractData dto = new ContractData();

        dto.setJobTitle(contract.getJobTitle());
        dto.setSalary(contract.getSalary());
        dto.setStartDate(contract.getStartDate());
        dto.setEndDate(contract.getEndDate());

        mapPeople(dto, contract.getPerson());

        return dto;
    }

    private void mapPeople(ContractData contractData, Person person) {
        PersonData personData = personFactory.create(person);
        contractData.setPerson(personData);
    }
}
