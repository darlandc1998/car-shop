package com.carshop.app.modules.brands.dtos;

import java.io.Serializable;

public class BrandRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    public BrandRegisterDTO() {

    }

    public BrandRegisterDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
