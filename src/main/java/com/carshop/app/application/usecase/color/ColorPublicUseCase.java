package com.carshop.app.application.usecase.color;

import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface ColorPublicUseCase {

    Collection<Color> findUniversal() throws CarShopRuleException;

}
