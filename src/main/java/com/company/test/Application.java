package com.company.test;

import com.company.test.clock.BerlinClock;
import com.company.test.clock.Clock;
import com.company.test.validator.TimeValidator;

import java.util.Scanner;

/**
 * Driver of the application
 */
public class Application {

    private static Clock clock = new BerlinClock();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insert the time to represent!");

        System.out.println("Hour (24h format):");
        int hours = in.nextInt();
        while (!TimeValidator.validHours(hours)) {
            System.out.println("Invalid hour format. Please try again (24h format):");
            hours = in.nextInt();
        }

        System.out.println("Minutes:");
        int minutes = in.nextInt();
        while (!TimeValidator.validMinutes(minutes)) {
            System.out.println("Invalid minute format. Please try again:");
            minutes = in.nextInt();
        }

        System.out.println("Seconds:");
        int seconds = in.nextInt();
        while (!TimeValidator.validSeconds(seconds)) {
            System.out.println("Invalid second format. Please try again:");
            seconds = in.nextInt();
        }

        System.out.println(String.format("Representing time %d:%d:%d", hours, minutes, seconds));
        System.out.println(clock.display(hours, minutes, seconds));
    }
}
