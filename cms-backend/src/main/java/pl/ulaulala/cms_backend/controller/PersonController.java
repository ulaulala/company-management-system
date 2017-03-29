package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.entity.Person;
import pl.ulaulala.cms_backend.repository.PersonRepository;

import java.util.List;

@RestController("/person")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> findAllPeople() {
        return personRepository.findAll();
    }
}

