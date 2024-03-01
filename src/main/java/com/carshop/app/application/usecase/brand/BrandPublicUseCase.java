package com.carshop.app.application.usecase.brand;

import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface BrandPublicUseCase {

    Collection<Brand> findUniversal() throws CarShopRuleException;

}
