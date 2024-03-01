package com.carshop.app.application.usecase.vehicle;

import com.carshop.app.domain.Vehicle;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface VehicleUseCase {

    Vehicle persist(final Vehicle vehicle) throws CarShopRuleException;

}
