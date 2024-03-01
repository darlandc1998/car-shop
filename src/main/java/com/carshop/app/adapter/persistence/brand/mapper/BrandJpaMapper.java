package com.carshop.app.adapter.persistence.brand.mapper;

import com.carshop.app.adapter.persistence.brand.entity.BrandEntity;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class BrandJpaMapper {

    BrandJpaMapper() {

    }

    public BrandEntity toJpaEntity(final Brand brand) {
        final BrandEntity entity = new BrandEntity();
        entity.setId(brand.getId());
        entity.setName(brand.getName());
        entity.setDescription(brand.getDescription());
        entity.setCover(brand.getCover());
        entity.setActive(brand.getActive());
        entity.setDeleted(brand.getDeleted());
        entity.setCreatedAt(brand.getCreatedAt());
        entity.setUpdatedAt(brand.getUpdatedAt());
        return entity;
    }

    public Brand toDomain(final BrandEntity entity) {
        final Brand brand = new Brand();
        brand.setId(entity.getId());
        brand.setName(entity.getName());
        brand.setDescription(entity.getDescription());
        brand.setCover(entity.getCover());
        brand.setActive(entity.getActive());
        brand.setDeleted(entity.getDeleted());
        brand.setCreatedAt(entity.getCreatedAt());
        brand.setUpdatedAt(entity.getUpdatedAt());
        return brand;
    }

}
