package com.carshop.app.adapter.api.model.mapper;

import com.carshop.app.adapter.api.model.dto.ModelDTO;
import com.carshop.app.adapter.api.model.dto.ModelRegisterDTO;
import com.carshop.app.adapter.api.model.dto.ModelUpdateDTO;
import com.carshop.app.domain.Brand;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.annotation.Mapper;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.stream.Collectors;

@Mapper
public class ModelDtoMapper {

    ModelDtoMapper() {

    }

    public ModelDTO toDto(final Model model) {
        final ModelDTO dto = new ModelDTO();
        dto.setId(model.getId());
        dto.setBrandId(model.getBrand().getId());
        dto.setBrandName(model.getBrand().getName());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        dto.setCover(model.getCover());
        return dto;
    }

    public Collection<ModelDTO> toDto(final Collection<Model> models) {
        return models
                .stream()
                .map((model) -> {
                    return toDto(model);
                })
                .collect(Collectors.toList());
    }

    public Model toDomain(final ModelRegisterDTO registerDTO) {
        return toDomain(null, registerDTO);
    }

    public Model toDomain(final Long customerId, final ModelRegisterDTO registerDTO) {
        final Model model = new Model();
        model.setBrand(new Brand(registerDTO.getBrandId()));
        model.setName(registerDTO.getName());
        model.setDescription(registerDTO.getDescription());
        model.setCover(registerDTO.getCover());
        return model;
    }

    public Model toDomain(final ModelUpdateDTO updateDTO) {
        return toDomain(null, updateDTO);
    }

    public Model toDomain(final Long customerId, final ModelUpdateDTO updateDTO) {
        final Model model = new Model();
        model.setBrand(new Brand(updateDTO.getBrandId()));
        model.setName(updateDTO.getName());
        model.setDescription(updateDTO.getDescription());
        model.setCover(updateDTO.getCover());
        model.setActive(true);
        model.setDeleted(true);
        model.setUpdatedAt(LocalDateTime.now());
        return model;
    }

}
