package com.carshop.app.modules.users.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.carshop.app.modules.users.entities.User;
import com.carshop.app.modules.users.repositories.IUserRepository;
import com.carshop.app.modules.users.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    private IUserRepository userRepository;
    private PasswordEncoder encoder;

    @Autowired
    public UserServiceImpl(final IUserRepository userRepository, final PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    @Override
    public User save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return this.userRepository.save(user);
    }

}
