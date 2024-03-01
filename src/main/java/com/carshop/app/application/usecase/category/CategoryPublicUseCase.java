package com.carshop.app.application.usecase.category;

import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface CategoryPublicUseCase {

    Collection<Category> findUniversal() throws CarShopRuleException;

}
