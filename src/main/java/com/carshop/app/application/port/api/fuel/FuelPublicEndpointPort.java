package com.carshop.app.application.port.api.fuel;

import com.carshop.app.infrastructure.http.HttpResponse;

public interface FuelPublicEndpointPort {

    HttpResponse listAllUniversal();

}
