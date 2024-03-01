package com.carshop.app.adapter.persistence.fuel.adapter;

import com.carshop.app.adapter.persistence.fuel.entity.FuelEntity;
import com.carshop.app.adapter.persistence.fuel.mapper.FuelJpaMapper;
import com.carshop.app.adapter.persistence.fuel.repository.FuelRepository;
import com.carshop.app.application.port.persistence.fuel.FuelRepositoryPort;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class FuelRepositoryAdapter implements FuelRepositoryPort {

    private final FuelRepository fuelRepository;
    private final FuelJpaMapper fuelJpaMapper;

    public FuelRepositoryAdapter(final FuelRepository fuelRepository, final FuelJpaMapper fuelJpaMapper) {
        this.fuelRepository = fuelRepository;
        this.fuelJpaMapper = fuelJpaMapper;
    }

    @Override
    public Optional<Fuel> findById(long fuelId) {
        final Optional<FuelEntity> entity = this.fuelRepository.findById(fuelId);
        return entity.map(this.fuelJpaMapper::toDomain);
    }
}
