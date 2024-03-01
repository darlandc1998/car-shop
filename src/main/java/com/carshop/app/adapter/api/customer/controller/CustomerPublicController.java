package com.carshop.app.adapter.api.customer.controller;


import com.carshop.app.adapter.api.customer.adapter.CustomerPublicEndpointAdapter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.adapter.api.customer.dto.CustomerRegisterDTO;
import com.carshop.app.infrastructure.http.HttpResponse;

@RestController
@RequestMapping("/api/public/customers")
public class CustomerPublicController {

    private final CustomerPublicEndpointAdapter customerEndpointAdapter;

    @Autowired
    public CustomerPublicController(final CustomerPublicEndpointAdapter customerEndpointAdapter) {
        this.customerEndpointAdapter = customerEndpointAdapter;
    }

    @PostMapping("/v1")
    public HttpResponse insert(@RequestBody @Valid final CustomerRegisterDTO registerDTO) {
        return this.customerEndpointAdapter.createCustomerFromScratch(registerDTO);
    }

}
