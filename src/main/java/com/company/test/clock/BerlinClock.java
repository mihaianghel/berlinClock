package com.company.test.clock;

import com.company.test.transformer.TimeTransformer;
import com.company.test.transformer.TimeTransformerImpl;

public class BerlinClock implements Clock {

    private TimeTransformer transformer = new TimeTransformerImpl();

    public String display(int hours, int minutes, int seconds) {
        StringBuilder builder = new StringBuilder();
        return builder
                .append(transformer.processSeconds(seconds))
                .append(transformer.getDelimiter())
                .append(transformer.processHours(hours))
                .append(transformer.getDelimiter())
                .append(transformer.processMinutes(minutes))
                .toString();
    }

    //VisibleForTesting
    protected void setTransformer(TimeTransformer transformer) {
        this.transformer = transformer;
    }
}
