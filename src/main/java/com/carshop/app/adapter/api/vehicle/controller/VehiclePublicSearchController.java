package com.carshop.app.adapter.api.vehicle.controller;

import com.carshop.app.adapter.api.vehicle.adapter.VehiclePublicSearchEndpointAdapter;
import com.carshop.app.adapter.api.vehicle.dto.VehicleFilterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/vehicles")
public class VehiclePublicSearchController {

    private final VehiclePublicSearchEndpointAdapter vehicleEndpointAdapter;

    public VehiclePublicSearchController(final VehiclePublicSearchEndpointAdapter vehicleEndpointAdapter) {
        this.vehicleEndpointAdapter = vehicleEndpointAdapter;
    }

    @GetMapping("/v1/search")
    public HttpResponse listAll(
            @RequestParam(name = "page", defaultValue = "0") final int page,
            @RequestParam(name = "size", defaultValue = "100") final int size,
            @RequestParam(name = "q", required = false) final String search,
            @RequestParam(name = "sort", required = false) final String sort,
            @RequestParam(name = "brands", required = false) final String brands,
            @RequestParam(name = "models", required = false) final String models,
            @RequestParam(name = "versions", required = false) final String versions,
            @RequestParam(name = "categories", required = false) final String categories,
            @RequestParam(name = "colors", required = false) final String colors,
            @RequestParam(name = "engineTypes", required = false) final String engineTypes,
            @RequestParam(name = "equipments", required = false) final String equipments,
            @RequestParam(name = "fuels", required = false) final String fuels) {
        final VehicleFilterDTO filterDTO = new VehicleFilterDTO();
        filterDTO.setPage(page);
        filterDTO.setSize(size);
        filterDTO.setSearch(search);
        filterDTO.setSort(sort);
        filterDTO.setBrands(brands);
        filterDTO.setModels(models);
        filterDTO.setVersions(versions);
        filterDTO.setCategories(categories);
        filterDTO.setColors(colors);
        filterDTO.setEngineTypes(engineTypes);
        filterDTO.setEquipments(equipments);
        filterDTO.setFuels(fuels);
        return this.vehicleEndpointAdapter.listAll(filterDTO);
    }

}
