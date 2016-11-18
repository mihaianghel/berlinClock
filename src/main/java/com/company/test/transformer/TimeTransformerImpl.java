package com.company.test.transformer;

import com.company.test.processor.HoursProcessor;
import com.company.test.processor.MinutesProcessor;
import com.company.test.processor.SecondsProcessor;

/**
 * Implementation of the time transformer responsible for calling
 * specific processors for each unit of time
 */
public class TimeTransformerImpl implements TimeTransformer {

    private static final String DELIMITER = "\n";

    private HoursProcessor hoursProcessor = new HoursProcessor();

    private MinutesProcessor minutesProcessor = new MinutesProcessor();

    private SecondsProcessor secondsProcessor = new SecondsProcessor();

    @Override
    public String getDelimiter() {
        return DELIMITER;
    }

    @Override
    public String processHours(int hours) {
        return hoursProcessor.process(hours);
    }

    @Override
    public String processMinutes(int minutes) {
        return minutesProcessor.process(minutes);
    }

    @Override
    public String processSeconds(int seconds) {
        return secondsProcessor.process(seconds);
    }

    //VisibleForTesting
    protected void setHoursProcessor(HoursProcessor hoursProcessor) {
        this.hoursProcessor = hoursProcessor;
    }

    //VisibleForTesting
    protected void setMinutesProcessor(MinutesProcessor minutesProcessor) {
        this.minutesProcessor = minutesProcessor;
    }

    //VisibleForTesting
    protected void setSecondsProcessor(SecondsProcessor secondsProcessor) {
        this.secondsProcessor = secondsProcessor;
    }
}
