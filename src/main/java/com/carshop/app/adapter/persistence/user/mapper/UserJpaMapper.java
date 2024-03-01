package com.carshop.app.adapter.persistence.user.mapper;

import com.carshop.app.adapter.persistence.customer.entity.CustomerEntity;
import com.carshop.app.adapter.persistence.profile.entity.ProfileEntity;
import com.carshop.app.adapter.persistence.user.entity.UserEntity;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.Profile;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class UserJpaMapper {

    UserJpaMapper() {

    }

    public UserEntity toJpaEntity(final User user) {
        final UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setCustomer(new CustomerEntity(user.getCustomer().getId()));
        entity.setProfile(new ProfileEntity(user.getProfile().getId()));
        entity.setName(user.getName());
        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        entity.setEmail(user.getEmail());
        entity.setActive(user.getActive());
        entity.setDeleted(user.getDeleted());
        entity.setCreatedAt(user.getCreatedAt());
        entity.setUpdatedAt(user.getUpdatedAt());
        return entity;
    }

    public User toDomain(final UserEntity entity) {
        final User user = new User();
        user.setId(entity.getId());
        user.setCustomer(new Customer(entity.getCustomer().getId()));
        user.setProfile(new Profile(entity.getProfile().getId()));
        user.setName(entity.getName());
        user.setUsername(entity.getUsername());
        user.setPassword(entity.getPassword());
        user.setEmail(entity.getEmail());
        user.setActive(entity.getActive());
        user.setDeleted(entity.getDeleted());
        user.setCreatedAt(entity.getCreatedAt());
        user.setUpdatedAt(entity.getUpdatedAt());
        return user;
    }

}
