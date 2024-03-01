package com.carshop.app.application.port.api.profile;

import com.carshop.app.adapter.api.profile.dto.ProfileRegisterDTO;
import com.carshop.app.adapter.api.profile.dto.ProfileUpdateDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface ProfileEndpointPort {

    HttpResponse save(final long customerId, ProfileRegisterDTO registerDTO);

    HttpResponse update(final long customerId, ProfileUpdateDTO updateDTO);

    HttpResponse listAll(final long customerId);

    HttpResponse findById(final long customerId, final long profileId);

    HttpResponse delete(final long customerId, final long profileId);

}
