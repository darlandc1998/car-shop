package com.carshop.app.adapter.api.profile.controller;

import com.carshop.app.adapter.api.profile.adapter.ProfileEndpointAdapter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.adapter.api.profile.dto.ProfileRegisterDTO;
import com.carshop.app.adapter.api.profile.dto.ProfileUpdateDTO;
import com.carshop.app.infrastructure.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.infrastructure.http.HttpResponse;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController extends AuthorizationDataFilter {

    private final ProfileEndpointAdapter profileEndpointAdapter;

    public ProfileController(final ProfileEndpointAdapter profileEndpointAdapter) {
        this.profileEndpointAdapter = profileEndpointAdapter;
    }

    @GetMapping("/{profileId}")
    public HttpResponse findById(
            @PathVariable final Integer profileId) {
        return this.profileEndpointAdapter.findById(getCustomerId(), profileId);
    }

    @GetMapping
    public HttpResponse listAll() {
        return this.profileEndpointAdapter.listAll(getCustomerId());
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody ProfileRegisterDTO profileRegisterDTO) {
        return this.profileEndpointAdapter.save(getCustomerId(), profileRegisterDTO);
    }

    @PutMapping("/{profileId}")
    public HttpResponse update(
            @PathVariable final Integer profileId,
            @RequestBody ProfileUpdateDTO profileUpdateDTO) {
        profileUpdateDTO.setId(profileId);
        return this.profileEndpointAdapter.update(getCustomerId(), profileUpdateDTO);
    }

    @DeleteMapping("/{profileId}")
    public HttpResponse delete(
            @PathVariable final Integer profileId) {
        return this.profileEndpointAdapter.delete(getCustomerId(), profileId);
    }

}
