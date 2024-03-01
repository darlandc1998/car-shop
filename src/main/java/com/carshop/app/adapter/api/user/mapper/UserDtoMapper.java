package com.carshop.app.adapter.api.user.mapper;

import com.carshop.app.adapter.api.user.dto.UserDTO;
import com.carshop.app.adapter.api.user.dto.UserRegisterDTO;
import com.carshop.app.adapter.api.user.dto.UserRootRegisterDTO;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.annotation.Mapper;

import java.util.Collection;
import java.util.stream.Collectors;

@Mapper
public class UserDtoMapper {

    UserDtoMapper() {

    }

    public UserDTO toDto(final User user) {
        final UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setProfileId(user.getProfile().getId());
        dto.setProfileName(user.getProfile().getName());
        return dto;
    }

    public Collection<UserDTO> toDto(final Collection<User> users) {
        return users
                .stream()
                .map((user) -> {
                    return toDto(user);
                })
                .collect(Collectors.toList());
    }

    public User toDomainFromSaveBody(final long customerId, final UserRegisterDTO registerDTO) {
        final User user = new User();
        user.setCustomerId(customerId);
        user.setProfileId(registerDTO.getProfileId());
        user.setName(registerDTO.getName());
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        user.setPasswordConfirm(registerDTO.getPasswordConfirm());
        return user;
    }

    public User toDomain(final UserRootRegisterDTO userRootRegisterDTO){
        final User user = new User();
        user.setName(userRootRegisterDTO.getName());
        user.setUsername(userRootRegisterDTO.getUsername());
        user.setPassword(userRootRegisterDTO.getPassword());
        user.setPasswordConfirm(userRootRegisterDTO.getPasswordConfirm());
        return user;
    }

}
