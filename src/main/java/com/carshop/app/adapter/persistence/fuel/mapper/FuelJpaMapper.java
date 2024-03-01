package com.carshop.app.adapter.persistence.fuel;

import com.carshop.app.adapter.persistence.customer.entity.CustomerEntity;
import com.carshop.app.adapter.persistence.fuel.entity.FuelEntity;
import com.carshop.app.domain.Customer;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.annotation.Mapper;

import java.util.Objects;

@Mapper
public class FuelJpaMapper {

    FuelJpaMapper(){

    }

    FuelEntity toJpaMapper(final Fuel fuel){
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

    Fuel toJpaMapper(final FuelEntity entity){
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
