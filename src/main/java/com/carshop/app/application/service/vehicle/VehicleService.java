package com.carshop.app.application.service.vehicle;

import com.carshop.app.application.port.persistence.vehicle.VehicleRepositoryPort;
import com.carshop.app.application.usecase.brand.BrandUseCase;
import com.carshop.app.application.usecase.category.CategoryUseCase;
import com.carshop.app.application.usecase.color.ColorUseCase;
import com.carshop.app.application.usecase.customer.CustomerUseCase;
import com.carshop.app.application.usecase.engineTypes.EngineTypeUseCase;
import com.carshop.app.application.usecase.fuel.FuelUseCase;
import com.carshop.app.application.usecase.model.ModelUseCase;
import com.carshop.app.application.usecase.vehicle.VehicleUseCase;
import com.carshop.app.application.usecase.version.VersionUseCase;
import com.carshop.app.domain.*;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import com.carshop.app.infrastructure.validator.ObjectValidator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VehicleService implements VehicleUseCase {

    private final VehicleRepositoryPort vehicleRepository;

    private final CustomerUseCase customerUseCase;
    private final BrandUseCase brandUseCase;
    private final ModelUseCase modelUseCase;
    private final VersionUseCase versionUseCase;
    private final CategoryUseCase categoryUseCase;
    private final ColorUseCase colorUseCase;
    private final EngineTypeUseCase engineTypeUseCase;
    private final FuelUseCase fuelUseCase;

    public VehicleService(
            final VehicleRepositoryPort vehicleRepository,
            final CustomerUseCase customerUseCase,
            final BrandUseCase brandUseCase,
            final ModelUseCase modelUseCase,
            final VersionUseCase versionUseCase,
            final CategoryUseCase categoryUseCase,
            final ColorUseCase colorUseCase,
            final EngineTypeUseCase engineTypeUseCase,
            final FuelUseCase fuelUseCase) {
        this.vehicleRepository = vehicleRepository;
        this.customerUseCase = customerUseCase;
        this.brandUseCase = brandUseCase;
        this.modelUseCase = modelUseCase;
        this.versionUseCase = versionUseCase;
        this.categoryUseCase = categoryUseCase;
        this.colorUseCase = colorUseCase;
        this.engineTypeUseCase = engineTypeUseCase;
        this.fuelUseCase = fuelUseCase;
    }

    @Override
    public Vehicle persist(Vehicle vehicle) throws CarShopRuleException {
        mountDefaultPersistenceValues(vehicle);

        final Customer customer = this.customerUseCase.findById(vehicle.getCustomer().getId());
        vehicle.setCustomer(customer);

        final Brand brand = this.brandUseCase.findById(vehicle.getBrand().getId());
        vehicle.setBrand(brand);

        final Model model = this.modelUseCase.findById(vehicle.getModel().getId());
        vehicle.setModel(model);

        final Version version = this.versionUseCase.findById(vehicle.getVersion().getId());
        vehicle.setVersion(version);

        final Category category = this.categoryUseCase.findById(vehicle.getCategory().getId());
        vehicle.setCategory(category);

        final Color color = this.colorUseCase.findById(vehicle.getColor().getId());
        vehicle.setColor(color);

        final EngineType engineType = this.engineTypeUseCase.findById(vehicle.getEngineType().getId());
        vehicle.setEngineType(engineType);

        final Fuel fuel = this.fuelUseCase.findById(vehicle.getFuel().getId());
        vehicle.setFuel(fuel);

        ObjectValidator.validate(vehicle);
        vehicle = this.vehicleRepository.persist(vehicle);
        return vehicle;
    }

    private void mountDefaultPersistenceValues(Vehicle vehicle) {
        vehicle.setActive(true);
        vehicle.setDeleted(false);
        vehicle.setCreatedAt(LocalDateTime.now());
        vehicle.setUpdatedAt(LocalDateTime.now());
    }
}
