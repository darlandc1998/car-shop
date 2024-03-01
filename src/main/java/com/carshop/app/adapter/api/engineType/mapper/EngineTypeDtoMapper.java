package com.carshop.app.adapter.api.engineType;

import com.carshop.app.adapter.api.engineType.dto.EngineTypeDTO;
import com.carshop.app.domain.EngineType;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class EngineTypeDtoMapper {

    EngineTypeDtoMapper(){

    }

    EngineTypeDTO toDto(final EngineType engineType){
        final EngineTypeDTO engineTypeDTO = new EngineTypeDTO();
        engineTypeDTO.setId(engineType.getId());
        engineTypeDTO.setName(engineType.getName());
        engineTypeDTO.setIdentifier(engineType.getIdentifier());
        return engineTypeDTO;
    }

}
