package com.carshop.app.application.port.persistence.customer;

import com.carshop.app.domain.Customer;

import java.util.Optional;

public interface CustomerRepositoryPort {

    Customer save(Customer customer);

    Optional<Customer> findById(final long customerId);

}
