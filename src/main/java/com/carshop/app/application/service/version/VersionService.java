package com.carshop.app.application.service.version;

import com.carshop.app.application.port.persistence.version.VersionRepositoryPort;
import com.carshop.app.application.usecase.version.VersionUseCase;
import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VersionService implements VersionUseCase {

    private final VersionRepositoryPort versionRepositoryPort;

    public VersionService(final VersionRepositoryPort versionRepositoryPort) {
        this.versionRepositoryPort = versionRepositoryPort;
    }

    @Override
    public Version findById(long versionId) throws CarShopRuleException {
        final Optional<Version> version = this.versionRepositoryPort.findById(versionId);
        if (version.isEmpty()) {
            throw new CarShopRuleException(CarShopRuleException.VERSION_NOT_FOUND);
        }
        return version.get();
    }
}
