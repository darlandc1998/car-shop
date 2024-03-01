package com.carshop.app.adapter.persistence.engineType;

import com.carshop.app.application.port.persistence.engineType.EngineTypePublicRepositoryPort;
import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Collection;

@Adapter
public class EngineTypePublicRepositoryAdapter implements EngineTypePublicRepositoryPort {

    private final EngineTypeRepository engineTypeRepository;
    private final EngineTypeJpaMapper engineTypeJpaMapper;

    public EngineTypePublicRepositoryAdapter(final EngineTypeRepository engineTypeRepository, final EngineTypeJpaMapper engineTypeJpaMapper){
        this.engineTypeRepository = engineTypeRepository;
        this.engineTypeJpaMapper = engineTypeJpaMapper;
    }

    @Override
    public Collection<EngineType> findUniversal() {
        return this.engineTypeRepository.findUniversal().stream().map(this.engineTypeJpaMapper::toDomain).toList();
    }
}
