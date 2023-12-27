package com.carshop.app.modules.login.services;

import com.carshop.app.modules.login.models.Authenticator;

public interface AuthenticatorService {

    Authenticator login(final Authenticator authenticator);

}
