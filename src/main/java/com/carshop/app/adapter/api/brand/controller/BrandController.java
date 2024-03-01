package com.carshop.app.adapter.api.brand.controller;

import com.carshop.app.adapter.api.brand.adapter.BrandEndpointAdapter;
import com.carshop.app.adapter.api.brand.dto.BrandRegisterDTO;
import com.carshop.app.infrastructure.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brands")
public class BrandController extends AuthorizationDataFilter {

    private final BrandEndpointAdapter brandEndpointAdapter;

    public BrandController(final BrandEndpointAdapter brandEndpointAdapter) {
        this.brandEndpointAdapter = brandEndpointAdapter;
    }

    @PostMapping("/v1")
    public HttpResponse save(
            @RequestBody BrandRegisterDTO brandRegisterDTO) {
        return this.brandEndpointAdapter.save(brandRegisterDTO);
    }

}
