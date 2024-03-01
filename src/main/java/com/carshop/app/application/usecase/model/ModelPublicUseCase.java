package com.carshop.app.application.usecase.model;

import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface ModelPublicUseCase {

    Collection<Model> findUniversal() throws CarShopRuleException;

}
