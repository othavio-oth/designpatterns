package com.othavio.creational.builder;

import com.othavio.creational.builder.builders.PersonBuilder;
import com.othavio.creational.builder.model.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new PersonBuilder().address("123 Main Street").name("John Doe").build();
        System.out.println(person);

    }

}
