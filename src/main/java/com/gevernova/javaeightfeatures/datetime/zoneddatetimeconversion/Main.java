package com.gevernova.javaeightfeatures.datetime.zoneddatetimeconversion;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date-time (yyyy-MM-dd HH:mm:ss): ");
        String inputDateTime = scanner.nextLine();

        System.out.print("Enter source time zone (e.g. UTC, Asia/Kolkata): ");
        String sourceZone = scanner.nextLine();

        System.out.print("Enter target time zone (e.g. America/New_York): ");
        String targetZone = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.parse(inputDateTime, formatter);

        ZonedDateTime sourceZonedDateTime = localDateTime.atZone(ZoneId.of(sourceZone));

        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(ZoneId.of(targetZone));

        System.out.println("\nSource Time (" + sourceZone + "): " + sourceZonedDateTime.format(formatter));
        System.out.println("Target Time (" + targetZone + "): " + targetZonedDateTime.format(formatter));
    }
}
