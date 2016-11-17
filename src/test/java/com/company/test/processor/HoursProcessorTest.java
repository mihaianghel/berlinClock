package com.company.test.processor;

import com.company.test.helper.TestDataHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HoursProcessorTest {

    private HoursProcessor processor = new HoursProcessor();

    @Test
    public void shouldDisplayCorrectLightSequence() {
        assertEquals(expected, processor.process(input));
    }

    private int input;

    private String expected;

    public HoursProcessorTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return TestDataHelper.getHours();
    }
}