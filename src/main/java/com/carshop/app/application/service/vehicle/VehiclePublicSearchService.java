package com.carshop.app.application.service.vehicle;

import com.carshop.app.application.port.persistence.vehicle.VehiclePublicSearchRepositoryPort;
import com.carshop.app.application.usecase.vehicle.VehiclePublicSearchUseCase;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class VehiclePublicSearchService implements VehiclePublicSearchUseCase {

    private final VehiclePublicSearchRepositoryPort vehicleRepository;

    public VehiclePublicSearchService(final VehiclePublicSearchRepositoryPort vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Page<Vehicle> search(VehicleFilter filters) {
        return this.vehicleRepository.findAllByFilters(filters);
    }
}
