package com.carshop.app.infrastructure.authentication.filters;

import org.springframework.security.core.context.SecurityContextHolder;

import com.carshop.app.infrastructure.authentication.models.AuthorizationData;

public abstract class AuthorizationDataFilter {

    protected AuthorizationData getPrincipal() {
        return (AuthorizationData) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    protected Long getCustomerId() {
        return getPrincipal().getCustomerId();
    }

}
