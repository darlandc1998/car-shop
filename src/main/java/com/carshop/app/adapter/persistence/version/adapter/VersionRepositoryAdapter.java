package com.carshop.app.adapter.persistence.version.adapter;

import com.carshop.app.adapter.persistence.version.entity.VersionEntity;
import com.carshop.app.adapter.persistence.version.mapper.VersionJpaMapper;
import com.carshop.app.adapter.persistence.version.repository.VersionRepository;
import com.carshop.app.application.port.persistence.version.VersionRepositoryPort;
import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class VersionRepositoryAdapter implements VersionRepositoryPort {

    private final VersionRepository versionRepository;
    private final VersionJpaMapper versionJpaMapper;

    public VersionRepositoryAdapter(final VersionRepository versionRepository, final VersionJpaMapper versionJpaMapper){
        this.versionRepository = versionRepository;
        this.versionJpaMapper = versionJpaMapper;
    }

    @Override
    public Optional<Version> findById(long versionId) {
        final Optional<VersionEntity> entity = this.versionRepository.findById(versionId);
        return entity.map(this.versionJpaMapper::toDomain);
    }
}
