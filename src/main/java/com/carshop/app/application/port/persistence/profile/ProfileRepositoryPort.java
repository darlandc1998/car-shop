package com.carshop.app.application.port.persistence.profile;

import java.util.Collection;
import java.util.Optional;

import com.carshop.app.domain.Profile;

public interface ProfileRepositoryPort {

    Profile save(final Profile profile);

    Profile delete(final Profile profile);

    Collection<Profile> findAllByCustomerId(final long customerId);

    Optional<Profile> findByCustomerIdAndId(final long customerId, final long id);

}
