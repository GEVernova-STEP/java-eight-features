package com.gevernova.javaeightfeatures.datetime.p8_leapyearchecker;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();

        boolean isLeap = Year.isLeap(currentYear);

        if (isLeap) {
            System.out.println(currentYear + " is a Leap Year");
        } else {
            System.out.println(currentYear + " is NOT a Leap Year");
        }
    }
}
