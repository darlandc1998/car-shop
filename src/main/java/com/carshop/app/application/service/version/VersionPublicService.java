package com.carshop.app.application.service.version;

import com.carshop.app.application.port.persistence.version.VersionPublicRepositoryPort;
import com.carshop.app.application.usecase.version.VersionPublicUseCase;
import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VersionPublicService implements VersionPublicUseCase {

    private final VersionPublicRepositoryPort versionPublicRepositoryPort;

    public VersionPublicService(final VersionPublicRepositoryPort versionPublicRepositoryPort) {
        this.versionPublicRepositoryPort = versionPublicRepositoryPort;
    }

    @Override
    public Collection<Version> findUniversal() throws CarShopRuleException {
        return this.versionPublicRepositoryPort.findUniversal();
    }
}
