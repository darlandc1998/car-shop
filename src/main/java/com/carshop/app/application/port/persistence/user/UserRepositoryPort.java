package com.carshop.app.application.port.persistence.user;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.carshop.app.domain.User;

public interface UserRepositoryPort {

    User save(final User user);

    User delete(final User user);

    Collection<User> findAllByCustomerId(final long customerId);

    Optional<User> findByCustomerIdAndId(final long customerId, final long id);

    Optional<User> findByUserName(@Param("username") final String username);

    Boolean existsByUsername(final String username);

    Boolean existsByEmail(final String email);

}
