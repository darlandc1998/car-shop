package com.carshop.app.adapter.api.vehicle.adapter;

import com.carshop.app.adapter.api.vehicle.dto.VehicleFilterDTO;
import com.carshop.app.application.port.api.vehicle.VehiclePublicEndpointPort;
import com.carshop.app.application.usecase.vehicle.VehiclePublicSearchUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Adapter
public class VehiclePublicEndpointAdapter implements VehiclePublicEndpointPort {

    private final VehiclePublicSearchUseCase vehicleSearchUseCase;

    public VehiclePublicEndpointAdapter(final VehiclePublicSearchUseCase vehicleSearchUseCase) {
        this.vehicleSearchUseCase = vehicleSearchUseCase;
    }

    @Override
    public HttpResponse listAll(VehicleFilterDTO filterDTO) {
        try {
            final Pageable paging = PageRequest.of(filterDTO.getPage(), filterDTO.getSize());
            //final Page<Vehicle> page = this.vehicleService.findAllByCustomerId(customerId, filterDTO.getSearch(), paging);
            //return HttpHandle.success(new VehiclePageDTO(vehicles, page.getNumber(), (int) page.getTotalElements(), page.getTotalPages()));
            return HttpHandle.success(200);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
