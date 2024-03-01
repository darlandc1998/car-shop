package com.carshop.app.application.port.api.authentication;

import com.carshop.app.adapter.api.authentication.dto.LoginDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface AuthenticationEndpointPort {

    HttpResponse login(final LoginDTO loginDTO);

}
