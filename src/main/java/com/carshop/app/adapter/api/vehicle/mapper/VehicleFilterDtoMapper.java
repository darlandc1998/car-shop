package com.carshop.app.adapter.api.vehicle.mapper;

import com.carshop.app.adapter.api.vehicle.dto.VehicleFilterDTO;
import com.carshop.app.domain.VehicleFilter;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class VehicleFilterDtoMapper {

    public VehicleFilterDtoMapper() {

    }

    public VehicleFilter toDomain(final VehicleFilterDTO filterDTO) {
        final VehicleFilter filter = new VehicleFilter();
        filter.setPage(filterDTO.getPage());
        filter.setSize(filterDTO.getSize());
        filter.setSearch(filterDTO.getSearch());
        filter.setSort(filterDTO.getSort());
        filter.setBrands(filterDTO.getBrands());
        filter.setModels(filterDTO.getModels());
        filter.setVersions(filterDTO.getVersions());
        filter.setCategories(filterDTO.getCategories());
        filter.setColors(filterDTO.getColors());
        filter.setEngineTypes(filterDTO.getEngineTypes());
        filter.setEquipments(filterDTO.getEquipments());
        filter.setFuels(filterDTO.getFuels());
        return filter;
    }

}
