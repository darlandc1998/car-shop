package com.carshop.app.application.service.fuel;

import com.carshop.app.application.port.persistence.fuel.FuelRepositoryPort;
import com.carshop.app.application.usecase.fuel.FuelUseCase;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuelService implements FuelUseCase {

    private final FuelRepositoryPort fuelRepositoryPort;

    public FuelService(final FuelRepositoryPort fuelRepositoryPort) {
        this.fuelRepositoryPort = fuelRepositoryPort;
    }

    @Override
    public Fuel findById(long fuelId) throws CarShopRuleException {
        final Optional<Fuel> fuel = this.fuelRepositoryPort.findById(fuelId);
        if (fuel.isEmpty()) {
            throw new CarShopRuleException(CarShopRuleException.FUEL_NOT_FOUND);
        }
        return fuel.get();
    }
}
