package com.carshop.app.modules.login.routes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.login.controllers.AuthenticatorController;
import com.carshop.app.modules.login.dtos.LoginDTO;

@RestController
@RequestMapping("/api/v1/login")
public class AuthenticatorRoutes {

    private AuthenticatorController authenticatorController;

    public AuthenticatorRoutes(final AuthenticatorController authenticatorController) {
        this.authenticatorController = authenticatorController;
    }

    @PostMapping
    public HttpResponse login(@RequestBody final LoginDTO loginDTO) {
        return this.authenticatorController.login(loginDTO);
    }

}
