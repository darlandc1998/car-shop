package com.carshop.app.adapter.api.model.controller;

import com.carshop.app.adapter.api.model.adapter.ModelPublicEndpointAdapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/models")
public class ModelPublicController {

    private final ModelPublicEndpointAdapter modelPublicEndpointAdapter;

    public ModelPublicController(final ModelPublicEndpointAdapter modelPublicEndpointAdapter) {
        this.modelPublicEndpointAdapter = modelPublicEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.modelPublicEndpointAdapter.listAllUniversal();
    }

}
