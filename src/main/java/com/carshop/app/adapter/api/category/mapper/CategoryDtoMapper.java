package com.carshop.app.adapter.api.category.mapper;

import com.carshop.app.adapter.api.category.dto.CategoryDTO;
import com.carshop.app.domain.Category;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class CategoryDtoMapper {

    CategoryDtoMapper(){

    }

    public CategoryDTO toDto(final Category category){
        final CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setDescription(category.getDescription());
        return categoryDTO;
    }

}
