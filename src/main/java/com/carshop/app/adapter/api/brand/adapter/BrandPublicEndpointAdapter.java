package com.carshop.app.adapter.api.brand.adapter;

import com.carshop.app.adapter.api.brand.mapper.BrandDtoMapper;
import com.carshop.app.application.port.api.brand.BrandPublicEndpointPort;
import com.carshop.app.application.usecase.brand.BrandPublicUseCase;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.Collection;

@Adapter
public class BrandPublicEndpointAdapter implements BrandPublicEndpointPort {
    private final BrandPublicUseCase brandPublicUseCase;
    private final BrandDtoMapper brandDtoMapper;

    public BrandPublicEndpointAdapter(final BrandPublicUseCase brandPublicUseCase, final BrandDtoMapper brandDtoMapper) {
        this.brandPublicUseCase = brandPublicUseCase;
        this.brandDtoMapper = brandDtoMapper;
    }
    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<Brand> brands = this.brandPublicUseCase.findUniversal();
            return HttpHandle.success(brandDtoMapper.toDto(brands));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
