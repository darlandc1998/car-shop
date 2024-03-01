package com.carshop.app.adapter.api.brand.mapper;

import com.carshop.app.adapter.api.brand.dto.BrandDTO;
import com.carshop.app.adapter.api.brand.dto.BrandRegisterDTO;
import com.carshop.app.adapter.api.brand.dto.BrandUpdateDTO;
import com.carshop.app.domain.Brand;
import com.carshop.app.infrastructure.annotation.Mapper;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.stream.Collectors;

@Mapper
public class BrandDtoMapper {

    BrandDtoMapper() {

    }

    public BrandDTO toDto(final Brand brand) {
        final BrandDTO dto = new BrandDTO();
        dto.setId(brand.getId());
        dto.setName(brand.getName());
        return dto;
    }

    public Collection<BrandDTO> toDto(final Collection<Brand> brands) {
        return brands
                .stream()
                .map((brand) -> {
                    return toDto(brand);
                })
                .collect(Collectors.toList());
    }

    public Brand toDomain(final BrandRegisterDTO registerDTO) {
        return toDomain(null, registerDTO);
    }

    public Brand toDomain(final Long customerId, final BrandRegisterDTO registerDTO) {
        final Brand brand = new Brand();
        brand.setName(registerDTO.getName());
        brand.setDescription(registerDTO.getDescription());
        brand.setCover(registerDTO.getCover());
        return brand;
    }

    Brand toDomain(final BrandUpdateDTO updateDTO) {
        return toDomain(null, updateDTO);
    }

    Brand toDomain(final Long customerId, final BrandUpdateDTO updateDTO) {
        final Brand brand = new Brand();
        brand.setId(updateDTO.getId());
        brand.setName(updateDTO.getName());
        brand.setDescription(updateDTO.getDescription());
        brand.setCover(updateDTO.getCover());
        brand.setActive(true);
        brand.setDeleted(false);
        brand.setUpdatedAt(LocalDateTime.now());
        return brand;
    }

}
