package com.carshop.app.adapter.api.vehicle.adapter;

import com.carshop.app.adapter.api.vehicle.dto.VehicleDTO;
import com.carshop.app.adapter.api.vehicle.dto.VehicleFilterDTO;
import com.carshop.app.adapter.api.vehicle.dto.VehiclePageDTO;
import com.carshop.app.adapter.api.vehicle.mapper.VehicleFilterDtoMapper;
import com.carshop.app.adapter.api.vehicle.mapper.VehicleSearchDtoMapper;
import com.carshop.app.application.port.api.vehicle.VehiclePublicSearchEndpointPort;
import com.carshop.app.application.usecase.vehicle.VehiclePublicSearchUseCase;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;
import org.springframework.data.domain.Page;

import java.util.List;

@Adapter
public class VehiclePublicSearchEndpointAdapter implements VehiclePublicSearchEndpointPort {

    private final VehiclePublicSearchUseCase vehicleSearchUseCase;
    private final VehicleFilterDtoMapper vehicleFilterDtoMapper;
    private final VehicleSearchDtoMapper vehicleSearchDtoMapper;

    public VehiclePublicSearchEndpointAdapter(
            final VehiclePublicSearchUseCase vehicleSearchUseCase,
            final VehicleFilterDtoMapper vehicleFilterDtoMapper,
            final VehicleSearchDtoMapper vehicleSearchDtoMapper) {
        this.vehicleSearchUseCase = vehicleSearchUseCase;
        this.vehicleFilterDtoMapper = vehicleFilterDtoMapper;
        this.vehicleSearchDtoMapper = vehicleSearchDtoMapper;
    }

    @Override
    public HttpResponse listAll(VehicleFilterDTO filterDTO) {
        try {
            final VehicleFilter filters = this.vehicleFilterDtoMapper.toDomain(filterDTO);
            final Page<Vehicle> page = this.vehicleSearchUseCase.search(filters);
            final List<VehicleDTO> vehicles = page.get().map(this.vehicleSearchDtoMapper::toDto).toList();
            return HttpHandle.success(new VehiclePageDTO(vehicles, page.getNumber(), (int) page.getTotalElements(), page.getTotalPages()));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
