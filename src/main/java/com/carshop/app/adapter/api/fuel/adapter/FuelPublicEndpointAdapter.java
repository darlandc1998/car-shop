package com.carshop.app.adapter.api.fuel.adapter;

import com.carshop.app.adapter.api.fuel.dto.FuelDTO;
import com.carshop.app.adapter.api.fuel.mapper.FuelDtoMapper;
import com.carshop.app.application.port.api.fuel.FuelPublicEndpointPort;
import com.carshop.app.application.usecase.fuel.FuelPublicUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.Collection;

@Adapter
public class FuelPublicEndpointAdapter implements FuelPublicEndpointPort {

    private final FuelPublicUseCase fuelPublicUseCase;
    private final FuelDtoMapper fuelDtoMapper;

    public FuelPublicEndpointAdapter(final FuelPublicUseCase fuelPublicUseCase, final FuelDtoMapper fuelDtoMapper){
        this.fuelPublicUseCase = fuelPublicUseCase;
        this.fuelDtoMapper = fuelDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<FuelDTO> fuels = this.fuelPublicUseCase.findUniversal().stream().map(this.fuelDtoMapper::toDto).toList();
            return HttpHandle.success(fuels);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
