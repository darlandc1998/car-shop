package com.carshop.app.application.usecase.fuel;

import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface FuelPublicUseCase {

    Collection<Fuel> findUniversal() throws CarShopRuleException;
}
