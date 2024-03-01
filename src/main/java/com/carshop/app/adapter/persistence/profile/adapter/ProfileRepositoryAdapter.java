package com.carshop.app.adapter.persistence.profile.adapter;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import com.carshop.app.adapter.persistence.profile.entity.ProfileEntity;
import com.carshop.app.adapter.persistence.profile.mapper.ProfileJpaMapper;
import com.carshop.app.adapter.persistence.profile.repository.ProfileRepository;
import com.carshop.app.application.port.persistence.profile.ProfileRepositoryPort;
import com.carshop.app.domain.Profile;
import com.carshop.app.infrastructure.annotation.Adapter;

@Adapter
public class ProfileRepositoryAdapter implements ProfileRepositoryPort {

    private final ProfileRepository profileRepository;
    private final ProfileJpaMapper profileJpaMapper;

    public ProfileRepositoryAdapter(final ProfileRepository profileRepository, final ProfileJpaMapper profileJpaMapper) {
        this.profileRepository = profileRepository;
        this.profileJpaMapper = profileJpaMapper;
    }

    @Override
    public Profile save(Profile profile) {
        ProfileEntity entity = profileJpaMapper.toJpaEntity(profile);
        entity = this.profileRepository.save(entity);
        return profileJpaMapper.toDomain(entity);
    }

    @Override
    public Profile delete(Profile profile) {
        ProfileEntity entity = profileJpaMapper.toJpaEntity(profile);
        this.profileRepository.delete(entity);
        return profile;
    }

    @Override
    public Collection<Profile> findAllByCustomerId(long customerId) {
        return this.profileRepository
                .findAllByCustomerId(customerId)
                .stream()
                .map((entity) -> {
                    return profileJpaMapper.toDomain(entity);
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Profile> findByCustomerIdAndId(long customerId, long id) {
        final Optional<ProfileEntity> entity = this.profileRepository.findByCustomerIdAndId(customerId, id);
        return entity.isPresent() ? Optional.of(profileJpaMapper.toDomain(entity.get())) : Optional.empty();
    }

}
