package com.carshop.app.adapter.api.engineType;

import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/engine-types")
public class EngineTypePublicController {

    private final EngineTypePublicEndpointAdapter engineTypePublicEndpointAdapter;

    public EngineTypePublicController(final EngineTypePublicEndpointAdapter engineTypePublicEndpointAdapter){
        this.engineTypePublicEndpointAdapter = engineTypePublicEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.engineTypePublicEndpointAdapter.listAllUniversal();
    }

}
