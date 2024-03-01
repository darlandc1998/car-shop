package com.carshop.app.application.port.api.category;

import com.carshop.app.infrastructure.http.HttpResponse;

public interface CategoryPublicEndpointPort {
    HttpResponse listAllUniversal();
}
