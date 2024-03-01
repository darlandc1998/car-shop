package com.carshop.app.adapter.persistence.fuel.mapper;

import com.carshop.app.adapter.persistence.fuel.entity.FuelEntity;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class FuelJpaMapper {

    FuelJpaMapper(){

    }

    public FuelEntity toJpaMapper(final Fuel fuel){
        final FuelEntity entity = new FuelEntity();
        entity.setId(fuel.getId());
        entity.setName(fuel.getName());
        entity.setIdentifier(fuel.getIdentifier());
        entity.setActive(fuel.getActive());
        entity.setDeleted(fuel.getDeleted());
        entity.setCreatedAt(fuel.getCreatedAt());
        entity.setUpdatedAt(fuel.getUpdatedAt());
        return entity;
    }

    public Fuel toDomain(final FuelEntity entity){
        final Fuel fuel = new Fuel();
        fuel.setId(entity.getId());
        fuel.setName(entity.getName());
        fuel.setIdentifier(entity.getIdentifier());
        fuel.setActive(entity.getActive());
        fuel.setDeleted(entity.getDeleted());
        fuel.setCreatedAt(entity.getCreatedAt());
        fuel.setUpdatedAt(entity.getUpdatedAt());
        return fuel;
    }

}
