package com.carshop.app.modules.permissions.dtos;

import java.io.Serializable;

public class PermissionRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String identifier;

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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}
