package com.carshop.app.adapter.api.color.dto;

import java.io.Serializable;

public class ColorDTO implements Serializable {


    private long id;
    private String name;

    public ColorDTO() {

    }

    public ColorDTO(final long id) {
        this.id = id;
    }

    public ColorDTO(final long id, final String name) {
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

}
