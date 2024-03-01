package com.carshop.app.adapter.api.vehicle.controller;

import com.carshop.app.adapter.api.vehicle.adapter.VehiclePublicEndpointAdapter;
import com.carshop.app.adapter.api.vehicle.dto.VehicleFilterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/vehicles")
public class VehiclePublicController {

    private final VehiclePublicEndpointAdapter vehicleEndpointAdapter;

    public VehiclePublicController(final VehiclePublicEndpointAdapter vehicleEndpointAdapter) {
        this.vehicleEndpointAdapter = vehicleEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAll(
            @RequestParam(name = "page", defaultValue = "0") final int page,
            @RequestParam(name = "size", defaultValue = "100") final int size,
            @RequestParam(name = "search", required = false) final String search,
            @RequestParam(name = "brands", required = false) final String brands) {
        final VehicleFilterDTO filterDTO = new VehicleFilterDTO();
        filterDTO.setPage(page);
        filterDTO.setSize(size);
        filterDTO.setSearch(search);
        filterDTO.setBrands(brands);
        return this.vehicleEndpointAdapter.listAll(filterDTO);
    }

}
