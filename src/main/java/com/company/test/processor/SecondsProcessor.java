package com.company.test.processor;

import com.company.test.state.LightState;

public class SecondsProcessor implements Processor {

    protected static String ROW_TEMPLATE = "      %s     ";

    public String process(int data) {
        String state = (data % 2 == 0) ?  LightState.YELLOW.getCode() : LightState.OFF.getCode();
        return String.format(ROW_TEMPLATE, state);
    }

}
