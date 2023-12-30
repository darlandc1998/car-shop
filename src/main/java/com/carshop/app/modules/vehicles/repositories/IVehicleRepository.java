package com.carshop.app.modules.vehicles.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.carshop.app.modules.vehicles.entities.Vehicle;

public interface IVehicleRepository {

    Vehicle save(final Vehicle vehicle);

    Vehicle findByCustomerIdAndId(final int customerId, final String id);

    Page<Vehicle> findAllByCustomerId(final int customerId, final String search, final Pageable pageable);

    Vehicle delete(Vehicle vehicle);

}
