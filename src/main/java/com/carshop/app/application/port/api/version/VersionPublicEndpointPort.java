package com.carshop.app.application.port.api.version;

import com.carshop.app.infrastructure.http.HttpResponse;

public interface VersionPublicEndpointPort {

    HttpResponse listAllUniversal();

}
