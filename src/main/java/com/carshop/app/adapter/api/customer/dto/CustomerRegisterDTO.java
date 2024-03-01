package com.carshop.app.adapter.api.customer.dto;

import com.carshop.app.adapter.api.user.dto.UserRootRegisterDTO;

import java.io.Serializable;

public class CustomerRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private UserRootRegisterDTO user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRootRegisterDTO getUser() {
        return user;
    }

    public void setUser(UserRootRegisterDTO user) {
        this.user = user;
    }
}
