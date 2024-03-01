package com.carshop.app.application.usecase.profile;

import com.carshop.app.domain.Profile;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface ProfileUseCase {

    Profile save(final Profile profile) throws CarShopRuleException;

    Collection<Profile> findAllByCustomerId(final long customerId) throws CarShopRuleException;

    Profile findByCustomerIdAndProfileId(final long customerId, final long profileId) throws CarShopRuleException;

    Profile delete(final long customerId, final long profileId) throws CarShopRuleException;

    Profile createRootProfile(final long customerId) throws CarShopRuleException;

}
