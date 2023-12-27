package com.carshop.app.modules.models.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.models.dtos.ModelRegisterDTO;
import com.carshop.app.modules.models.dtos.ModelUpdateDTO;

public interface ModelController {

    HttpResponse save(final int customerId, final ModelRegisterDTO registerDTO);

    HttpResponse update(final int customerId, final ModelUpdateDTO updateDTO);

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final Integer fuelId);

    HttpResponse delete(final int customerId, final Integer fuelId);

}
