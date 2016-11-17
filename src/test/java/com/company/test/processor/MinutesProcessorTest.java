package com.company.test.processor;

import com.company.test.helper.TestDataHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class MinutesProcessorTest {

    private MinutesProcessor processor = new MinutesProcessor();

    @Test
    public void shouldDisplayCorrectLightSequence() {
        assertEquals(expected, processor.process(input));
    }

    private int input;

    private String expected;

    public MinutesProcessorTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return TestDataHelper.getMinutes();
    }
}