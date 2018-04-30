package com.svlugovoy.reactiveintroduction.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class PersonDTO {

    private String firstname;
    private String lastname;

    public PersonDTO(Person person) {
        this.firstname = person.getFirstname();
        this.lastname = person.getLastname();
        log.info("Created instance of PersonDTO: " + firstname + " " + lastname);
    }

    public String sayMyName(){
        return "Hello, my name is " + firstname + " " + lastname + " DTO";
    }
}
