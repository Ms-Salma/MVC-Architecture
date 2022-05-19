package com.example.bean.Dao;

import com.example.bean.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//create repository class
                           //name of repository ----"FakeDao"
@Repository("FakeDao")     //@Repository Annotation is a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.

//this is an interface clASS.IT WILL WORK AS A REPOSITORY
//type--- Implements PersonDao(class name of package Dao)
//it will show error ,so press Alt+enter in order to resolve the issue
//select implement methods ,from popup menu
//another selection menu will appear select : insertPerson)id:UUID,person:person)int     from the two options
public class FakeDataAccessService implements PersonDao {

//create a list ----type private static List  ---select List.util to import
private static List<Person> DB=new ArrayList<>();     //name of list is DB-------declare list
       //syntax of creating list
    //List<String> arrayList=new ArrayLIst<>();



    //The @Override annotation indicates that the child class method is over-writing its base class method.
    @Override
    public int insertPerson(UUID id, Person person) {
        //get values through constructor
        DB.add(new Person(id, person.getName(),person.getEmail()));   //for POst method we dont get id ,only name and email

        return 1;         //by default return 0 ----edit it to return 1
    }
}

//   public int insertPerson(UUID id, Person person) ----------its an abstract method
//That's not a variable declaration. That's defining a method signature for the interface which would need to be implemented by any class implementing the interface