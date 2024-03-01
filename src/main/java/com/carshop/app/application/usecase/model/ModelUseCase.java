package com.carshop.app.application.usecase.model;

import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface ModelUseCase {

    Model save(Model model) throws CarShopRuleException;

    Model findById(final long modelId) throws CarShopRuleException;

}
