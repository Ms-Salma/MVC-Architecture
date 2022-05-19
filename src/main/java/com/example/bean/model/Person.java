package com.example.bean.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    //steps for modal class,creating datatype
    //create a modal class (with name Person)
    //declare id,name and email
    //create constructor...A constructor in Java is similar to a method that is invoked when an object of the class is created. Unlike Java methods, a constructor has the same name as that of the class and does not have any return type.

    private UUID id;
    private String name;
    private String email;

  //  public Person(UUID id, String name, String email) {
    //}

    public Person(@JsonProperty("id") UUID id ,
                  @JsonProperty("name") String name,
                  @JsonProperty("email")   String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    //generate getter and setter
    //shortkeys (Alt+Insert)
    //menu will appear ,select getter and setter
    //select all declarations
    //getter and setter will be generated

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
