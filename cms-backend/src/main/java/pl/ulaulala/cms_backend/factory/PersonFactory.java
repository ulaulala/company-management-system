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

        PersonData personData = new PersonData();

        personData.setId(person.getId());
        personData.setFirstName(person.getFirstName());
        personData.setLastName(person.getLastName());
        personData.setBirthday(person.getBirthday());

        mapAddresses(personData, person.getAddress());

        return personData;
    }

    private void mapAddresses(PersonData personData, Address address) {
        AddressData addressData = addressFactory.create(address);
        personData.setAddress(addressData);
    }
}
