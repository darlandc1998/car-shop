package com.carshop.app.adapter.api.fuel;

import com.carshop.app.adapter.api.fuel.dto.FuelDTO;
import com.carshop.app.domain.Fuel;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class FuelDtoMapper {

    FuelDtoMapper(){

    }

    FuelDTO toDto(final Fuel fuel){
        final FuelDTO fuelDTO = new FuelDTO();
        fuelDTO.setId(fuel.getId());
        fuelDTO.setName(fuel.getName());
        fuelDTO.setIdentifier(fuel.getIdentifier());
        return fuelDTO;
    }

}
