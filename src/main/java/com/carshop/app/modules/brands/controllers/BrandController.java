package com.carshop.app.modules.brands.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.brands.dtos.BrandRegisterDTO;
import com.carshop.app.modules.brands.dtos.BrandUpdateDTO;

public interface BrandController {

    HttpResponse save(final int customerId, final BrandRegisterDTO registerDTO);

    HttpResponse update(final int customerId, final BrandUpdateDTO updateDTO);

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final int brandId);

    HttpResponse delete(final int customerId, final int brandId);

}
