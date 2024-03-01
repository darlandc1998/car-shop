package com.carshop.app.adapter.api.brand.dto;

import java.io.Serializable;

public class BrandRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    private String cover;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

}
