package com.carshop.app.application.port.api.user;

import com.carshop.app.adapter.api.user.dto.UserRegisterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface UserEndpointPort {

    HttpResponse listAll(final long customerId);

    HttpResponse findById(final long customerId, final long userId);

    HttpResponse save(final long customerId, final UserRegisterDTO registerDTO);

}
