package com.carshop.app.modules.profiles.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.profiles.controllers.ProfileController;
import com.carshop.app.modules.profiles.dtos.ProfileRegisterDTO;
import com.carshop.app.modules.profiles.dtos.ProfileUpdateDTO;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileRoutes extends AuthorizationDataFilter {

    private final ProfileController profileController;

    @Autowired
    public ProfileRoutes(final ProfileController profileController) {
        this.profileController = profileController;
    }

    @GetMapping("/{profileId}")
    public HttpResponse findById(
            @PathVariable final Integer profileId) {
        return this.profileController.findById(getCustomerId(), profileId);
    }

    @GetMapping
    public HttpResponse listAll() {
        return this.profileController.listAll(getCustomerId());
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody ProfileRegisterDTO profileRegisterDTO) {
        return this.profileController.save(getCustomerId(), profileRegisterDTO);
    }

    @PutMapping("/{profileId}")
    public HttpResponse update(
            @PathVariable final Integer profileId,
            @RequestBody ProfileUpdateDTO profileUpdateDTO) {
        profileUpdateDTO.setId(profileId);
        return this.profileController.update(getCustomerId(), profileUpdateDTO);
    }

    @DeleteMapping("/{profileId}")
    public HttpResponse delete(
            @PathVariable final Integer profileId) {
        return this.profileController.delete(getCustomerId(), profileId);
    }

}
