package com.carshop.app.application.service.brand;

import com.carshop.app.application.port.persistence.brand.BrandPublicRepositoryPort;
import com.carshop.app.application.usecase.brand.BrandPublicUseCase;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BrandPublicService implements BrandPublicUseCase {

    private final BrandPublicRepositoryPort brandPublicRepositoryPort;

    public BrandPublicService(final BrandPublicRepositoryPort brandPublicRepositoryPort) {
        this.brandPublicRepositoryPort = brandPublicRepositoryPort;
    }

    @Override
    public Collection<Brand> findUniversal() throws CarShopRuleException {
        return this.brandPublicRepositoryPort.findUniversal();
    }
}
