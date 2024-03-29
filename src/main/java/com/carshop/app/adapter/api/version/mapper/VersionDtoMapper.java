package com.carshop.app.adapter.api.version.mapper;

import com.carshop.app.adapter.api.version.dto.VersionDTO;
import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class VersionDtoMapper {

    VersionDtoMapper(){

    }

    public VersionDTO toDto(final Version version){
        final VersionDTO versionDTO = new VersionDTO();
        versionDTO.setId(version.getId());
        versionDTO.setName(version.getName());
        return versionDTO;
    }

}
