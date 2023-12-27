package com.carshop.app.modules.models.services;

import java.util.List;

import com.carshop.app.modules.models.entities.Model;

public interface ModelService {

    Model save(Model model) throws Exception;

    List<Model> findAllByCustomerId(final int customerId) throws Exception;

    Model findByCustomerIdAndModelId(final int customerId, final int modelId) throws Exception;

    Model delete(Model model) throws Exception;

}
