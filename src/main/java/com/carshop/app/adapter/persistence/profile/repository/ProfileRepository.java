package com.carshop.app.adapter.persistence.profile.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carshop.app.adapter.persistence.profile.entity.ProfileEntity;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    List<ProfileEntity> findAllByCustomerId(final long customerId);

    Optional<ProfileEntity> findByCustomerIdAndId(final long customerId, final long id);

}
