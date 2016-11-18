package com.company.test.processor;

import com.company.test.state.LampState;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Processor for the minutes on the Berlin Clock
 */
public class MinutesProcessor implements Processor {

    private static String ROW_TEMPLATE = "%s%s%s%s%s%s%s%s%s%s%s\n %s  %s  %s  %s ";

    public String process(int data) {

        List<String> firstRowSequence = getSequenceForFiveMinuteRow(data / 5);
        List<String> secondRowSequence = getSequenceForOneMinuteRow(data % 5);

        firstRowSequence.addAll(secondRowSequence);
        return String.format(ROW_TEMPLATE, firstRowSequence.toArray());
    }

    private List<String> getSequenceForFiveMinuteRow(int noOfLampsOn) {
        return IntStream
                .rangeClosed(1, 11)
                .mapToObj(i -> {
                    if (i <= noOfLampsOn) {
                        return (i % 3 == 0) ? LampState.RED.getCode() : LampState.YELLOW.getCode();
                    } else {
                         return LampState.OFF.getCode();
                    }
                })
                .collect(Collectors.toList());
    }

    private List<String> getSequenceForOneMinuteRow(int noOfLightsOn) {
        return IntStream
                .range(0, 4)
                .mapToObj(i -> (i < noOfLightsOn) ? LampState.YELLOW.getCode() : LampState.OFF.getCode())
                .collect(Collectors.toList());
    }
}
