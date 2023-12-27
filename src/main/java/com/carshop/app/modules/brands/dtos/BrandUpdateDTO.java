package com.carshop.app.modules.brands.dtos;

import java.io.Serializable;

public class BrandUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public BrandUpdateDTO() {

    }

    public BrandUpdateDTO(String name) {
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
