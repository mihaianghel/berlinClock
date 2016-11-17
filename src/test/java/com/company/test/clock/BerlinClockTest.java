package com.company.test.clock;

import com.company.test.transformer.TimeTransformer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BerlinClockTest {

    private static final ArgumentCaptor<Integer> CAPTOR = ArgumentCaptor.forClass(Integer.class);
    private BerlinClock berlinClock = new BerlinClock();

    @Mock
    private TimeTransformer timeTransformer;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(BerlinClockTest.class);
        berlinClock.setTransformer(timeTransformer);
    }

    @Test
    public void shouldCallTransformerWithCorrectParameters() {
        berlinClock.display(12,13,14);

        verify(timeTransformer).processHours(CAPTOR.capture());
        Assert.assertEquals(12, CAPTOR.getValue().intValue());

        verify(timeTransformer).processMinutes(CAPTOR.capture());
        Assert.assertEquals(13, CAPTOR.getValue().intValue());

        verify(timeTransformer).processSeconds(CAPTOR.capture());
        Assert.assertEquals(14, CAPTOR.getValue().intValue());

        verify(timeTransformer, times(2)).getDelimiter();
    }
}