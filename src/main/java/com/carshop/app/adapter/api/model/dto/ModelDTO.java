package com.carshop.app.modules.models.dtos;

import java.io.Serializable;

public class ModelDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public ModelDTO() {

    }

    public ModelDTO(Integer id) {
        this.id = id;

    }

    public ModelDTO(Integer id, String name) {
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
