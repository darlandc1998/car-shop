package com.carshop.app.application.port.persistence.fuel;

import com.carshop.app.domain.Fuel;

import java.util.Optional;

public interface FuelRepositoryPort {

    Optional<Fuel> findById(final long fuelId);

}
