package com.gevernova.javaeightfeatures.datetime.p6_workingwithinstant;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();

        long sum = 0;
        Integer n = 1000000000;
        for (long j=0;j<10;j++) {
            for (long i = 0; i < n; i++) {
                sum ++;
//                System.out.print("Hi");
            }
        }

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        System.out.println("Execution time: " + duration.toSeconds() + " seconds");
    }
}
