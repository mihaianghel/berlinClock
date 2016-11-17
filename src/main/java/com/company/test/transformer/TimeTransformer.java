package com.company.test.transformer;

public interface TimeTransformer {

    String getDelimiter();
    String processHours(int hours);
    String processMinutes(int minutes);
    String processSeconds(int seconds);
}
