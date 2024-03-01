package com.carshop.app.adapter.persistence.profile.mapper;

import com.carshop.app.adapter.persistence.profile.entity.ProfileEntity;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.Profile;
import com.carshop.app.domain.enums.ProfileTypeEnum;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class ProfileJpaMapper {

    ProfileJpaMapper() {

    }

    public ProfileEntity toJpaEntity(final Profile profile) {
        final ProfileEntity entity = new ProfileEntity();
        entity.setId(profile.getId());
        entity.setCustomerId(profile.getCustomer().getId());
        entity.setName(profile.getName());
        entity.setType(profile.getType().toString());
        entity.setActive(profile.getActive());
        entity.setDeleted(profile.getDeleted());
        entity.setCreatedAt(profile.getCreatedAt());
        entity.setUpdatedAt(profile.getUpdatedAt());
        return entity;
    }

    public Profile toDomain(final ProfileEntity entity) {
        final Profile profile = new Profile();
        profile.setId(entity.getId());
        profile.setCustomer(new Customer(entity.getCustomerId()));
        profile.setName(entity.getName());
        profile.setType(ProfileTypeEnum.valueOf(entity.getType()));
        profile.setActive(entity.getActive());
        profile.setDeleted(entity.getDeleted());
        profile.setCreatedAt(entity.getCreatedAt());
        profile.setUpdatedAt(entity.getUpdatedAt());
        return profile;
    }

}
