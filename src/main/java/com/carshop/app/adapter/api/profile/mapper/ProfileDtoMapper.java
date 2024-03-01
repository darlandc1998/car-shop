package com.carshop.app.adapter.api.profile.mapper;

import com.carshop.app.adapter.api.profile.dto.ProfileDTO;
import com.carshop.app.adapter.api.profile.dto.ProfileRegisterDTO;
import com.carshop.app.adapter.api.profile.dto.ProfileUpdateDTO;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.Profile;
import com.carshop.app.domain.enums.ProfileTypeEnum;
import com.carshop.app.infrastructure.annotation.Mapper;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.stream.Collectors;

@Mapper
public class ProfileDtoMapper {

    ProfileDtoMapper() {

    }

    public ProfileDTO toDto(final Profile profile) {
        final ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setId(profile.getId());
        profileDTO.setName(profile.getName());
        return profileDTO;
    }

    public Collection<ProfileDTO> toDto(final Collection<Profile> profiles) {
        return profiles
                .stream()
                .map((profile) -> {
                    return toDto(profile);
                })
                .collect(Collectors.toList());
    }

    public Profile toDomainFromSaveBody(final Long customerId, final ProfileRegisterDTO registerDTO) {
        final Profile profile = new Profile();
        profile.setCustomer(new Customer(customerId));
        profile.setName(registerDTO.getName());
        profile.setType(ProfileTypeEnum.valueOf(registerDTO.getType()));
        return profile;
    }

    public Profile toDomainFromSaveBody(final Long customerId, final ProfileUpdateDTO updateDTO) {
        final Profile profile = new Profile();
        profile.setId(updateDTO.getId());
        profile.setCustomer(new Customer(customerId));
        profile.setName(updateDTO.getName());
        profile.setType(ProfileTypeEnum.valueOf(updateDTO.getType()));
        profile.setActive(true);
        profile.setDeleted(true);
        profile.setUpdatedAt(LocalDateTime.now());
        return profile;
    }

}
