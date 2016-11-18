package com.company.test.processor;

import com.company.test.state.LampState;

/**
 * Processor for the seconds on the Berlin Clock
 */
public class SecondsProcessor implements Processor {

    protected static String ROW_TEMPLATE = "      %s     ";

    public String process(int data) {
        String state = (data % 2 == 0) ?  LampState.YELLOW.getCode() : LampState.OFF.getCode();
        return String.format(ROW_TEMPLATE, state);
    }

}
