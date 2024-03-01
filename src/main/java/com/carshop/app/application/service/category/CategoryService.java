package com.carshop.app.application.service.category;

import com.carshop.app.application.port.persistence.category.CategoryRepositoryPort;
import com.carshop.app.application.usecase.category.CategoryUseCase;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements CategoryUseCase {

    private final CategoryRepositoryPort categoryRepositoryPort;

    public CategoryService(final CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public Category findById(long categoryId) throws CarShopRuleException {
        final Optional<Category> category = this.categoryRepositoryPort.findById(categoryId);
        if (category.isEmpty()){
            throw new CarShopRuleException(CarShopRuleException.CATEGORY_NOT_FOUND);
        }
        return category.get();
    }
}
