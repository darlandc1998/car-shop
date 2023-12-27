package com.carshop.app.modules.models.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carshop.app.modules.models.entities.Model;

public interface IModelRepository extends JpaRepository<Model, Integer> {

    List<Model> findAllByCustomerId(final int customerId);

    Optional<Model> findByCustomerIdAndId(final int customerId, final int id);

}
