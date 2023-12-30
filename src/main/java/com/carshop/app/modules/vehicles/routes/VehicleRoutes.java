package com.carshop.app.modules.vehicles.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.vehicles.controllers.VehicleController;
import com.carshop.app.modules.vehicles.dtos.VehicleFilterDTO;
import com.carshop.app.modules.vehicles.dtos.VehicleRegisterDTO;
import com.carshop.app.modules.vehicles.dtos.VehicleUpdateDTO;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleRoutes extends AuthorizationDataFilter {

    private final VehicleController vehicleController;

    @Autowired
    private VehicleRoutes(final VehicleController vehicleController) {
        this.vehicleController = vehicleController;
    }

    @GetMapping
    public HttpResponse listAll(
            @RequestParam(name = "page", defaultValue = "0") final Integer page,
            @RequestParam(name = "size", defaultValue = "100") final Integer size,
            @RequestParam(name = "search", required = false) final String search,
            @RequestParam(name = "brand", required = false) final Integer brandId,
            @RequestParam(name = "color", required = false) final Integer colorId,
            @RequestParam(name = "model", required = false) final Integer modelId) {
        final VehicleFilterDTO filterDTO = new VehicleFilterDTO();
        filterDTO.setPage(page);
        filterDTO.setSize(size);
        filterDTO.setSearch(search);
        filterDTO.setBrandId(brandId);
        filterDTO.setColorId(colorId);
        filterDTO.setModelId(modelId);
        return this.vehicleController.listAll(getCustomerId(), filterDTO);
    }

    @GetMapping("/{vehicleId}")
    public HttpResponse findById(
            @PathVariable final String vehicleId) {
        return this.vehicleController.findById(getCustomerId(), vehicleId);
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody final VehicleRegisterDTO registerDTO) {
        return this.vehicleController.save(getCustomerId(), registerDTO);
    }

    @PutMapping("/{vehicleId}")
    public HttpResponse update(
            @PathVariable final String vehicleId,
            @RequestBody final VehicleUpdateDTO updateDTO) {
        updateDTO.setId(vehicleId);
        return this.vehicleController.update(getCustomerId(), updateDTO);
    }

    @DeleteMapping("/{vehicleId}")
    public HttpResponse delete(
            @PathVariable final String vehicleId) {
        return this.vehicleController.delete(getCustomerId(), vehicleId);
    }

}
