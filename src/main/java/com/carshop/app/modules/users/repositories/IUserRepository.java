package com.carshop.app.modules.users.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carshop.app.modules.users.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByCustomerId(final Integer customerId);

    Optional<User> findByCustomerIdAndId(final Integer customerId, final Integer id);

    @Query("SELECT e FROM User e WHERE e.username = (:username)")
    Optional<User> findByUserName(@Param("username") final String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
