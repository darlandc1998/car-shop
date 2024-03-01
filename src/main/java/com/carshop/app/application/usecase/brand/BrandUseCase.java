package com.carshop.app.application.usecase.brand;

import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface BrandUseCase {

    Brand save(final Brand brand) throws CarShopRuleException;

    Brand findById(final long brandId) throws CarShopRuleException;

}
