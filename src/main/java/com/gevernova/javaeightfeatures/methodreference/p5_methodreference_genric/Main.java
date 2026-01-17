package com.gevernova.javaeightfeatures.methodreference.p5_methodreference_genric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T extends Comparable<T>> T findMax(List<T> list){
       /*
        T max = list.get(0);

        for (T element : list)
        {
           if (element.compareTo(max) > 0)
           {
               max = element;
           }
        }
        return max;
       */
        return list.stream().max(Comparable::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        // Integer list
        List<Integer> numbers = new ArrayList<>(List.of(10, 25, 5, 40, 15));
        System.out.println("Maximum number: " + findMax(numbers));

        // String list
        List<String> names = new ArrayList<>(List.of("Ashutosh", "Ankur", "Mayank"));
        System.out.println("Maximum string: " + findMax(names));

        List<String> empty = new ArrayList<>();
        System.out.println("Maximum in empty list: " + findMax(empty));
    }

}
