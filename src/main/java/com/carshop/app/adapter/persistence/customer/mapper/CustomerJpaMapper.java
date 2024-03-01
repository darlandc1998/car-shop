package com.carshop.app.adapter.persistence.customer.mapper;

import com.carshop.app.adapter.persistence.customer.entity.CustomerEntity;
import com.carshop.app.domain.Customer;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class CustomerJpaMapper {

    public CustomerJpaMapper() {

    }

    public CustomerEntity toJpaEntity(final Customer customer) {
        final CustomerEntity entity = new CustomerEntity();
        entity.setId(customer.getId());
        entity.setName(customer.getName());
        entity.setCodName(customer.getCodName());
        entity.setCover(customer.getCover());
        entity.setDescription(customer.getDescription());
        entity.setActive(customer.getActive());
        entity.setDeleted(customer.getDeleted());
        entity.setCreatedAt(customer.getCreatedAt());
        entity.setUpdatedAt(customer.getUpdatedAt());
        return entity;
    }

    public Customer toDomain(final CustomerEntity entity) {
        final Customer customer = new Customer();
        customer.setId(entity.getId());
        customer.setName(entity.getName());
        customer.setCodName(entity.getCodName());
        customer.setCover(entity.getCover());
        customer.setDescription(entity.getDescription());
        customer.setActive(entity.getActive());
        customer.setDeleted(entity.getDeleted());
        customer.setCreatedAt(entity.getCreatedAt());
        customer.setUpdatedAt(entity.getUpdatedAt());
        return customer;
    }

}
