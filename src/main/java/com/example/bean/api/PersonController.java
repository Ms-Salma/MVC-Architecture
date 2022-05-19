package com.example.bean.api;

import com.example.bean.model.Person;
import com.example.bean.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/person")              //give it a path e.g api/v1/person--------for browsing
@RestController           //again DI
public class PersonController {
    private final PersonService personService;    //creating class and object of that class

@Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping                  //post method
    public void addPerson(@RequestBody Person person){             //@RequestBody annotation----it is a request body
        personService.addPerson(person);
    }
  //@Restcontroller    @Requestmapping ------path is given



}
