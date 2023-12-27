package com.carshop.app.modules.login.dtos;

import java.io.Serializable;

public class SessionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String login;
    private String token;

    public SessionDTO(final String login, final String token) {
        this.login = login;
        this.token = token;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
