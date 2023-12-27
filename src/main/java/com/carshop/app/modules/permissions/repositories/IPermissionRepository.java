package com.carshop.app.modules.permissions.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carshop.app.modules.permissions.entities.Permission;

@Repository
public interface IPermissionRepository extends JpaRepository<Permission, Integer> {

    List<Permission> findAllByCustomerId(final Integer customerId);

    Optional<Permission> findByCustomerIdAndId(final Integer customerId, final Integer id);

}
