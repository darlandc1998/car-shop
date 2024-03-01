package com.carshop.app.adapter.persistence.color;

import com.carshop.app.adapter.persistence.color.entity.ColorEntity;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class ColorJpaMapper {

    ColorEntity toJpaEntity(final Color color){
        final ColorEntity entity = new ColorEntity();
        entity.setId(color.getId());
        entity.setName(color.getName());
        entity.setRgb(color.getRgb());
        entity.setActive(color.getActive());
        entity.setDeleted(color.getDeleted());
        entity.setCreatedAt(color.getCreatedAt());
        entity.setUpdatedAt(color.getUpdatedAt());
        return entity;
    }

    Color toDomain(final ColorEntity entity){
        final Color domain = new Color();
        domain.setId(entity.getId());
        domain.setName(entity.getName());
        domain.setRgb(entity.getRgb());
        domain.setActive(entity.getActive());
        domain.setDeleted(entity.getDeleted());
        domain.setCreatedAt(entity.getCreatedAt());
        domain.setUpdatedAt(entity.getUpdatedAt());
        return domain;
    }

}
