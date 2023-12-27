package com.carshop.app.modules.brands.dtos;

import java.io.Serializable;

public class BrandDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public BrandDTO() {

    }

    public BrandDTO(Integer id) {
        this.id = id;

    }

    public BrandDTO(Integer id, String name) {
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
