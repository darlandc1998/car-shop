package com.carshop.app.adapter.api.category;

import com.carshop.app.adapter.api.category.dto.CategoryDTO;
import com.carshop.app.adapter.api.category.mapper.CategoryDtoMapper;
import com.carshop.app.application.port.api.category.CategoryPublicEndpointPort;
import com.carshop.app.application.usecase.category.CategoryPublicUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.Collection;

@Adapter
public class CategoryPublicEndpointAdapter implements CategoryPublicEndpointPort {

    private final CategoryPublicUseCase categoryPublicUseCase;
    private final CategoryDtoMapper categoryDtoMapper;

    public CategoryPublicEndpointAdapter(final CategoryPublicUseCase categoryPublicUseCase, final CategoryDtoMapper categoryDtoMapper){
        this.categoryPublicUseCase = categoryPublicUseCase;
        this.categoryDtoMapper = categoryDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<CategoryDTO> categories = this.categoryPublicUseCase.findUniversal().stream().map(this.categoryDtoMapper::toDto).toList();
            return HttpHandle.success(categories);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
