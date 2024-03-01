package com.carshop.app.adapter.api.color;

import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/colors")
public class ColorPublicController {

    private final ColorPublicEndpointAdapter colorEndpointAdapter;

    public ColorPublicController(final ColorPublicEndpointAdapter colorEndpointAdapter){
        this.colorEndpointAdapter = colorEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.colorEndpointAdapter.listAllUniversal();
    }
}
