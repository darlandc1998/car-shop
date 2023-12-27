package com.carshop.app.modules.brands.services;

import java.util.List;

import com.carshop.app.modules.brands.entities.Brand;

public interface BrandService {

    Brand save(Brand brand) throws Exception;

    List<Brand> findAllByCustomerId(final int customerId) throws Exception;

    Brand findByCustomerIdAndColorId(final int customerId, final int brandId) throws Exception;

    Brand delete(Brand brand) throws Exception;

}
