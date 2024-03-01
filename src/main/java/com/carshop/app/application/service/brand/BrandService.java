package com.carshop.app.application.service.brand;

import com.carshop.app.application.port.persistence.brand.BrandRepositoryPort;
import com.carshop.app.application.usecase.brand.BrandUseCase;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import com.carshop.app.infrastructure.validator.ObjectValidator;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService implements BrandUseCase {

    private final BrandRepositoryPort brandRepositoryPort;

    public BrandService(final BrandRepositoryPort brandRepositoryPort) {
        this.brandRepositoryPort = brandRepositoryPort;
    }

    @Override
    public Brand save(Brand brand) throws CarShopRuleException {
        ObjectValidator.validate(brand);
        boolean alreadyExists = this.brandRepositoryPort.findByName(brand.getName()).isPresent();
        if (alreadyExists) {
            throw new CarShopRuleException(CarShopRuleException.BRAND_ALREADY_REGISTERED);
        }
        return this.brandRepositoryPort.save(brand);
    }

    @Override
    public Brand findById(long brandId) throws CarShopRuleException {
        final Optional<Brand> brand = this.brandRepositoryPort.findById(brandId);
        if (!brand.isPresent()){
            throw new CarShopRuleException(CarShopRuleException.BRAND_NOT_FOUND);
        }
        return brand.get();
    }


}
