package com.carshop.app.modules.users.controllers.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.profiles.entities.Profile;
import com.carshop.app.modules.users.controllers.UserController;
import com.carshop.app.modules.users.dtos.UserDTO;
import com.carshop.app.modules.users.dtos.UserRegisterDTO;
import com.carshop.app.modules.users.entities.User;
import com.carshop.app.modules.users.services.UserService;

@Service
public class UserControllerImpl implements UserController {

    private UserService userService;

    @Autowired
    public UserControllerImpl(final UserService userService) {
        this.userService = userService;
    }

    @Override
    public HttpResponse listAll(int customerId) {
        try {
            final List<User> users = this.userService.listAll(customerId);
            return HttpHandle.success(users.stream().map(user -> mountUserDTOOf(user)).collect(Collectors.toList()));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(int customerId, int userId) {
        try {
            final User user = this.userService.findById(customerId, userId);
            return HttpHandle.success(mountUserDTOOf(user));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse save(int customerId, UserRegisterDTO registerDTO) {
        try {
            final User userCreated = this.userService.save(mountUserOf(customerId, registerDTO));
            return HttpHandle.created(mountUserDTOOf(userCreated));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private User mountUserOf(final int customerId, final UserRegisterDTO registerDTO) {
        final User user = new User();
        user.setProfile(new Profile(registerDTO.getProfileId()));
        user.setCustomerId(customerId);
        user.setName(registerDTO.getName());
        user.setUsername(registerDTO.getUsername());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        user.setPasswordConfirm(registerDTO.getPasswordConfirm());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        user.setDeleted(0);
        return user;
    }

    private UserDTO mountUserDTOOf(final User user) {
        final UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setProfileId(user.getProfile().getId());
        userDTO.setProfileName(user.getProfile().getName());
        return userDTO;
    }

}
