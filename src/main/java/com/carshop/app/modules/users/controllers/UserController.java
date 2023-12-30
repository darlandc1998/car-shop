package com.carshop.app.modules.users.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.users.dtos.UserRegisterDTO;

public interface UserController {

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final int userId);

    HttpResponse save(final int customerId, final UserRegisterDTO registerDTO);

}
