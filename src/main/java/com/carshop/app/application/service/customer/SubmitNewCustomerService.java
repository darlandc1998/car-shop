package com.carshop.app.application.service.customer;

import com.carshop.app.application.port.persistence.customer.CustomerRepositoryPort;
import com.carshop.app.application.usecase.customer.SubmitNewCustomerUseCase;
import com.carshop.app.application.usecase.profile.ProfileUseCase;
import com.carshop.app.application.usecase.user.UserUseCase;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.Profile;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.validator.ObjectValidator;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SubmitNewCustomerService implements SubmitNewCustomerUseCase {

    private final CustomerRepositoryPort customerPort;
    private final UserUseCase userUseCase;
    private final ProfileUseCase profileUseCase;

    public SubmitNewCustomerService(final CustomerRepositoryPort customerPort, final UserUseCase userUseCase, final ProfileUseCase profileUseCase) {
        this.customerPort = customerPort;
        this.userUseCase = userUseCase;
        this.profileUseCase = profileUseCase;
    }

    @Override
    @Transactional
    public Customer createCustomerFromScratch(Customer customer, User rootUser) {
        customer.setCodName(customer.getName());
        ObjectValidator.validate(customer);
        customer = this.customerPort.save(customer);
        rootUser.setCustomer(customer);

        final Profile profile = this.profileUseCase.createRootProfile(customer.getId());
        rootUser.setProfile(profile);

        ObjectValidator.validate(rootUser);
        this.userUseCase.insert(rootUser);

        return customer;
    }

}
