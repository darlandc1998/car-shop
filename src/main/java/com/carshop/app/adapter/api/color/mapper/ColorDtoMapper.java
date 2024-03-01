package com.carshop.app.adapter.api.color.mapper;

import com.carshop.app.adapter.api.color.dto.ColorDTO;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class ColorDtoMapper {

    public ColorDTO toDto(final Color color) {
        return new ColorDTO(color.getId(), color.getName());
    }

}
