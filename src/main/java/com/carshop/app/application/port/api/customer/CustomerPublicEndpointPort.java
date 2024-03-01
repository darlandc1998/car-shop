package com.carshop.app.application.port.api.customer;

import com.carshop.app.adapter.api.customer.dto.CustomerRegisterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

public interface CustomerPublicEndpointPort {

    HttpResponse createCustomerFromScratch(final CustomerRegisterDTO registerDTO);

}
