package com.carshop.app.adapter.persistence.vehicle.mapper;

import com.carshop.app.adapter.persistence.vehicle.document.*;
import com.carshop.app.domain.*;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class VehicleJpaMapper {

    public VehicleJpaMapper() {

    }

    public VehicleDocument toDocument(final Vehicle vehicle) {
        final VehicleDocument document = new VehicleDocument();
        document.setId(vehicle.getId());
        document.setCustomer(new VehicleCustomerDocument(vehicle.getCustomer().getId(), vehicle.getCustomer().getName()));
        document.setBrand(new VehicleBrandDocument(vehicle.getBrand().getId(), vehicle.getBrand().getName()));
        document.setModel(new VehicleModelDocument(vehicle.getModel().getId(), vehicle.getModel().getName()));
        document.setVersion(new VehicleVersionDocument(vehicle.getVersion().getId(), vehicle.getVersion().getName()));
        document.setEquipments(null);
        document.setCategory(new VehicleCategoryDocument(vehicle.getCategory().getId(), vehicle.getCategory().getName()));
        document.setColor(new VehicleColorDocument(vehicle.getColor().getId(), vehicle.getColor().getName()));
        document.setEngineType(new VehicleEngineTypeDocument(vehicle.getEngineType().getId(), vehicle.getEngineType().getName()));
        document.setFuel(new VehicleFuelDocument(vehicle.getFuel().getId(), vehicle.getFuel().getName()));
        document.setName(vehicle.getName());
        document.setDescription(vehicle.getDescription());
        document.setProductionYear(vehicle.getProductionYear());
        document.setReleaseYear(vehicle.getReleaseYear());
        document.setSign(vehicle.getSign());
        document.setRunning(vehicle.getRunning());
        document.setPrice(vehicle.getPrice());
        document.setPromotion(vehicle.getPromotion());
        document.setActive(vehicle.getActive());
        document.setDeleted(vehicle.getDeleted());
        document.setCreatedAt(vehicle.getCreatedAt());
        document.setUpdatedAt(vehicle.getUpdatedAt());
        return document;
    }


    public Vehicle toDomain(final VehicleDocument document) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setId(document.getId());
        vehicle.setCustomer(new Customer(document.getCustomer().getId(), document.getCustomer().getName()));
        vehicle.setBrand(new Brand(document.getBrand().getId(), document.getBrand().getName()));
        vehicle.setModel(new Model(document.getModel().getId(), document.getModel().getName()));
        vehicle.setVersion(new Version(document.getVersion().getId(), document.getVersion().getName()));
        vehicle.setEquipments(null);
        vehicle.setCategory(new Category(document.getCategory().getId(), document.getCategory().getName()));
        vehicle.setColor(new Color(document.getColor().getId(), document.getColor().getName()));
        vehicle.setEngineType(new EngineType(document.getEngineType().getId(), document.getEngineType().getName()));
        vehicle.setFuel(new Fuel(document.getFuel().getId(), document.getFuel().getName()));
        vehicle.setName(document.getName());
        vehicle.setDescription(document.getDescription());
        vehicle.setProductionYear(document.getProductionYear());
        vehicle.setReleaseYear(document.getReleaseYear());
        vehicle.setSign(document.getSign());
        vehicle.setRunning(document.getRunning());
        vehicle.setPrice(document.getPrice());
        vehicle.setPromotion(document.getPromotion());
        vehicle.setActive(document.getActive());
        vehicle.setDeleted(document.getDeleted());
        vehicle.setCreatedAt(document.getCreatedAt());
        vehicle.setUpdatedAt(document.getUpdatedAt());
        return vehicle;
    }

}
