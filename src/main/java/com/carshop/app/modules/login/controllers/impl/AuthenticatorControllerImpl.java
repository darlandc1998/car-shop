package com.carshop.app.modules.login.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.login.controllers.AuthenticatorController;
import com.carshop.app.modules.login.dtos.LoginDTO;
import com.carshop.app.modules.login.dtos.SessionDTO;
import com.carshop.app.modules.login.models.Authenticator;
import com.carshop.app.modules.login.services.AuthenticatorService;

@Service
public class AuthenticatorControllerImpl implements AuthenticatorController {

    private AuthenticatorService authenticatorService;

    @Autowired
    public AuthenticatorControllerImpl(final AuthenticatorService authenticatorService) {
        this.authenticatorService = authenticatorService;
    }

    @Override
    public HttpResponse login(LoginDTO loginDTO) {
        try {
            final Authenticator authenticator = this.authenticatorService.login(new Authenticator(loginDTO.getUsername(), loginDTO.getPassword()));
            return HttpHandle.success(new SessionDTO(authenticator.getUsername(), authenticator.getToken()));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
