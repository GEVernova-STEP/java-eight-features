package com.gevernova.javaeightfeatures.methodreference.constructormethodreference_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Person> people = random.ints(5, 1, 100).mapToObj(Person::new).collect(Collectors.toList());

        people.forEach(System.out::println);

    }
}

