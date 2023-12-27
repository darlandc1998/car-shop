package com.carshop.app.modules.vehicles.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
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
    public List<Vehicle> findAllByCustomerId(final int customerId) throws Exception {
        return this.vehicleRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Vehicle findByCustomerIdAndVehicleId(final int customerId, final String vehicleId) throws Exception {
        final Optional<Vehicle> vehicle = this.vehicleRepository.findByCustomerIdAndId(customerId, vehicleId);
        if (!vehicle.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.VEHICLE_NOT_FOUND);
        }
        return vehicle.get();
    }

    @Override
    public Vehicle delete(Vehicle vehicle) throws Exception {
        this.vehicleRepository.delete(vehicle);
        return vehicle;
    }

}
