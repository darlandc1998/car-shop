package com.carshop.app.application.service.category;

import com.carshop.app.application.port.persistence.category.CategoryRepositoryPort;
import com.carshop.app.application.usecase.category.CategoryUseCase;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryService implements CategoryUseCase {

    private final CategoryRepositoryPort categoryRepositoryPort;

    public CategoryService(final CategoryRepositoryPort categoryRepositoryPort){
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public Collection<Category> findUniversal() throws CarShopRuleException {
        return this.categoryRepositoryPort.findUniversal();
    }
}
