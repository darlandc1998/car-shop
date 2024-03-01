package com.carshop.app.adapter.api.vehicle.dto;

import com.carshop.app.application.port.api.vehicle.VehicleEndpointPort;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class VehicleEndpointAdapter implements VehicleEndpointPort {
    @Override
    public HttpResponse persistence() {
        try {

            return HttpHandle.success(null);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
