package com.gevernova.javaeightfeatures.datetime.p2_datetimefromatter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date in format yyyy-MM-dd: ");
        String dateString = sc.next();

        DateTimeFormatter ippattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateString, ippattern);

        DateTimeFormatter oppattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = date.format(oppattern);

        System.out.println(formattedDate);

    }
}
