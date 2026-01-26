package com.gevernova.javaeightfeatures.datetime.zoneddatetimeduration;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));

        ZonedDateTime localTime = ZonedDateTime.now(ZoneId.systemDefault());

        ZoneOffset utcOffset = utcTime.getOffset();
        ZoneOffset localOffset = localTime.getOffset();


        int totalSeconds =
                localOffset.getTotalSeconds() - utcOffset.getTotalSeconds();

        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60);

        System.out.println("UTC Time: " + utcTime.toLocalTime());
        System.out.println("Local Time: " + localTime.toLocalTime());
        System.out.println("Difference: " + hours + " hours " + minutes + " minutes");
        System.out.println("Local Zone: " + ZoneId.systemDefault());
    }
}
