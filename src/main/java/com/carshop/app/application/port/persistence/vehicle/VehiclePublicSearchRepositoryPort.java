package com.carshop.app.application.port.persistence.vehicle;

import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VehiclePublicRepositoryPort {

    Page<Vehicle> findAllByFilters(final VehicleFilter filters, final Pageable paging) throws CarShopRuleException;

}
