package com.company.test.processor;

import org.junit.Test;

import static com.company.test.processor.SecondsProcessor.*;
import static com.company.test.state.LightState.*;
import static org.junit.Assert.*;

public class SecondsProcessorTest {

    private SecondsProcessor processor = new SecondsProcessor();

    @Test
    public void shouldDisplayLightOnWhenEvenNumberOfSeconds() {
        assertEquals(
                String.format(ROW_TEMPLATE, YELLOW.getCode()),
                processor.process(22));
    }

    @Test
    public void shouldDisplayLightOffWhenOddNumberOfSeconds() {
        assertEquals(
                String.format(ROW_TEMPLATE, OFF.getCode()),
                processor.process(21));
    }
}