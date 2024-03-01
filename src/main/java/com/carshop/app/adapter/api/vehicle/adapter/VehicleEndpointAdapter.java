package com.carshop.app.adapter.api.vehicle.adapter;

import com.carshop.app.adapter.api.vehicle.dto.VehiclePersistenceDTO;
import com.carshop.app.adapter.api.vehicle.mapper.VehiclePersistenceDtoMapper;
import com.carshop.app.application.port.api.vehicle.VehicleEndpointPort;
import com.carshop.app.application.usecase.vehicle.VehicleUseCase;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class VehicleEndpointAdapter implements VehicleEndpointPort {

    private final VehicleUseCase vehicleUseCase;
    private final VehiclePersistenceDtoMapper vehiclePersistenceDtoMapper;

    public VehicleEndpointAdapter(final VehicleUseCase vehicleUseCase, final VehiclePersistenceDtoMapper vehiclePersistenceDtoMapper) {
        this.vehicleUseCase = vehicleUseCase;
        this.vehiclePersistenceDtoMapper = vehiclePersistenceDtoMapper;
    }

    @Override
    public HttpResponse persistence(final long customerId, final VehiclePersistenceDTO persistenceDTO) {
        try {
            persistenceDTO.setCustomerId(customerId);
            Vehicle vehicle = this.vehiclePersistenceDtoMapper.toDomain(persistenceDTO);
            vehicle = this.vehicleUseCase.persist(vehicle);
            return HttpHandle.success(this.vehiclePersistenceDtoMapper.toDto(vehicle));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
