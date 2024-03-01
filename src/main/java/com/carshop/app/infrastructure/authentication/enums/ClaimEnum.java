package com.carshop.app.infrastructure.authentication.enums;

public enum ClaimEnum {

    USER_ID("userId"),
    CUSTOMER_ID("customerId");

    private final String key;

    ClaimEnum(final String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
