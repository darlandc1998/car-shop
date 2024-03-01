package com.carshop.app.application.port.persistence.version;

import com.carshop.app.domain.Version;

import java.util.Optional;

public interface VersionRepositoryPort {
    Optional<Version> findById(final long versionId);
}
