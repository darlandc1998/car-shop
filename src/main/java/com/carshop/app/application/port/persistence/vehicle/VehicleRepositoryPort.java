package com.carshop.app.application.port.persistence.vehicle;

import com.carshop.app.domain.Vehicle;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Optional;

public interface VehicleRepositoryPort {

    Optional<Vehicle> findByCustomerIdAndId(final long customerId, final String vehicleId) throws CarShopRuleException;

    Vehicle persist(final Vehicle vehicle) throws CarShopRuleException;

}
