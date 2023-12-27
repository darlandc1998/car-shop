package com.carshop.app.authentication.models;

public class AuthorizationData {

    private Integer userId;
    private Integer customerId;
    private String username;

    public AuthorizationData(final Integer userId, final Integer customerId, final String username) {
        this.userId = userId;
        this.customerId = customerId;
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
