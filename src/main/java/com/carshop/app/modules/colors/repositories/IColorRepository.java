package com.carshop.app.modules.colors.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carshop.app.modules.colors.entities.Color;

@Repository
public interface IColorRepository extends JpaRepository<Color, Integer> {

    List<Color> findAllByCustomerId(final int customerId);

    Optional<Color> findByCustomerIdAndId(final int customerId, final int id);

}
