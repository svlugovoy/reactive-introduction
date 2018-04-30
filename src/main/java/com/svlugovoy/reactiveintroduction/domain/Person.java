package com.svlugovoy.reactiveintroduction.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Person {

    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        log.info("Created instance of Person: " + firstname + " " + lastname);
    }

    public String sayMyName(){
        return "Hello, my name is " + firstname + " " + lastname;
    }
}
