package com.gevernova.javaeightfeatures.datetime.p5_customdateformat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date-time (dd-MMM-yyyy HH:mm:ss): ");
        String inputDateTime = sc.nextLine();

        DateTimeFormatter inputDateTimeFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
        DateTimeFormatter outptuDateFromat = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy 'at' HH:mm:ss");

        try {
            LocalDateTime dateTime = LocalDateTime.parse(inputDateTime, inputDateTimeFormat);

            System.out.println("Formated Date: " + dateTime.format(outptuDateFromat));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format or value.");
        }
    }
}
