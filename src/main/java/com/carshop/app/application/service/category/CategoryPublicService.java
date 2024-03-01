package com.carshop.app.application.service.category;

import com.carshop.app.application.port.persistence.category.CategoryPublicRepositoryPort;
import com.carshop.app.application.usecase.category.CategoryPublicUseCase;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryPublicService implements CategoryPublicUseCase {

    private final CategoryPublicRepositoryPort categoryPublicRepositoryPort;

    public CategoryPublicService(final CategoryPublicRepositoryPort categoryPublicRepositoryPort){
        this.categoryPublicRepositoryPort = categoryPublicRepositoryPort;
    }

    @Override
    public Collection<Category> findUniversal() throws CarShopRuleException {
        return this.categoryPublicRepositoryPort.findUniversal();
    }
}
