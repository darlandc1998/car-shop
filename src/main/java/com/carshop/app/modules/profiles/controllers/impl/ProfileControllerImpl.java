package com.carshop.app.modules.profiles.controllers.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.profiles.controllers.ProfileController;
import com.carshop.app.modules.profiles.dtos.ProfileDTO;
import com.carshop.app.modules.profiles.dtos.ProfileRegisterDTO;
import com.carshop.app.modules.profiles.dtos.ProfileUpdateDTO;
import com.carshop.app.modules.profiles.entities.Profile;
import com.carshop.app.modules.profiles.services.ProfileService;

@Service
public class ProfileControllerImpl implements ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileControllerImpl(final ProfileService profileService) {
        this.profileService = profileService;
    }

    @Override
    public HttpResponse save(int customerId, ProfileRegisterDTO registerDTO) {
        try {
            final Profile profile = this.profileService.save(mountProfileOf(customerId, registerDTO));
            return HttpHandle.created(mountProfileDTOOf(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(int customerId, ProfileUpdateDTO updateDTO) {
        try {
            final Profile profile = this.profileService.save(mountProfileOf(customerId, updateDTO));
            return HttpHandle.success(mountProfileDTOOf(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse listAll(int customerId) {
        try {
            final List<ProfileDTO> profiles = this.profileService.findAllByCustomerId(customerId).stream().map(profile -> mountProfileDTOOf(profile))
                    .collect(Collectors.toList());
            return HttpHandle.success(profiles);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(int customerId, Integer profileId) {
        try {
            final Profile profile = this.profileService.findByCustomerIdAndProfileId(customerId, profileId);
            return HttpHandle.success(mountProfileDTOOf(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(int customerId, Integer profileId) {
        try {
            this.profileService.delete(new Profile(profileId, customerId));
            return HttpHandle.success(profileId);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private ProfileDTO mountProfileDTOOf(final Profile profile) {
        final ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setId(profile.getId());
        profileDTO.setName(profile.getName());
        return profileDTO;
    }

    private Profile mountProfileOf(final int customerId, final ProfileRegisterDTO registerDTO) {
        final Profile profile = new Profile();
        profile.setCustomerId(customerId);
        profile.setName(registerDTO.getName());
        profile.setCreatedAt(LocalDateTime.now());
        profile.setUpdatedAt(LocalDateTime.now());
        profile.setDeleted(0);
        return profile;
    }

    private Profile mountProfileOf(final int customerId, final ProfileUpdateDTO updateDTO) {
        final Profile profile = new Profile();
        profile.setId(updateDTO.getId());
        profile.setCustomerId(customerId);
        profile.setName(updateDTO.getName());
        profile.setUpdatedAt(LocalDateTime.now());
        return profile;
    }

}
