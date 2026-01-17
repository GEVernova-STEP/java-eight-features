package com.gevernova.javaeightfeatures.methodreference.p9_methodreference_optional;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        Optional.ofNullable(s).map(String::toUpperCase).ifPresent(System.out::println);
    }
}
