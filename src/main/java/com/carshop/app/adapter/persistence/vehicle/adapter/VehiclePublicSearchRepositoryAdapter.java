package com.carshop.app.adapter.persistence.vehicle.adapter;

import com.carshop.app.adapter.persistence.vehicle.document.VehicleDocument;
import com.carshop.app.application.port.persistence.vehicle.VehiclePublicRepositoryPort;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;

import java.util.List;

@Adapter
public class VehiclePublicRepositoryAdapter implements VehiclePublicRepositoryPort {

    private final MongoTemplate mongoTemplate;

    public VehiclePublicRepositoryAdapter(final MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public Page<Vehicle> findAllByFilters(VehicleFilter filters, Pageable paging) throws CarShopRuleException {
        return null;
    }
}
