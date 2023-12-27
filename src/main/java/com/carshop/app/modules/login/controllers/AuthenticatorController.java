package com.carshop.app.modules.login.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.login.dtos.LoginDTO;

public interface AuthenticatorController {

    HttpResponse login(final LoginDTO loginDTO);

}
