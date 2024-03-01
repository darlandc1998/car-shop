package com.carshop.app.adapter.persistence.category.adapter;

import com.carshop.app.adapter.persistence.category.entity.CategoryEntity;
import com.carshop.app.adapter.persistence.category.mapper.CategoryJpaMapper;
import com.carshop.app.adapter.persistence.category.repository.CategoryRepository;
import com.carshop.app.application.port.persistence.category.CategoryRepositoryPort;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class CategoryRepositoryAdapter implements CategoryRepositoryPort {

    private final CategoryRepository categoryRepository;
    private final CategoryJpaMapper categoryJpaMapper;

    public CategoryRepositoryAdapter(final CategoryRepository categoryRepository, final CategoryJpaMapper categoryJpaMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryJpaMapper = categoryJpaMapper;
    }

    @Override
    public Optional<Category> findById(long categoryId) {
        final Optional<CategoryEntity> entity = this.categoryRepository.findById(categoryId);
        return entity.map(this.categoryJpaMapper::toDomain);
    }
}
