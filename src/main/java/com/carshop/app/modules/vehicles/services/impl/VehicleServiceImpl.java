package com.carshop.app.modules.vehicles.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.carshop.app.modules.vehicles.entities.Vehicle;
import com.carshop.app.modules.vehicles.repositories.IVehicleRepository;
import com.carshop.app.modules.vehicles.services.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final IVehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(final IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle save(Vehicle vehicle) throws Exception {
        return this.vehicleRepository.save(vehicle);
    }

    @Override
    public Page<Vehicle> findAllByCustomerId(final int customerId, final String search, final Pageable pageable) throws Exception {
        return this.vehicleRepository.findAllByCustomerId(customerId, search, pageable);
    }

    @Override
    public Vehicle findByCustomerIdAndVehicleId(final int customerId, final String vehicleId) throws Exception {
        return this.vehicleRepository.findByCustomerIdAndId(customerId, vehicleId);
    }

    @Override
    public Vehicle delete(Vehicle vehicle) throws Exception {
        return this.vehicleRepository.delete(vehicle);
    }

}
