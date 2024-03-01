package com.carshop.app.adapter.api.customer.adapter;

import com.carshop.app.adapter.api.customer.dto.CustomerRegisterDTO;
import com.carshop.app.adapter.api.customer.mapper.CustomerDtoMapper;
import com.carshop.app.adapter.api.user.mapper.UserDtoMapper;
import com.carshop.app.application.port.api.customer.CustomerPublicEndpointPort;
import com.carshop.app.application.usecase.customer.SubmitNewCustomerUseCase;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class CustomerPublicEndpointAdapter implements CustomerPublicEndpointPort {

    private final SubmitNewCustomerUseCase submitNewCustomerUseCase;
    private final CustomerDtoMapper customerDtoMapper;
    private final UserDtoMapper userDtoMapper;

    public CustomerPublicEndpointAdapter(final SubmitNewCustomerUseCase submitNewCustomerUseCase, final CustomerDtoMapper customerDtoMapper, final UserDtoMapper userDtoMapper) {
        this.submitNewCustomerUseCase = submitNewCustomerUseCase;
        this.customerDtoMapper = customerDtoMapper;
        this.userDtoMapper = userDtoMapper;
    }

    @Override
    public HttpResponse createCustomerFromScratch(final CustomerRegisterDTO registerDTO) {
        try {
            Customer customer = customerDtoMapper.toDomainFromSaveBody(registerDTO);
            final User rootUser = userDtoMapper.toDomain(registerDTO.getUser());
            customer = submitNewCustomerUseCase.createCustomerFromScratch(customer, rootUser);
            return HttpHandle.created(customerDtoMapper.toDto(customer));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
