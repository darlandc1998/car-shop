package com.carshop.app.modules.brands.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carshop.app.modules.brands.entities.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand, Integer> {

    List<Brand> findAllByCustomerId(final int customerId);

    Optional<Brand> findByCustomerIdAndId(final int customerId, final int id);

}
