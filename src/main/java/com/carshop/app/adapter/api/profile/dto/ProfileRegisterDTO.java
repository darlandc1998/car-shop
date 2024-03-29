package com.carshop.app.adapter.api.profile.dto;

import java.io.Serializable;

public class ProfileRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
