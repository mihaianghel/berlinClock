package com.company.test.transformer;

import com.company.test.processor.HoursProcessor;
import com.company.test.processor.MinutesProcessor;
import com.company.test.processor.SecondsProcessor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TimeTransformerImplTest {

    private TimeTransformerImpl transformer = new TimeTransformerImpl();

    private static final ArgumentCaptor<Integer> CAPTOR = ArgumentCaptor.forClass(Integer.class);
    private static final int TIME = 3;

    @Mock
    private HoursProcessor hoursProcessor;

    @Mock
    private MinutesProcessor minutesProcessor;

    @Mock
    private SecondsProcessor secondsProcessor;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(TimeTransformerImplTest.class);
        transformer.setHoursProcessor(hoursProcessor);
        transformer.setMinutesProcessor(minutesProcessor);
        transformer.setSecondsProcessor(secondsProcessor);
    }

    @Test
    public void shouldCallHoursProcessorWithCorrectParameter() {
        transformer.processHours(TIME);

        verify(hoursProcessor).process(CAPTOR.capture());
        assertEquals(TIME, CAPTOR.getValue().intValue());
    }

    @Test
    public void shouldCallMinutesProcessorWithCorrectParameter() {
        transformer.processMinutes(TIME);

        verify(minutesProcessor).process(CAPTOR.capture());
        assertEquals(TIME, CAPTOR.getValue().intValue());
    }

    @Test
    public void shouldCallSecondsProcessorWithCorrectParameter() {
        transformer.processSeconds(TIME);

        verify(secondsProcessor).process(CAPTOR.capture());
        assertEquals(TIME, CAPTOR.getValue().intValue());
    }
}