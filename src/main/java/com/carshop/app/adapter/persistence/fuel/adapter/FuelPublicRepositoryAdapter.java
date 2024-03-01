package com.carshop.app.adapter.persistence.fuel;

import com.carshop.app.application.port.persistence.fuel.FuelPublicRepositoryPort;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Collection;

@Adapter
public class FuelPublicRepositoryAdapter implements FuelPublicRepositoryPort {

    private final FuelRepository fuelRepository;
    private final FuelJpaMapper fuelJpaMapper;

    public FuelPublicRepositoryAdapter(final FuelRepository fuelRepository, final FuelJpaMapper fuelJpaMapper){
        this.fuelRepository = fuelRepository;
        this.fuelJpaMapper = fuelJpaMapper;
    }

    @Override
    public Collection<Fuel> findUniversal() {
        return this.fuelRepository.findUniversal().stream().map(this.fuelJpaMapper::toJpaMapper).toList();
    }
}
