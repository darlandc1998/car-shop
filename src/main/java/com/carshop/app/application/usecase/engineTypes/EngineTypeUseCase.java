package com.carshop.app.application.usecase.engineTypes;

import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface EngineTypeUseCase {

    EngineType findById(final long engineTypeId) throws CarShopRuleException;

}
