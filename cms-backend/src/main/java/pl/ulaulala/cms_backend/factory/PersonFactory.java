package pl.ulaulala.cms_backend.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ulaulala.cms_backend.dto.AddressData;
import pl.ulaulala.cms_backend.dto.ContractData;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.dto.ProjectData;
import pl.ulaulala.cms_backend.entity.Address;
import pl.ulaulala.cms_backend.entity.Contract;
import pl.ulaulala.cms_backend.entity.Person;
import pl.ulaulala.cms_backend.entity.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonFactory implements Factory<PersonData, Person> {

    private AddressFactory addressFactory;
    private ProjectFactory projectFactory;
    private ContractFactory contractFactory;

    @Autowired
    public PersonFactory(AddressFactory addressFactory, ProjectFactory projectFactory) {
        this.addressFactory = addressFactory;
        this.projectFactory = projectFactory;
    }

    @Override
    public PersonData create(Person person) {
        if(person == null){
            return null;
        }

        PersonData dto = new PersonData();

        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthday(person.getBirthday());

        return dto;
    }

    public PersonData createAll(Person person) {
        if(person == null){
            return null;
        }

        PersonData dto = new PersonData();

        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthday(person.getBirthday());
        mapAddresses(dto, person.getAddress());
        mapProjects(dto, new ArrayList<Project>(person.getProjects()));
        //mapContracts(dto, new ArrayList<Contract>(person.getContracts()));

        return dto;
    }

    private void mapAddresses(PersonData personData, Address address) {
        AddressData addressData = addressFactory.create(address);
        personData.setAddress(addressData);
    }

    private void mapProjects(PersonData personData, List<Project> projects) {
        List<ProjectData> projectData = projectFactory.createList(projects);
        personData.setProjects(new HashSet<ProjectData>(projectData));
    }

//    private void mapContracts(PersonData personData, List<Contract> contracts) {
//        List<ContractData> contractData = contractFactory.createList(contracts);
//        personData.setContracts(new HashSet<ContractData>(contractData));
//    }

    public List<PersonData> createListWith(List<Person> entities) {
        return entities.stream()
                .map(this::createAll)
                .collect(Collectors.toList());
    }
}
