package com.gevernova.javaeightfeatures.methodreference.methodreference_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return  s.contains("a");
            }
        };

        List<String> list = new ArrayList<>(List.of("Ashutosh", "Aman", "Sunil", "Jay"));

        list.stream().filter(predicate).forEach(System.out::println);
    }
}
