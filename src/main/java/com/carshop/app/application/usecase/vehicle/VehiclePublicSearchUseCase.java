package com.carshop.app.application.usecase.vehicle;

import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import org.springframework.data.domain.Page;

public interface VehiclePublicSearchUseCase {

    Page<Vehicle> search(final VehicleFilter filters);

}
