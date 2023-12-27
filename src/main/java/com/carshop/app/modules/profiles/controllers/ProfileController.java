package com.carshop.app.modules.profiles.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.profiles.dtos.ProfileRegisterDTO;
import com.carshop.app.modules.profiles.dtos.ProfileUpdateDTO;

public interface ProfileController {

    HttpResponse save(final int customerId, ProfileRegisterDTO registerDTO);

    HttpResponse update(final int customerId, ProfileUpdateDTO updateDTO);

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final Integer profileId);

    HttpResponse delete(final int customerId, final Integer profileId);

}
