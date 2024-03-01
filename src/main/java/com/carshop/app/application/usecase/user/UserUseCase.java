package com.carshop.app.application.usecase.user;

import java.util.Collection;
import java.util.Optional;

import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface UserUseCase {

    Collection<User> listAllByCustomerId(final long customerId) throws CarShopRuleException;

    User findById(final long customerId, final long userId) throws CarShopRuleException;

    User insert(final User user) throws CarShopRuleException;

    Optional<User> findByUserName(final String username) throws CarShopRuleException;

}
