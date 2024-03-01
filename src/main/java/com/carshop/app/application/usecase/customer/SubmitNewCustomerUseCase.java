package com.carshop.app.application.usecase.customer;

import com.carshop.app.domain.Customer;
import com.carshop.app.domain.User;

public interface SubmitNewCustomerUseCase {

    Customer createCustomerFromScratch(final Customer customer, final User rootUser);

}
