package com.carshop.app.infrastructure.authentication.models;

public class AuthorizationData {

    private Long userId;
    private Long customerId;
    private String username;

    public AuthorizationData(final Long userId, final Long customerId, final String username) {
        this.userId = userId;
        this.customerId = customerId;
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
