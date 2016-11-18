package com.company.test.processor;

import com.company.test.state.LightState;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinutesProcessor implements Processor {

    private static String ROW_TEMPLATE = "%s%s%s%s%s%s%s%s%s%s%s\n %s  %s  %s  %s ";

    public String process(int data) {

        List<String> firstRowSequence = getSequenceForFiveMinuteRow(data / 5);
        List<String> secondRowSequence = getSequenceForOneMinuteRow(data % 5);

        firstRowSequence.addAll(secondRowSequence);
        return String.format(ROW_TEMPLATE, firstRowSequence.toArray());
    }

    private List<String> getSequenceForFiveMinuteRow(int noOfLightsOn) {
        return IntStream
                .rangeClosed(1, 11)
                .mapToObj(i -> {
                    if (i <= noOfLightsOn) {
                        return (i % 3 == 0) ? LightState.RED.getCode() : LightState.YELLOW.getCode();
                    } else {
                         return LightState.OFF.getCode();
                    }
                })
                .collect(Collectors.toList());
    }

    private List<String> getSequenceForOneMinuteRow(int noOfLightsOn) {
        return IntStream
                .range(0, 4)
                .mapToObj(i -> (i < noOfLightsOn) ? LightState.YELLOW.getCode() : LightState.OFF.getCode())
                .collect(Collectors.toList());
    }
}
