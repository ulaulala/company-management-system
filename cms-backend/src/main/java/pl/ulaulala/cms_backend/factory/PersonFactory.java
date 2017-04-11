package pl.ulaulala.cms_backend.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ulaulala.cms_backend.dto.AddressData;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.entity.Address;
import pl.ulaulala.cms_backend.entity.Person;

@Component
public class PersonFactory implements Factory<PersonData, Person> {

    private AddressFactory addressFactory;

    @Autowired
    public PersonFactory(AddressFactory addressFactory) {
        this.addressFactory = addressFactory;
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

        mapAddresses(dto, person.getAddress());

        return dto;
    }

    private void mapAddresses(PersonData personData, Address address) {
        AddressData addressData = addressFactory.create(address);
        personData.setAddress(addressData);
    }
}
