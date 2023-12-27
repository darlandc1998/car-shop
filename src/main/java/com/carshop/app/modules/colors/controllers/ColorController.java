package com.carshop.app.modules.colors.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.colors.dtos.ColorRegisterDTO;
import com.carshop.app.modules.colors.dtos.ColorUpdateDTO;

public interface ColorController {

    HttpResponse save(final int customerId, ColorRegisterDTO registerDTO);

    HttpResponse update(final int customerId, ColorUpdateDTO updateDTO);

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final Integer colorId);

    HttpResponse delete(final int customerId, final Integer colorId);

}
