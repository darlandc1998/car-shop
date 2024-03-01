package com.carshop.app.adapter.api.vehicle.controller;

import com.carshop.app.adapter.api.vehicle.adapter.VehicleEndpointAdapter;
import com.carshop.app.adapter.api.vehicle.dto.VehiclePersistenceDTO;
import com.carshop.app.infrastructure.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController extends AuthorizationDataFilter {

    private final VehicleEndpointAdapter vehicleEndpointAdapter;

    public VehicleController(final VehicleEndpointAdapter vehicleEndpointAdapter) {
        this.vehicleEndpointAdapter = vehicleEndpointAdapter;
    }

    @PostMapping("/v1/persistence")
    public HttpResponse persist(@RequestBody final VehiclePersistenceDTO persistenceDTO) {
        return this.vehicleEndpointAdapter.persistence(getCustomerId(), persistenceDTO);
    }

    @PutMapping("/v1/persistence/{id}")
    public HttpResponse persist(
            @PathVariable final String id,
            @RequestBody final VehiclePersistenceDTO persistenceDTO) {
        persistenceDTO.setId(id);
        return this.vehicleEndpointAdapter.persistence(getCustomerId(), persistenceDTO);
    }

}
