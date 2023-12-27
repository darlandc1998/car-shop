package com.carshop.app.modules.profiles.services;

import java.util.List;

import com.carshop.app.modules.profiles.entities.Profile;

public interface ProfileService {

    Profile save(final Profile profile) throws Exception;

    List<Profile> findAllByCustomerId(final int customerId) throws Exception;

    Profile findByCustomerIdAndProfileId(final int customerId, final int profileId) throws Exception;

    Profile delete(final Profile profile) throws Exception;

}
