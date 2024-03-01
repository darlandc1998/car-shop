package com.carshop.app.adapter.api.authentication;

import com.carshop.app.adapter.api.authentication.dto.LoginDTO;
import com.carshop.app.adapter.api.authentication.dto.SessionDTO;
import com.carshop.app.domain.Authenticator;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class AuthenticationDtoMapper {

    AuthenticationDtoMapper() {

    }

    Authenticator toDomain(final LoginDTO loginDTO) {
        final Authenticator auth = new Authenticator();
        final User user = new User();
        user.setUsername(loginDTO.getUsername());
        user.setPassword(loginDTO.getPassword());
        auth.setUser(user);
        return auth;
    }

    SessionDTO toDto(final Authenticator auth) {
        final SessionDTO session = new SessionDTO();
        session.setId(auth.getUser().getId());
        session.setName(auth.getUser().getName());
        session.setUsername(auth.getUser().getUsername());
        session.setToken(auth.getToken());
        return session;
    }

}
