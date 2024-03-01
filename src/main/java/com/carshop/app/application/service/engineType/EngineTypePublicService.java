package com.carshop.app.application.service.engineType;

import com.carshop.app.application.port.persistence.engineType.EngineTypeRepositoryPort;
import com.carshop.app.application.usecase.engineTypes.EngineTypeUseCase;
import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EngineTypeService implements EngineTypeUseCase {

    private final EngineTypeRepositoryPort engineTypeRepositoryPort;

    public EngineTypeService(final EngineTypeRepositoryPort engineTypeRepositoryPort){
        this.engineTypeRepositoryPort = engineTypeRepositoryPort;
    }

    @Override
    public Collection<EngineType> findUniversal() throws CarShopRuleException {
        return this.engineTypeRepositoryPort.findUniversal();
    }
}
