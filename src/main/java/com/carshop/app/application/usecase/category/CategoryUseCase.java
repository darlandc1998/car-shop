package com.carshop.app.application.usecase.category;

import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface CategoryUseCase {

    Category findById(final long categoryId) throws CarShopRuleException;

}
