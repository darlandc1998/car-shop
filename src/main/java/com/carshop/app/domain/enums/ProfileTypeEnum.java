package com.carshop.app.domain.enums;

public enum ProfileTypeEnum {

    ROOT("Root");

    private final String name;

    ProfileTypeEnum(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
