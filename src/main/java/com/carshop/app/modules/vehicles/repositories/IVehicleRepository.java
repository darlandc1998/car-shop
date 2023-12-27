package com.carshop.app.modules.vehicles.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carshop.app.modules.vehicles.entities.Vehicle;

public interface IVehicleRepository extends MongoRepository<Vehicle, Integer> {

    List<Vehicle> findAllByCustomerId(final int customerId);

    Optional<Vehicle> findByCustomerIdAndId(final int customerId, final String id);

}
