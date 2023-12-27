package com.carshop.app.authentication.filters;

import org.springframework.security.core.context.SecurityContextHolder;

import com.carshop.app.authentication.models.AuthorizationData;

public abstract class AuthorizationDataFilter {

    protected AuthorizationData getPrincipal() {
        return (AuthorizationData) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    protected Integer getCustomerId() {
        return getPrincipal().getCustomerId();
    }

}
