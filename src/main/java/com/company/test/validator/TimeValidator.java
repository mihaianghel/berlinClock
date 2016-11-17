package com.company.test.validator;

public final class TimeValidator {

    private static final int HOURS_IN_A_DAY = 24;
    private static final int MINUTES_IN_AN_HOUR = 60;
    private static final int SECONDS_IN_A_MINUTE = 60;

    public static boolean validHours(int hours) {
        return (hours >= 0) && (hours < HOURS_IN_A_DAY);
    }

    public static boolean validMinutes(int minutes) {
        return (minutes >= 0) && (minutes < MINUTES_IN_AN_HOUR);
    }

    public static boolean validSeconds(int seconds) {
        return (seconds >= 0) && (seconds < SECONDS_IN_A_MINUTE);
    }

    private TimeValidator() {
    }
}
