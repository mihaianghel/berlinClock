package com.company.test.state;


public enum LightState {

    RED ("R"),
    YELLOW ("Y"),
    OFF ("O");

    private String code;

    LightState(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
