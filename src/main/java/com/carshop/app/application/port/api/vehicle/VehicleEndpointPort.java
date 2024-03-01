package com.carshop.app.application.port.api.vehicle;

import com.carshop.app.adapter.api.vehicle.dto.VehiclePersistenceDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface VehicleEndpointPort {

    HttpResponse persistence(final long customerId, final VehiclePersistenceDTO persistenceDTO);

}
