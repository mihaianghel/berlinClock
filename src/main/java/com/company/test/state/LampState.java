package com.company.test.state;

/**
 * Possible states of the lamps
 */
public enum LampState {

    RED ("R"),
    YELLOW ("Y"),
    OFF ("O");

    private String code;

    LampState(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
