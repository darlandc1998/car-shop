package com.carshop.app.modules.profiles.dtos;

import java.io.Serializable;

public class ProfileRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public ProfileRegisterDTO() {

    }

    public ProfileRegisterDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
