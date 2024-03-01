package com.carshop.app.application.port.persistence.fuel;

import com.carshop.app.domain.Fuel;

import java.util.Collection;

public interface FuelPublicRepositoryPort {

    Collection<Fuel> findUniversal();

}
