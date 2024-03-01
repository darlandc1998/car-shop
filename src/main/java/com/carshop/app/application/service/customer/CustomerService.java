package com.carshop.app.application.service.customer;

import com.carshop.app.application.port.persistence.customer.CustomerRepositoryPort;
import com.carshop.app.application.usecase.customer.CustomerUseCase;
import com.carshop.app.domain.Customer;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements CustomerUseCase {

    private final CustomerRepositoryPort customerRepositoryPort;

    public CustomerService(final CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Customer findById(long customerId) throws CarShopRuleException {
        final Optional<Customer> customer = this.customerRepositoryPort.findById(customerId);
        if (customer.isEmpty()) {
            throw new CarShopRuleException(CarShopRuleException.CUSTOMER_NOT_FOUND);
        }
        return customer.get();
    }
}
