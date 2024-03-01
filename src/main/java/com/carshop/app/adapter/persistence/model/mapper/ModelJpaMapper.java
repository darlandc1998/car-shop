package com.carshop.app.adapter.persistence.model.mapper;

import com.carshop.app.adapter.persistence.brand.entity.BrandEntity;
import com.carshop.app.adapter.persistence.model.entity.ModelEntity;
import com.carshop.app.domain.Brand;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.annotation.Mapper;

import java.util.Collection;
import java.util.stream.Collectors;

@Mapper
public class ModelJpaMapper {

    ModelJpaMapper() {

    }

    public ModelEntity toJpaEntity(final Model model) {
        final ModelEntity entity = new ModelEntity();
        entity.setId(model.getId());
        entity.setBrand(new BrandEntity(model.getBrand().getId()));
        entity.setName(model.getName());
        entity.setDescription(model.getDescription());
        entity.setCover(model.getCover());
        entity.setActive(model.getActive());
        entity.setDeleted(model.getDeleted());
        entity.setCreatedAt(model.getCreatedAt());
        entity.setUpdatedAt(model.getUpdatedAt());
        return entity;
    }

    public Model toDomain(final ModelEntity entity) {
        final Model model = new Model();
        model.setId(entity.getId());
        model.setBrand(new Brand(entity.getBrand().getId()));
        model.setName(entity.getName());
        model.setDescription(entity.getDescription());
        model.setCover(entity.getCover());
        model.setActive(entity.getActive());
        model.setDeleted(entity.getDeleted());
        model.setCreatedAt(entity.getCreatedAt());
        model.setUpdatedAt(entity.getUpdatedAt());
        return model;
    }

    public Collection<Model> toDomain(final Collection<ModelEntity> list) {
        return list
                .stream()
                .map((entity) -> {
                    return toDomain(entity);
                })
                .collect(Collectors.toList());
    }

}
