package com.carshop.app.modules.profiles.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.profiles.entities.Profile;
import com.carshop.app.modules.profiles.repositories.IProfileRepository;
import com.carshop.app.modules.profiles.services.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final IProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(final IProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile save(Profile profile) throws Exception {
        return this.profileRepository.save(profile);
    }

    @Override
    public List<Profile> findAllByCustomerId(int customerId) throws Exception {
        return this.profileRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Profile findByCustomerIdAndProfileId(int customerId, int profileId) throws Exception {
        final Optional<Profile> profile = this.profileRepository.findByCustomerIdAndId(customerId, profileId);
        if (!profile.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.PROFILE_NOT_FOUND);
        }
        return profile.get();
    }

    @Override
    public Profile delete(Profile profile) throws Exception {
        this.profileRepository.delete(profile);
        return profile;
    }

}
