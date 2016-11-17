package com.company.test.e2e;

import com.company.test.clock.BerlinClock;
import org.junit.Assert;
import org.junit.Test;

public class EndToEndTest {

    private BerlinClock berlinClock = new BerlinClock();

    @Test
    public void shouldDisplayCorrectStructure() {
        String berlinTime = berlinClock.display(22, 33, 59);
        Assert.assertEquals("      O     \n" +
                            " R  R  R  R \n" +
                            " R  R  O  O \n" +
                            "YYRYYROOOOOO\n" +
                            " Y  Y  Y  O "
                            , berlinTime);
    }

}
