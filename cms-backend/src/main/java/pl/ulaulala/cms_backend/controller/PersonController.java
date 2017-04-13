package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.entity.Person;
import pl.ulaulala.cms_backend.repository.PersonRepository;
import pl.ulaulala.cms_backend.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<PersonData> findAllPeople() {
        return personService.findAll();
    }

}

