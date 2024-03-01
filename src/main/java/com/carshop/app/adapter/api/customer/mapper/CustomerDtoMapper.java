package com.carshop.app.adapter.api.customer.mapper;

import com.carshop.app.adapter.api.customer.dto.CustomerDTO;
import com.carshop.app.adapter.api.customer.dto.CustomerRegisterDTO;
import com.carshop.app.domain.Customer;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class CustomerDtoMapper {

    public CustomerDtoMapper() {

    }

    public CustomerDTO toDto(final Customer customer) {
        final CustomerDTO dto = new CustomerDTO();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        return dto;
    }

    public Customer toDomainFromSaveBody(final CustomerRegisterDTO registerDTO) {
        final Customer customer = new Customer();
        customer.setName(registerDTO.getName());
        return customer;
    }

    public Customer toDomainFromSaveBody(final Long id, final CustomerRegisterDTO registerDTO) {
        final Customer customer = new Customer();
        customer.setId(id);
        customer.setName(registerDTO.getName());
        return customer;
    }

}
