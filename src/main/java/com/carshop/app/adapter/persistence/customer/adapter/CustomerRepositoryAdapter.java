package com.carshop.app.adapter.persistence.customer.adapter;

import com.carshop.app.adapter.persistence.customer.entity.CustomerEntity;
import com.carshop.app.adapter.persistence.customer.mapper.CustomerJpaMapper;
import com.carshop.app.adapter.persistence.customer.repository.CustomerRepository;
import com.carshop.app.application.port.persistence.customer.CustomerRepositoryPort;
import com.carshop.app.domain.Customer;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {

    private final CustomerRepository customerRepository;
    private final CustomerJpaMapper customerJpaMapper;

    public CustomerRepositoryAdapter(final CustomerRepository customerRepository, final CustomerJpaMapper customerJpaMapper) {
        this.customerRepository = customerRepository;
        this.customerJpaMapper = customerJpaMapper;
    }

    @Override
    public Customer save(Customer customer) {
        CustomerEntity customerEntity = customerJpaMapper.toJpaEntity(customer);
        customerEntity = customerRepository.save(customerEntity);
        return customerJpaMapper.toDomain(customerEntity);
    }

    @Override
    public Optional<Customer> findById(long customerId) {
        final Optional<CustomerEntity> entity = this.customerRepository.findById(customerId);
        return entity.map(this.customerJpaMapper::toDomain);
    }

}
