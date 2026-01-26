package com.gevernova.javaeightfeatures.datetime.daylightsavertime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

public class Main {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();

        ZonedDateTime now = ZonedDateTime.now(zoneId);

        ZoneRules rules = zoneId.getRules();

        boolean isDST = rules.isDaylightSavings(now.toInstant());

        System.out.println("Current Time Zone : " + zoneId);
        System.out.println("Current Date-Time : " + now);

        if (isDST) {
            System.out.println("Daylight Saving Time is ACTIVE");
        } else {
            System.out.println("Daylight Saving Time is NOT active");
        }
    }
}
