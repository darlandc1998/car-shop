package com.carshop.app.modules.vehicles.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.carshop.app.modules.vehicles.entities.Vehicle;

public interface VehicleService {

    Vehicle save(final Vehicle vehicle) throws Exception;

    Page<Vehicle> findAllByCustomerId(final int customerId, final String search, final Pageable pageable) throws Exception;

    Vehicle findByCustomerIdAndVehicleId(final int customerId, final String vehicleId) throws Exception;

    Vehicle delete(final Vehicle vehicle) throws Exception;

}
