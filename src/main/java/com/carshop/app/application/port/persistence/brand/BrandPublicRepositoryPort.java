package com.carshop.app.application.port.persistence.brand;

import com.carshop.app.domain.Brand;

import java.util.Collection;

public interface BrandPublicRepositoryPort {

    Collection<Brand> findUniversal();

}
