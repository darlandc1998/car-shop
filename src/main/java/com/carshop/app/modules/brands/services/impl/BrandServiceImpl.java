package com.carshop.app.modules.brands.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.brands.entities.Brand;
import com.carshop.app.modules.brands.repositories.IBrandRepository;
import com.carshop.app.modules.brands.services.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

    private final IBrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(final IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand save(Brand brand) throws Exception {
        return this.brandRepository.save(brand);
    }

    @Override
    public List<Brand> findAllByCustomerId(final int customerId) throws Exception {
        return this.brandRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Brand findByCustomerIdAndColorId(final int customerId, final int brandId) throws Exception {
        final Optional<Brand> brand = this.brandRepository.findByCustomerIdAndId(customerId, brandId);
        if (!brand.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.BRAND_NOT_FOUND);
        }
        return brand.get();
    }

    @Override
    public Brand delete(Brand brand) throws Exception {
        this.brandRepository.delete(brand);
        return brand;
    }

}
