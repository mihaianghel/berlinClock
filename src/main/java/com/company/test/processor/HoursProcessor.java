package com.company.test.processor;

import com.company.test.state.LightState;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HoursProcessor implements Processor {

    private static String ROW_TEMPLATE = " %s  %s  %s  %s \n %s  %s  %s  %s ";

    public String process(int data) {

        List<String> firstRowSequence = getSequenceFor(data / 5);
        List<String> secondRowSequence = getSequenceFor(data % 5);

        firstRowSequence.addAll(secondRowSequence);

        return String.format(ROW_TEMPLATE, firstRowSequence.toArray());
    }

    private List<String> getSequenceFor(int noOfLightsOn) {
        return IntStream
                .range(0, 4)
                .mapToObj(i -> (i < noOfLightsOn) ? LightState.RED.getCode() : LightState.OFF.getCode())
                .collect(Collectors.toList());
    }

}
