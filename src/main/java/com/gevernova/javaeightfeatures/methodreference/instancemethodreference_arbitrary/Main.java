package com.gevernova.javaeightfeatures.methodreference.instancemethodreference_arbitrary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ashutosh", "Ram", "Akhil", "Chandan", "Bhole"));

        names.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }
}
