package com.carshop.app.modules.models.dtos;

import java.io.Serializable;

public class ModelRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
