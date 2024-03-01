package com.carshop.app.adapter.api.equipment.mapper;

import com.carshop.app.adapter.api.equipment.dto.EquipmentDTO;
import com.carshop.app.domain.Equipment;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class EquipmentDtoMapper {

    EquipmentDtoMapper(){

    }

    public EquipmentDTO toDto(final Equipment equipment){
        final EquipmentDTO dto = new EquipmentDTO();
        dto.setId(equipment.getId());
        dto.setName(equipment.getName());
        return dto;
    }

}
