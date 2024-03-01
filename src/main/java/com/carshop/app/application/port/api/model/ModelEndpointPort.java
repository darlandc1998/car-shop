package com.carshop.app.application.port.api.model;

import com.carshop.app.adapter.api.model.dto.ModelRegisterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface ModelEndpointPort {
    HttpResponse save(final ModelRegisterDTO registerDTO);
}
