package com.carshop.app.adapter.api.brand.adapter;

import com.carshop.app.adapter.api.brand.BrandPublicEndpointAdapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/brands")
public class BrandPublicController {

    private final BrandPublicEndpointAdapter brandPublicEndpointAdapter;

    public BrandPublicController(final BrandPublicEndpointAdapter brandPublicEndpointAdapter){
        this.brandPublicEndpointAdapter = brandPublicEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.brandPublicEndpointAdapter.listAllUniversal();
    }

}
