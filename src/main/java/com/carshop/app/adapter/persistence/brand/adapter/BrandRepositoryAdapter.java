package com.carshop.app.adapter.persistence.brand.adapter;

import com.carshop.app.adapter.persistence.brand.entity.BrandEntity;
import com.carshop.app.adapter.persistence.brand.mapper.BrandJpaMapper;
import com.carshop.app.adapter.persistence.brand.repository.BrandRepository;
import com.carshop.app.application.port.persistence.brand.BrandRepositoryPort;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class BrandRepositoryAdapter implements BrandRepositoryPort {

    private final BrandRepository brandRepository;
    private final BrandJpaMapper brandJpaMapper;

    public BrandRepositoryAdapter(final BrandRepository brandRepository, final BrandJpaMapper brandJpaMapper) {
        this.brandRepository = brandRepository;
        this.brandJpaMapper = brandJpaMapper;
    }

    @Override
    public Brand save(Brand brand) {
        BrandEntity entity = this.brandJpaMapper.toJpaEntity(brand);
        entity = this.brandRepository.save(entity);
        return this.brandJpaMapper.toDomain(entity);
    }

    @Override
    public Optional<Brand> findByName(String name) {
        final Optional<BrandEntity> entity = this.brandRepository.findByName(name);
        return entity.map(this.brandJpaMapper::toDomain);
    }

    @Override
    public Optional<Brand> findById(long brandId) {
        final Optional<BrandEntity> entity = this.brandRepository.findById(brandId);
        return entity.map(this.brandJpaMapper::toDomain);
    }
}
