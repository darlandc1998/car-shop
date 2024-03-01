package com.carshop.app.adapter.api.brand.dto;

import java.io.Serializable;

public class BrandUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private String description;
    private String cover;

    public BrandUpdateDTO() {

    }

    public BrandUpdateDTO(String name) {
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
