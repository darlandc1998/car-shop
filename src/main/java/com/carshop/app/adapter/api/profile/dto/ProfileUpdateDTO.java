package com.carshop.app.adapter.api.profile.dto;

import java.io.Serializable;

public class ProfileUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String type;

    public ProfileUpdateDTO() {

    }

    public ProfileUpdateDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
