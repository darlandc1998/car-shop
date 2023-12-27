package com.carshop.app.modules.vehicles.services;

import java.util.List;

import com.carshop.app.modules.vehicles.entities.Vehicle;

public interface VehicleService {

    Vehicle save(final Vehicle vehicle) throws Exception;

    List<Vehicle> findAllByCustomerId(final int customerId) throws Exception;

    Vehicle findByCustomerIdAndVehicleId(final int customerId, final String vehicleId) throws Exception;

    Vehicle delete(final Vehicle vehicle) throws Exception;

}
