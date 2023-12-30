package com.carshop.app.modules.users.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.users.entities.User;
import com.carshop.app.modules.users.repositories.IUserRepository;
import com.carshop.app.modules.users.services.UserService;
import com.carshop.app.utils.PasswordUtil;

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
    public User save(User user) throws Exception {
        final String username = user.getUsername();
        final String password = user.getPassword();
        final String passwordConfirm = user.getPasswordConfirm();
        if (!password.equals(passwordConfirm)) {
            throw new CarShopRuleException(CarShopRuleException.PASSWORDS_DONT_MATCH);
        }
        if (!PasswordUtil.isValidPassword(password)) {
            throw new CarShopRuleException(CarShopRuleException.PASSWORD_OUT_OF_RULES);
        }
        if (this.userRepository.existsByUsername(username)) {
            throw new CarShopRuleException(CarShopRuleException.USERNAME_ALREADY_USED);
        }
        if (this.userRepository.existsByEmail(user.getEmail())) {
            throw new CarShopRuleException(CarShopRuleException.EMAIL_ALREADY_USED);
        }
        user.setPassword(encoder.encode(password));
        return this.userRepository.save(user);
    }

}
