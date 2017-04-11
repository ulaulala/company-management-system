package pl.ulaulala.cms_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.entity.Person;
import pl.ulaulala.cms_backend.factory.PersonFactory;
import pl.ulaulala.cms_backend.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;
    private PersonFactory personFactory;

    @Autowired
    public PersonService(PersonRepository personRepository, PersonFactory personFactory) {
        this.personRepository = personRepository;
        this.personFactory = personFactory;
    }

    public List<PersonData> findAll() {
        List<Person> people = personRepository.findAll();
        return personFactory.createList(people);
    }
}
