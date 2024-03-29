package com.carshop.app.application.port.api.vehicle;

import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.adapter.api.vehicle.dto.VehicleFilterDTO;

public interface VehiclePublicSearchEndpointPort {

    HttpResponse listAll(final VehicleFilterDTO filterDTO);

}
