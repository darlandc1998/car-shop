package com.carshop.app.adapter.persistence.equipment;

import com.carshop.app.adapter.persistence.equipment.entity.EquipmentEntity;
import com.carshop.app.domain.Equipment;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class EquipmentJpaMapper {

    EquipmentJpaMapper(){

    }

    EquipmentEntity toJpaEntity(final Equipment equipment){
        final EquipmentEntity entity = new EquipmentEntity();
        entity.setId(equipment.getId());
        entity.setName(equipment.getName());
        entity.setActive(equipment.getActive());
        entity.setDeleted(equipment.getDeleted());
        entity.setCreatedAt(equipment.getCreatedAt());
        entity.setUpdatedAt(equipment.getUpdatedAt());
        return entity;
    }

    Equipment toDomain(final EquipmentEntity entity){
        final Equipment equipment = new Equipment();
        equipment.setId(entity.getId());
        equipment.setName(entity.getName());
        equipment.setActive(entity.getActive());
        equipment.setDeleted(entity.getDeleted());
        equipment.setCreatedAt(entity.getCreatedAt());
        equipment.setUpdatedAt(entity.getUpdatedAt());
        return equipment;
    }

}
