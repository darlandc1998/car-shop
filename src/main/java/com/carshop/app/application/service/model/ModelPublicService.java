package com.carshop.app.application.service.model;

import com.carshop.app.application.port.persistence.model.ModelPublicRepositoryPort;
import com.carshop.app.application.usecase.model.ModelPublicUseCase;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ModelPublicService implements ModelPublicUseCase {

    private final ModelPublicRepositoryPort modelPublicRepositoryPort;

    public ModelPublicService(final ModelPublicRepositoryPort modelPublicRepositoryPort) {
        this.modelPublicRepositoryPort = modelPublicRepositoryPort;
    }

    @Override
    public Collection<Model> findUniversal() throws CarShopRuleException {
        return this.modelPublicRepositoryPort.findUniversal();
    }
}
