package com.carshop.app.adapter.api.brand.adapter;

import com.carshop.app.adapter.api.brand.mapper.BrandDtoMapper;
import com.carshop.app.adapter.api.brand.dto.BrandRegisterDTO;
import com.carshop.app.application.port.api.brand.BrandEndpointPort;
import com.carshop.app.application.usecase.brand.BrandUseCase;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class BrandEndpointAdapter implements BrandEndpointPort {

    private final BrandUseCase brandUseCase;
    private final BrandDtoMapper brandDtoMapper;

    public BrandEndpointAdapter(final BrandUseCase brandUseCase, final BrandDtoMapper brandDtoMapper) {
        this.brandUseCase = brandUseCase;
        this.brandDtoMapper = brandDtoMapper;
    }

    @Override
    public HttpResponse save(BrandRegisterDTO registerDTO) {
        try {
            Brand brand = brandDtoMapper.toDomain(registerDTO);
            brand = this.brandUseCase.save(brand);
            return HttpHandle.created(brandDtoMapper.toDto(brand));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
