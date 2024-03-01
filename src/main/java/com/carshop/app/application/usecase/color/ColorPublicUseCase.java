package com.carshop.app.application.usecase.color;

import com.carshop.app.domain.Brand;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface ColorUseCase {

    Collection<Color> findUniversal() throws CarShopRuleException;

}
