package com.carshop.app.adapter.api.vehicle.mapper;

import com.carshop.app.adapter.api.brand.dto.BrandDTO;
import com.carshop.app.adapter.api.category.dto.CategoryDTO;
import com.carshop.app.adapter.api.color.dto.ColorDTO;
import com.carshop.app.adapter.api.customer.dto.CustomerDTO;
import com.carshop.app.adapter.api.engineType.dto.EngineTypeDTO;
import com.carshop.app.adapter.api.fuel.dto.FuelDTO;
import com.carshop.app.adapter.api.model.dto.ModelDTO;
import com.carshop.app.adapter.api.vehicle.dto.VehicleDTO;
import com.carshop.app.adapter.api.version.dto.VersionDTO;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class VehicleSearchDtoMapper {

    public VehicleSearchDtoMapper() {

    }

    public VehicleDTO toDto(final Vehicle vehicle) {
        final VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleDTO.setId(vehicle.getId());
        vehicleDTO.setCustomer(new CustomerDTO(vehicle.getCustomer().getId(), vehicle.getCustomer().getName()));
        vehicleDTO.setBrand(new BrandDTO(vehicle.getBrand().getId(), vehicle.getBrand().getName()));
        vehicleDTO.setModel(new ModelDTO(vehicle.getModel().getId(), vehicle.getModel().getName()));
        vehicleDTO.setVersion(new VersionDTO(vehicle.getVersion().getId(), vehicle.getVersion().getName()));
        vehicleDTO.setCategory(new CategoryDTO(vehicle.getCategory().getId(), vehicle.getCategory().getName()));
        vehicleDTO.setColor(new ColorDTO(vehicle.getColor().getId(), vehicle.getColor().getName()));
        vehicleDTO.setEngineType(new EngineTypeDTO(vehicle.getEngineType().getId(), vehicle.getEngineType().getName()));
        vehicleDTO.setFuel(new FuelDTO(vehicle.getFuel().getId(), vehicle.getFuel().getName()));
        vehicleDTO.setName(vehicle.getName());
        vehicleDTO.setDescription(vehicle.getDescription());
        vehicleDTO.setProductionYear(vehicle.getProductionYear());
        vehicleDTO.setReleaseYear(vehicle.getReleaseYear());
        vehicleDTO.setSign(vehicle.getSign());
        vehicleDTO.setRunning(vehicle.getRunning());
        vehicleDTO.setPrice(vehicle.getPrice());
        vehicleDTO.setPromotion(vehicle.getPromotion());
        return vehicleDTO;
    }

}
