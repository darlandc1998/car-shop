package com.carshop.app.adapter.persistence.version;

import com.carshop.app.application.port.persistence.version.VersionPublicRepositoryPort;
import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Collection;

@Adapter
public class VersionPublicRepositoryAdapter implements VersionPublicRepositoryPort {

    private final VersionRepository versionRepository;
    private final VersionJpaMapper versionJpaMapper;

    public VersionPublicRepositoryAdapter(final VersionRepository versionRepository, final VersionJpaMapper versionJpaMapper) {
        this.versionRepository = versionRepository;
        this.versionJpaMapper = versionJpaMapper;
    }

    @Override
    public Collection<Version> findUniversal() {
        return this.versionRepository.findUniversal().stream().map(this.versionJpaMapper::toDomain).toList();
    }
}
