package com.carshop.app.adapter.persistence.category.adapter;

import com.carshop.app.adapter.persistence.category.repository.CategoryRepository;
import com.carshop.app.adapter.persistence.category.mapper.CategoryJpaMapper;
import com.carshop.app.application.port.persistence.category.CategoryPublicRepositoryPort;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Collection;

@Adapter
public class CategoryPublicRepositoryAdapter implements CategoryPublicRepositoryPort {

    private final CategoryRepository categoryRepository;
    private final CategoryJpaMapper categoryJpaMapper;

    public CategoryPublicRepositoryAdapter(final CategoryRepository categoryRepository, final CategoryJpaMapper categoryJpaMapper){
        this.categoryRepository = categoryRepository;
        this.categoryJpaMapper = categoryJpaMapper;
    }

    @Override
    public Collection<Category> findUniversal() {
        return this.categoryRepository.findUniversal().stream().map(this.categoryJpaMapper::toDomain).toList();
    }
}
