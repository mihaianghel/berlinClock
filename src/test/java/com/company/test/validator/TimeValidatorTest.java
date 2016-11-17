package com.company.test.validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeValidatorTest {

    @Test
    public void shouldValidateHours() throws Exception {
        assertTrue(TimeValidator.validHours(23));
        assertFalse(TimeValidator.validHours(73));
    }

    @Test
    public void shouldValidateMinutes() throws Exception {
        assertTrue(TimeValidator.validMinutes(23));
        assertFalse(TimeValidator.validMinutes(73));
    }

    @Test
    public void shouldValidateSeconds() throws Exception {
        assertTrue(TimeValidator.validSeconds(23));
        assertFalse(TimeValidator.validSeconds(73));
    }

}