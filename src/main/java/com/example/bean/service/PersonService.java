package com.example.bean.service;

import com.example.bean.Dao.PersonDao;
import com.example.bean.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service             //annotation on top of body ..It is used to mark the class as a service provider...here we come to know that its a service class
//@Service annotation is used with classes that provide some business functionalities
public class PersonService {
    //inject Dao interface
    //add a reference
private final PersonDao personDao;             //its a reference.add reference       PersonDao is interface class .so this class is referencing to interface class


@Autowired    //object is injected here..metadata provide to IOC
   /* public PersonService(PersonDao personDao) {         //creating constructor         here we are using interface once
        this.personDao = personDao;
    }
*/



    public PersonService(@Qualifier("FakeDao") PersonDao personDao) {         //here
        this.personDao = personDao;
    }

    //how to create method in java: static void methodname(){} -------simple method wd no return type



    public int addPerson(Person person){          //creating a method
        return personDao.insertPerson(person);
    }


}
