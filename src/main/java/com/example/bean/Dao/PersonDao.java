package com.example.bean.Dao;

import com.example.bean.model.Person;

import java.util.UUID;
//insert() is a java method for inseting data
public interface PersonDao {                  //method 1
    int insertPerson(UUID id, Person person); //This method used to insert data

    default int insertPerson(Person person){ //method 2
        UUID id=UUID.randomUUID();         //it generates random id for diff students
        return insertPerson(id,person);    //returns

    }
}
