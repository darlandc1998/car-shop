package com.carshop.app.adapter.persistence.category.mapper;

import com.carshop.app.adapter.persistence.category.entity.CategoryEntity;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class CategoryJpaMapper {

    CategoryJpaMapper(){

    }

    public CategoryEntity toJpaEntity(final Category category){
        final CategoryEntity entity = new CategoryEntity();
        entity.setId(category.getId());
        entity.setName(category.getName());
        entity.setDescription(category.getDescription());
        entity.setActive(category.getActive());
        entity.setDeleted(category.getDeleted());
        entity.setCreatedAt(category.getCreatedAt());
        entity.setUpdatedAt(category.getUpdatedAt());
        return entity;
    }

    public Category toDomain(final CategoryEntity entity){
        final Category category = new Category();
        category.setId(entity.getId());
        category.setName(entity.getName());
        category.setDescription(entity.getDescription());
        category.setActive(entity.getActive());
        category.setDeleted(entity.getDeleted());
        category.setCreatedAt(entity.getCreatedAt());
        category.setUpdatedAt(entity.getUpdatedAt());
        return category;
    }

}
