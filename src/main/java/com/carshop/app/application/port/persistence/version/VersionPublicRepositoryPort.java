package com.carshop.app.application.port.persistence.version;

import com.carshop.app.domain.Version;

import java.util.Collection;

public interface VersionPublicRepositoryPort {
    Collection<Version> findUniversal();

}
