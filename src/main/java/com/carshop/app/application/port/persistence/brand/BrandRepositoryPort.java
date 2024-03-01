package com.carshop.app.application.port.persistence.brand;

import com.carshop.app.domain.Brand;

import java.util.Optional;

public interface BrandRepositoryPort {

    Brand save(final Brand brand);

    Optional<Brand> findByName(final String name);

    Optional<Brand> findById(final long brandId);


}
