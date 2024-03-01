package com.carshop.app.modules.login.models;

import java.io.Serializable;

public class Authenticator implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String token;

    public Authenticator(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public Authenticator(final String username, final String password, final String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
