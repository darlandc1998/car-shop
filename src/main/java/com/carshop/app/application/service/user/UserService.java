package com.carshop.app.application.service.user;

import com.carshop.app.application.port.persistence.user.UserRepositoryPort;
import com.carshop.app.application.usecase.user.UserUseCase;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import com.carshop.app.infrastructure.utils.PasswordUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService implements UserUseCase {

    private final UserRepositoryPort userRepositoryPort;
    private final PasswordEncoder encoder;

    public UserService(final UserRepositoryPort userRepositoryPort, final PasswordEncoder encoder) {
        this.userRepositoryPort = userRepositoryPort;
        this.encoder = encoder;
    }

    @Override
    public Collection<User> listAllByCustomerId(long customerId) throws CarShopRuleException {
        return this.userRepositoryPort.findAllByCustomerId(customerId);
    }

    @Override
    public User findById(long customerId, long userId) throws CarShopRuleException {
        final Optional<User> user = this.userRepositoryPort.findByCustomerIdAndId(customerId, userId);
        if (!user.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.USER_NOT_FOUND);
        }
        return user.get();
    }

    @Override
    public User insert(User user) throws CarShopRuleException {
        final String username = user.getUsername();
        final String password = user.getPassword();
        final String passwordConfirm = user.getPasswordConfirm();
        if (!password.equals(passwordConfirm)) {
            throw new CarShopRuleException(CarShopRuleException.PASSWORDS_DONT_MATCH);
        }
        if (!PasswordUtil.isValidPassword(password)) {
            throw new CarShopRuleException(CarShopRuleException.PASSWORD_OUT_OF_RULES);
        }
        if (this.userRepositoryPort.existsByUsername(username)) {
            throw new CarShopRuleException(CarShopRuleException.USERNAME_ALREADY_USED);
        }
        if (Objects.nonNull(user.getEmail()) && this.userRepositoryPort.existsByEmail(user.getEmail())) {
            throw new CarShopRuleException(CarShopRuleException.EMAIL_ALREADY_USED);
        }
        user.setPassword(encoder.encode(password));
        return this.userRepositoryPort.save(user);
    }

    @Override
    public Optional<User> findByUserName(String username) throws CarShopRuleException {
        return this.userRepositoryPort.findByUserName(username);
    }

}
