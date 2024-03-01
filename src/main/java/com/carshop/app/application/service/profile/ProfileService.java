package com.carshop.app.application.service.profile;

import com.carshop.app.application.port.persistence.profile.ProfileRepositoryPort;
import com.carshop.app.application.usecase.profile.ProfileUseCase;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.Profile;
import com.carshop.app.domain.enums.ProfileTypeEnum;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProfileService implements ProfileUseCase {

    private final ProfileRepositoryPort profileRepositoryPort;

    public ProfileService(final ProfileRepositoryPort profileRepositoryPort) {
        this.profileRepositoryPort = profileRepositoryPort;
    }

    @Override
    public Profile save(Profile profile) throws CarShopRuleException {
        return this.profileRepositoryPort.save(profile);
    }

    @Override
    public Collection<Profile> findAllByCustomerId(long customerId) throws CarShopRuleException {
        return this.profileRepositoryPort.findAllByCustomerId(customerId);
    }

    @Override
    public Profile findByCustomerIdAndProfileId(long customerId, long profileId) throws CarShopRuleException {
        final Optional<Profile> profile = this.profileRepositoryPort.findByCustomerIdAndId(customerId, profileId);
        if (!profile.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.PROFILE_NOT_FOUND);
        }
        return profile.get();
    }

    @Override
    public Profile delete(final long customerId, final long profileId) throws CarShopRuleException {
        final Profile profileToDelete = this.findByCustomerIdAndProfileId(customerId, profileId);
        this.profileRepositoryPort.delete(profileToDelete);
        return profileToDelete;
    }

    @Override
    public Profile createRootProfile(long customerId) throws CarShopRuleException {
        final Profile profile = new Profile();
        profile.setCustomer(new Customer(customerId));
        profile.setName(ProfileTypeEnum.ROOT.getName());
        profile.setType(ProfileTypeEnum.ROOT);
        return this.save(profile);
    }

}
