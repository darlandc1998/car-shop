package com.carshop.app.application.usecase.customer;

import com.carshop.app.domain.Customer;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface CustomerUseCase {

    Customer findById(final long customerId) throws CarShopRuleException;

}
