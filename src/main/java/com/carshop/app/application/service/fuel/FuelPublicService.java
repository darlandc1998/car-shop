package com.carshop.app.application.service.fuel;

import com.carshop.app.application.port.persistence.fuel.FuelPublicRepositoryPort;
import com.carshop.app.application.usecase.fuel.FuelPublicUseCase;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FuelPublicService implements FuelPublicUseCase {

    private final FuelPublicRepositoryPort fuelPublicRepositoryPort;

    public FuelPublicService(final FuelPublicRepositoryPort fuelPublicRepositoryPort){
        this.fuelPublicRepositoryPort = fuelPublicRepositoryPort;
    }

    @Override
    public Collection<Fuel> findUniversal() throws CarShopRuleException {
        return this.fuelPublicRepositoryPort.findUniversal();
    }
}
