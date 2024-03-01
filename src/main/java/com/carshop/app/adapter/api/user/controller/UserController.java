package com.carshop.app.adapter.api.user.controller;

import com.carshop.app.adapter.api.user.adapter.UserEndpointAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.adapter.api.user.dto.UserRegisterDTO;
import com.carshop.app.infrastructure.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.infrastructure.http.HttpResponse;

@RestController
@RequestMapping("/api/users")
public class UserController extends AuthorizationDataFilter {

    private final UserEndpointAdapter userEndpointAdapter;

    public UserController(final UserEndpointAdapter userEndpointAdapter) {
        this.userEndpointAdapter = userEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAll() {
        return userEndpointAdapter.listAll(getCustomerId());
    }

    @GetMapping("/v1/{userId}")
    public HttpResponse findById(
            @PathVariable final Integer userId) {
        return userEndpointAdapter.findById(getCustomerId(), userId);
    }

    @PostMapping("/v1")
    public HttpResponse save(@RequestBody final UserRegisterDTO registerDTO) {
        return userEndpointAdapter.save(getCustomerId(), registerDTO);
    }

}
