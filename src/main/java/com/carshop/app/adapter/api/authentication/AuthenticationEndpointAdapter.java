package com.carshop.app.adapter.api.authentication;

import com.carshop.app.adapter.api.authentication.dto.LoginDTO;
import com.carshop.app.application.port.api.authentication.AuthenticationEndpointPort;
import com.carshop.app.application.usecase.authentication.AuthenticationUseCase;
import com.carshop.app.domain.Authenticator;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class AuthenticationEndpointAdapter implements AuthenticationEndpointPort {

    private final AuthenticationUseCase authenticationUseCase;
    private final AuthenticationDtoMapper authenticationDtoMapper;

    public AuthenticationEndpointAdapter(final AuthenticationUseCase authenticationUseCase, final AuthenticationDtoMapper authenticationDtoMapper) {
        this.authenticationUseCase = authenticationUseCase;
        this.authenticationDtoMapper = authenticationDtoMapper;
    }

    @Override
    public HttpResponse login(LoginDTO loginDTO) {
        try {
            final Authenticator auth = this.authenticationUseCase.login(this.authenticationDtoMapper.toDomain(loginDTO));
            return HttpHandle.success(this.authenticationDtoMapper.toDto(auth));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
