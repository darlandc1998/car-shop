package com.carshop.app.adapter.api.fuel.controller;

import com.carshop.app.adapter.api.fuel.adapter.FuelPublicEndpointAdapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/fuels")
public class FuelPublicController {

    private final FuelPublicEndpointAdapter fuelPublicEndpointAdapter;

    public FuelPublicController(final FuelPublicEndpointAdapter fuelPublicEndpointAdapter){
        this.fuelPublicEndpointAdapter = fuelPublicEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.fuelPublicEndpointAdapter.listAllUniversal();
    }

}
