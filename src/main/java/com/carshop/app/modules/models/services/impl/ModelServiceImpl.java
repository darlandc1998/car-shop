package com.carshop.app.modules.models.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.models.entities.Model;
import com.carshop.app.modules.models.repositories.IModelRepository;
import com.carshop.app.modules.models.services.ModelService;

@Service
public class ModelServiceImpl implements ModelService {

    private IModelRepository modelRepository;

    @Autowired
    public ModelServiceImpl(final IModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public Model save(Model model) throws Exception {
        return this.modelRepository.save(model);
    }

    @Override
    public List<Model> findAllByCustomerId(final int customerId) throws Exception {
        return this.modelRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Model findByCustomerIdAndModelId(final int customerId, final int modelId) throws Exception {
        final Optional<Model> fuel = this.modelRepository.findByCustomerIdAndId(customerId, modelId);
        if (!fuel.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.MODEL_NOT_FOUND);
        }
        return fuel.get();
    }

    @Override
    public Model delete(Model model) throws Exception {
        this.modelRepository.delete(model);
        return model;
    }

}
