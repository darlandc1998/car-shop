package com.carshop.app.adapter.api.category;

import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/categories")
public class CategoryPublicController {

    private final CategoryPublicEndpointAdapter categoryPublicEndpointAdapter;

    public CategoryPublicController(final CategoryPublicEndpointAdapter categoryPublicEndpointAdapter){
        this.categoryPublicEndpointAdapter = categoryPublicEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.categoryPublicEndpointAdapter.listAllUniversal();
    }

}
