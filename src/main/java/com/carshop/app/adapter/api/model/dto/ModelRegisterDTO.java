package com.carshop.app.adapter.api.model.dto;

import java.io.Serializable;

public class ModelRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long brandId;
    private String name;
    private String description;
    private String cover;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
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
