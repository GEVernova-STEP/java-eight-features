package com.gevernova.javaeightfeatures.datetime.p1_period;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2024, 7, 5);

        Period p1 = Period.between(d2, d1);

        System.out.println(p1.getYears() + "Years " + p1.getMonths() + "Months " + p1.getDays() + "Days");


    }
}
