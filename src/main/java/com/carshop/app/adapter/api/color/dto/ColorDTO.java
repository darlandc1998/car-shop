package com.carshop.app.modules.colors.dtos;

import java.io.Serializable;

public class ColorDTO implements Serializable {

    
    private int id;
    private String name;

    public ColorDTO() {

    }

    public ColorDTO(final int id) {
        this.id = id;
    }

    public ColorDTO(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
