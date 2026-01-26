package com.gevernova.javaeightfeatures.datetime.temporaladjusters;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate firstDay = today.with(TemporalAdjusters.firstDayOfMonth());

        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("Today: " + today);
        System.out.println("First Day: " + firstDay);
        System.out.println("Last Day: " + lastDay);
    }
}
