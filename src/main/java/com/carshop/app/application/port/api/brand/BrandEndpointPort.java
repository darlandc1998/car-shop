package com.carshop.app.application.port.api.brand;

import com.carshop.app.adapter.api.brand.dto.BrandRegisterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface BrandEndpointPort {

    HttpResponse save(final BrandRegisterDTO registerDTO);

}
