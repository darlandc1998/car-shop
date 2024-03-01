package com.carshop.app.adapter.persistence.engineType.adapter;

import com.carshop.app.adapter.persistence.engineType.entity.EngineTypeEntity;
import com.carshop.app.adapter.persistence.engineType.mapper.EngineTypeJpaMapper;
import com.carshop.app.adapter.persistence.engineType.repository.EngineTypeRepository;
import com.carshop.app.application.port.persistence.engineType.EngineTypeRepositoryPort;
import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class EngineTypeRepositoryAdapter implements EngineTypeRepositoryPort {

    private final EngineTypeRepository engineTypeRepository;
    private final EngineTypeJpaMapper engineTypeJpaMapper;

    public EngineTypeRepositoryAdapter(final EngineTypeRepository engineTypeRepository, final EngineTypeJpaMapper engineTypeJpaMapper) {
        this.engineTypeRepository = engineTypeRepository;
        this.engineTypeJpaMapper = engineTypeJpaMapper;
    }

    @Override
    public Optional<EngineType> findById(long engineTypeId) {
        final Optional<EngineTypeEntity> entity = this.engineTypeRepository.findById(engineTypeId);
        return entity.map(this.engineTypeJpaMapper::toDomain);
    }
}
