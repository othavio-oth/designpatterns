package com.othavio.creational.builder;

import java.time.LocalDate;

import com.othavio.creational.builder.model.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder().name("John Doe")
                .birthDate(LocalDate.of(1990, 1, 1))
                .phoneNumber("555-555-5555")
                .email("myemail@me.com")
                .address("123 Main Street")
                .build();
        System.out.println(person);

    }

}
