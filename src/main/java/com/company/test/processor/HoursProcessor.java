package com.company.test.processor;

import com.company.test.state.LampState;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Processor for the hours on the Berlin Clock
 */
public class HoursProcessor implements Processor {

    private static String ROW_TEMPLATE = " %s  %s  %s  %s \n %s  %s  %s  %s ";

    public String process(int data) {

        List<String> firstRowSequence = getSequenceFor(data / 5);
        List<String> secondRowSequence = getSequenceFor(data % 5);

        firstRowSequence.addAll(secondRowSequence);

        return String.format(ROW_TEMPLATE, firstRowSequence.toArray());
    }

    private List<String> getSequenceFor(int noOfLampsOn) {
        return IntStream
                .range(0, 4)
                .mapToObj(i -> (i < noOfLampsOn) ? LampState.RED.getCode() : LampState.OFF.getCode())
                .collect(Collectors.toList());
    }

}
