package com.gevernova.javaeightfeatures.datetime.p10_birthdaycountdown;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthday (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(input);

        LocalDate nextBirthday = birthday.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysRemaining = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("Days remaining until next birthday: " + daysRemaining);
    }
}
