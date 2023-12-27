package com.carshop.app.modules.colors.dtos;

import java.io.Serializable;

public class ColorRegisterDTO implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
