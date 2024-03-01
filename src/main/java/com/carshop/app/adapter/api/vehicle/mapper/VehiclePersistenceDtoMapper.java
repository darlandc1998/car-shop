package com.carshop.app.adapter.api.vehicle.mapper;

import com.carshop.app.adapter.api.brand.dto.BrandDTO;
import com.carshop.app.adapter.api.category.dto.CategoryDTO;
import com.carshop.app.adapter.api.color.dto.ColorDTO;
import com.carshop.app.adapter.api.customer.dto.CustomerDTO;
import com.carshop.app.adapter.api.engineType.dto.EngineTypeDTO;
import com.carshop.app.adapter.api.fuel.dto.FuelDTO;
import com.carshop.app.adapter.api.model.dto.ModelDTO;
import com.carshop.app.adapter.api.vehicle.dto.VehicleDTO;
import com.carshop.app.adapter.api.vehicle.dto.VehiclePersistenceDTO;
import com.carshop.app.adapter.api.version.dto.VersionDTO;
import com.carshop.app.domain.*;
import com.carshop.app.infrastructure.annotation.Mapper;


@Mapper
public class VehiclePersistenceDtoMapper {

    public VehiclePersistenceDtoMapper() {

    }

    public Vehicle toDomain(final VehiclePersistenceDTO persistenceDTO) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setId(persistenceDTO.getId());
        vehicle.setCustomer(new Customer(persistenceDTO.getCustomerId()));
        vehicle.setBrand(new Brand(persistenceDTO.getBrandId()));
        vehicle.setModel(new Model(persistenceDTO.getModelId()));
        vehicle.setVersion(new Version(persistenceDTO.getVersionId()));
        vehicle.setCategory(new Category(persistenceDTO.getCategoryId()));
        vehicle.setColor(new Color(persistenceDTO.getColorId()));
        vehicle.setEngineType(new EngineType(persistenceDTO.getEngineTypeId()));
        vehicle.setFuel(new Fuel(persistenceDTO.getFuelId()));
        vehicle.setName(persistenceDTO.getName());
        vehicle.setDescription(persistenceDTO.getDescription());
        vehicle.setProductionYear(persistenceDTO.getProductionYear());
        vehicle.setReleaseYear(persistenceDTO.getReleaseYear());
        vehicle.setSign(persistenceDTO.getSign());
        vehicle.setRunning(persistenceDTO.getRunning());
        vehicle.setPrice(persistenceDTO.getPrice());
        vehicle.setPromotion(persistenceDTO.getPromotion());
        return vehicle;
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
