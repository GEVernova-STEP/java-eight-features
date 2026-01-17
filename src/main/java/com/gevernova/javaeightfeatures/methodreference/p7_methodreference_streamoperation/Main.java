package com.gevernova.javaeightfeatures.methodreference.p7_methodreference_streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter Word: ");
            list.add(sc.next());
        }

        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
