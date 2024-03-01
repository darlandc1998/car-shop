package com.carshop.app.adapter.api.authentication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.adapter.api.authentication.dto.LoginDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final AuthenticationEndpointAdapter authenticationEndpointAdapter;

    public AuthenticationController(final AuthenticationEndpointAdapter authenticationEndpointAdapter) {
        this.authenticationEndpointAdapter = authenticationEndpointAdapter;
    }

    @PostMapping("/v1")
    public HttpResponse login(@RequestBody final LoginDTO loginDTO) {
        return this.authenticationEndpointAdapter.login(loginDTO);
    }

}
