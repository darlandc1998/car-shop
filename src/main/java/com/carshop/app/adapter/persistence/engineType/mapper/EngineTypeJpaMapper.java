package com.carshop.app.adapter.persistence.engineType.mapper;

import com.carshop.app.adapter.persistence.engineType.entity.EngineTypeEntity;
import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.annotation.Mapper;


@Mapper
public class EngineTypeJpaMapper {

    EngineTypeJpaMapper(){

    }

    public EngineTypeEntity toJpaEntity(final EngineType engineType){
        final EngineTypeEntity entity = new EngineTypeEntity();
        entity.setId(engineType.getId());
        entity.setName(engineType.getName());
        entity.setIdentifier(engineType.getIdentifier());
        entity.setActive(engineType.getActive());
        entity.setDeleted(engineType.getDeleted());
        entity.setCreatedAt(engineType.getCreatedAt());
        entity.setUpdatedAt(engineType.getUpdatedAt());
        return entity;
    }

    public EngineType toDomain(final EngineTypeEntity entity){
        final EngineType engineType = new EngineType();
        engineType.setId(entity.getId());
        engineType.setName(entity.getName());
        engineType.setIdentifier(entity.getIdentifier());
        engineType.setActive(entity.getActive());
        engineType.setDeleted(entity.getDeleted());
        engineType.setCreatedAt(entity.getCreatedAt());
        engineType.setUpdatedAt(entity.getUpdatedAt());
        return engineType;
    }

}
