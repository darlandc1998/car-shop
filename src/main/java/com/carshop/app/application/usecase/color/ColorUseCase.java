package com.carshop.app.application.usecase.color;

import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface ColorUseCase {

    Color findById(final long colorId) throws CarShopRuleException;

}
