package com.carshop.app.application.usecase.authentication;

import com.carshop.app.domain.Authenticator;

public interface AuthenticationUseCase {

    Authenticator login(final Authenticator authenticator);

}
