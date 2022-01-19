package com.luxoft.bankapp.domain;

public enum Gender {
    MALE("Mr."),
    FEMALE("Ms.");
    private final String greetingPrefix;
    Gender(String greetingPrefix) {
        this.greetingPrefix = greetingPrefix;
    }
    public String getGreetingPrefix() {
        return greetingPrefix;
    }
}

