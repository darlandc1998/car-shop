package com.carshop.app.modules.vehicles.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.vehicles.dtos.VehicleRegisterDTO;
import com.carshop.app.modules.vehicles.dtos.VehicleUpdateDTO;

public interface VehicleController {

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final String vehicleId);

    HttpResponse save(final int customerId, final VehicleRegisterDTO registerDTO);

    HttpResponse update(final int customerId, final VehicleUpdateDTO updateDTO);

    HttpResponse delete(final int customerId, final String vehicleId);

}
