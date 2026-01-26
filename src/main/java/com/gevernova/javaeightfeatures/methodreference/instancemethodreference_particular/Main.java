package com.gevernova.javaeightfeatures.methodreference.instancemethodreference_particular;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(List.of(
                new Person("Ashutosh"),
                new Person("Ram"),
                new Person("Anil")
        ));

        person.stream().map(Person::getName).forEach(System.out::println);

    }
}
