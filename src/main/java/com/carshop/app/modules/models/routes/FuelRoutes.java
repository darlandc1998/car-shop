package com.carshop.app.modules.models.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.models.controllers.ModelController;
import com.carshop.app.modules.models.dtos.ModelRegisterDTO;
import com.carshop.app.modules.models.dtos.ModelUpdateDTO;

@RestController
@RequestMapping("/api/v1/models")
public class FuelRoutes extends AuthorizationDataFilter {

    private final ModelController modelController;

    @Autowired
    public FuelRoutes(final ModelController modelController) {
        this.modelController = modelController;
    }

    @GetMapping("/{modelId}")
    public HttpResponse findById(
            @PathVariable final Integer modelId) {
        return this.modelController.findById(getCustomerId(), modelId);
    }

    @GetMapping
    public HttpResponse listAll() {
        return this.modelController.listAll(getCustomerId());
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody ModelRegisterDTO fuelRegisterDTO) {
        return this.modelController.save(getCustomerId(), fuelRegisterDTO);
    }

    @PutMapping("/{modelId}")
    public HttpResponse update(
            @PathVariable final Integer modelId,
            @RequestBody ModelUpdateDTO fuelUpdateDTO) {
        fuelUpdateDTO.setId(modelId);
        return this.modelController.update(getCustomerId(), fuelUpdateDTO);
    }

    @DeleteMapping("/{modelId}")
    public HttpResponse delete(
            @PathVariable final Integer modelId) {
        return this.modelController.delete(getCustomerId(), modelId);
    }

}
