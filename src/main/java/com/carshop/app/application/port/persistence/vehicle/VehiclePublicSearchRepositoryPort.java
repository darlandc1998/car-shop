package com.carshop.app.application.port.persistence.vehicle;

import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.data.domain.Page;

public interface VehiclePublicSearchRepositoryPort {

    Page<Vehicle> findAllByFilters(final VehicleFilter filters) throws CarShopRuleException;

}
