package com.carshop.app.application.service.authentication;

import com.carshop.app.application.usecase.authentication.AuthenticationUseCase;
import com.carshop.app.application.usecase.user.UserUseCase;
import com.carshop.app.domain.Authenticator;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.authentication.configurations.SecurityConfig;
import com.carshop.app.infrastructure.authentication.models.JWTObject;
import com.carshop.app.infrastructure.authentication.services.JWTCreator;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@Service
public class AuthenticationService implements AuthenticationUseCase {

    private final UserUseCase userUseCase;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(final UserUseCase userUseCase, final PasswordEncoder passwordEncoder) {
        this.userUseCase = userUseCase;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authenticator login(Authenticator authenticator) {
        final Optional<User> user = this.userUseCase.findByUserName(authenticator.getUser().getUsername());
        if (user.isPresent()) {
            final boolean passwordMatches = passwordEncoder.matches(authenticator.getUser().getPassword(), user.get().getPassword());
            if (!passwordMatches) {
                throw new CarShopRuleException(CarShopRuleException.INVALID_CREDENTIALS);
            }
            final JWTObject jwtObject = new JWTObject();
            jwtObject.setUserId(user.get().getId());
            jwtObject.setCustomerId(user.get().getCustomer().getId());
            jwtObject.setSubject(user.get().getUsername());
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration(new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION));
            jwtObject.setRoles(Arrays.asList("ROOT"));
            final String token = JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject);
            return new Authenticator(user.get(), token);
        } else {
            throw new CarShopRuleException(CarShopRuleException.INVALID_CREDENTIALS);
        }
    }

}
