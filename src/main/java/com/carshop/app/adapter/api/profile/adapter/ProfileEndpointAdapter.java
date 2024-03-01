package com.carshop.app.adapter.api.profile.adapter;

import java.util.Collection;

import com.carshop.app.adapter.api.profile.dto.ProfileRegisterDTO;
import com.carshop.app.adapter.api.profile.dto.ProfileUpdateDTO;
import com.carshop.app.adapter.api.profile.mapper.ProfileDtoMapper;
import com.carshop.app.application.port.api.profile.ProfileEndpointPort;
import com.carshop.app.application.usecase.profile.ProfileUseCase;
import com.carshop.app.domain.Profile;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class ProfileEndpointAdapter implements ProfileEndpointPort {

    private final ProfileUseCase profileUseCase;
    private final ProfileDtoMapper profileDtoMapper;

    public ProfileEndpointAdapter(final ProfileUseCase profileUseCase, ProfileDtoMapper profileDtoMapper) {
        this.profileUseCase = profileUseCase;
        this.profileDtoMapper = profileDtoMapper;
    }

    @Override
    public HttpResponse save(long customerId, ProfileRegisterDTO registerDTO) {
        try {
            Profile profile = profileDtoMapper.toDomainFromSaveBody(customerId, registerDTO);
            profile = profileUseCase.save(profile);
            return HttpHandle.created(profileDtoMapper.toDto(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(long customerId, ProfileUpdateDTO updateDTO) {
        try {
            Profile profile = profileDtoMapper.toDomainFromSaveBody(customerId, updateDTO);
            profile = profileUseCase.save(profile);
            return HttpHandle.success(profileDtoMapper.toDto(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse listAll(long customerId) {
        try {
            final Collection<Profile> profiles = this.profileUseCase.findAllByCustomerId(customerId);
            return HttpHandle.success(profileDtoMapper.toDto(profiles));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(long customerId, long profileId) {
        try {
            final Profile profile = this.profileUseCase.findByCustomerIdAndProfileId(customerId, profileId);
            return HttpHandle.success(profileDtoMapper.toDto(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(long customerId, long profileId) {
        try {
            final Profile profile = this.profileUseCase.delete(customerId, profileId);
            return HttpHandle.success(profileDtoMapper.toDto(profile));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
