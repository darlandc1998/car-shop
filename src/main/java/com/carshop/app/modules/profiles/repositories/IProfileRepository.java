package com.carshop.app.modules.profiles.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carshop.app.modules.profiles.entities.Profile;

@Repository
public interface IProfileRepository extends JpaRepository<Profile, Integer> {

    List<Profile> findAllByCustomerId(final Integer customerId);

    Optional<Profile> findByCustomerIdAndId(final Integer customerId, final Integer id);

}
