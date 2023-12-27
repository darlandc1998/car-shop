package com.carshop.app.modules.login.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.carshop.app.authentication.configurations.SecurityConfig;
import com.carshop.app.authentication.models.JWTObject;
import com.carshop.app.authentication.services.JWTCreator;
import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.login.models.Authenticator;
import com.carshop.app.modules.login.services.AuthenticatorService;
import com.carshop.app.modules.users.entities.User;
import com.carshop.app.modules.users.repositories.IUserRepository;

@Service
public class AuthenticatorServiceImpl implements AuthenticatorService {

    private IUserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public AuthenticatorServiceImpl(final IUserRepository userRepository, final PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authenticator login(final Authenticator authenticator) {
        final Optional<User> user = this.userRepository.findByUserName(authenticator.getUsername());
        if (user.isPresent()) {
            final boolean passwordMatches = passwordEncoder.matches(authenticator.getPassword(), user.get().getPassword());
            if (!passwordMatches) {
                throw new CarShopRuleException("");
            }
            final JWTObject jwtObject = new JWTObject();
            jwtObject.setUserId(user.get().getId());
            jwtObject.setCustomerId(user.get().getCustomerId());
            jwtObject.setSubject(user.get().getUsername());
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration(new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION));
            jwtObject.setRoles(new ArrayList<String>());
            final String token = JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject);
            return new Authenticator(user.get().getUsername(), null, token);
        } else {
            throw new CarShopRuleException("");
        }
    }

}
