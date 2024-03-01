package com.carshop.app.application.usecase.engineTypes;

import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface EngineTypePublicUseCase {

    Collection<EngineType> findUniversal() throws CarShopRuleException;

}
