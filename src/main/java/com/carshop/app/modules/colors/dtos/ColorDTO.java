package com.carshop.app.modules.colors.dtos;

import java.io.Serializable;

public class ColorDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public ColorDTO() {

    }

    public ColorDTO(final Integer id) {
        this.id = id;
    }

    public ColorDTO(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
