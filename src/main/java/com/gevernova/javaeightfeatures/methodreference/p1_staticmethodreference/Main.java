package com.gevernova.javaeightfeatures.methodreference.p1_staticmethodreference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Integer square(int n)
    {
        return  n * n;
    }
    public static void main(String[] args) {


        List<Integer> num = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        List<Integer> sqnum = num.stream().map(Main::square).toList();

        System.out.println(sqnum);


    }
}
