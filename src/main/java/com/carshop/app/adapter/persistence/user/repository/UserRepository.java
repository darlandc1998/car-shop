package com.carshop.app.adapter.persistence.user.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carshop.app.adapter.persistence.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Collection<UserEntity> findAllByCustomerId(final long customerId);

    Optional<UserEntity> findByCustomerIdAndId(final long customerId, final long id);

    @Query("SELECT e FROM UserEntity e WHERE e.username = (:username)")
    Optional<UserEntity> findByUserName(@Param("username") final String username);

    Boolean existsByUsername(final String username);

    Boolean existsByEmail(final String email);

}
