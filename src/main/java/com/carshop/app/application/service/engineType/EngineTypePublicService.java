package com.carshop.app.application.service.engineType;

import com.carshop.app.application.port.persistence.engineType.EngineTypePublicRepositoryPort;
import com.carshop.app.application.usecase.engineTypes.EngineTypePublicUseCase;
import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EngineTypePublicService implements EngineTypePublicUseCase {

    private final EngineTypePublicRepositoryPort engineTypePublicRepositoryPort;

    public EngineTypePublicService(final EngineTypePublicRepositoryPort engineTypePublicRepositoryPort){
        this.engineTypePublicRepositoryPort = engineTypePublicRepositoryPort;
    }

    @Override
    public Collection<EngineType> findUniversal() throws CarShopRuleException {
        return this.engineTypePublicRepositoryPort.findUniversal();
    }
}
