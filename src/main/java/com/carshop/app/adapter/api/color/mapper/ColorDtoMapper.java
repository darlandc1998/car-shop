package com.carshop.app.adapter.api.color;

import com.carshop.app.adapter.api.color.dto.ColorDTO;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class ColorDtoMapper {

    ColorDTO toDto(final Color color) {
        return new ColorDTO(color.getId(), color.getName());
    }

}
