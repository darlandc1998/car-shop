package com.carshop.app.application.port.api.equipment;

import com.carshop.app.infrastructure.http.HttpResponse;

public interface EquipmentPublicEndpointPort {

    HttpResponse listAllUniversal();

}
