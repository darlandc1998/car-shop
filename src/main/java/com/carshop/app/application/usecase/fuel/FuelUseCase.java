package com.carshop.app.application.usecase.fuel;

import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface FuelUseCase {

    Fuel findById(final long fuelId) throws CarShopRuleException;

}
