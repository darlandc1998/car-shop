package com.carshop.app.application.service.model;

import com.carshop.app.application.port.persistence.model.ModelRepositoryPort;
import com.carshop.app.application.usecase.model.ModelUseCase;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ModelService implements ModelUseCase {

    private final ModelRepositoryPort modelRepositoryPort;

    public ModelService(final ModelRepositoryPort modelRepositoryPort) {
        this.modelRepositoryPort = modelRepositoryPort;
    }

    @Override
    public Model save(Model model) throws CarShopRuleException {
        return this.modelRepositoryPort.save(model);
    }

    @Override
    public Model findById(long modelId) throws CarShopRuleException {
        final Optional<Model> model = this.modelRepositoryPort.findById(modelId);
        if (!model.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.MODEL_NOT_FOUND);
        }
        return model.get();
    }

}
