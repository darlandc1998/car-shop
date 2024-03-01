package com.carshop.app.adapter.api.model.controller;

import com.carshop.app.adapter.api.model.adapter.ModelEndpointAdapter;
import com.carshop.app.adapter.api.model.dto.ModelRegisterDTO;
import com.carshop.app.infrastructure.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/models")
public class ModelController extends AuthorizationDataFilter {

    private final ModelEndpointAdapter modelEndpointAdapter;

    public ModelController(final ModelEndpointAdapter modelEndpointAdapter) {
        this.modelEndpointAdapter = modelEndpointAdapter;
    }

    @PostMapping("/v1")
    public HttpResponse save(
            @RequestBody ModelRegisterDTO modelRegisterDTO) {
        return this.modelEndpointAdapter.save(modelRegisterDTO);
    }

}
