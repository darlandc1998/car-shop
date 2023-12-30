package com.carshop.app.modules.vehicles.repositories.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.vehicles.entities.Vehicle;
import com.carshop.app.modules.vehicles.repositories.IVehicleRepository;

@Repository
public class VehicleRepositoryImpl implements IVehicleRepository {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public VehicleRepositoryImpl(final MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Vehicle findByCustomerIdAndId(int customerId, String id) {
        final Query query = new Query();
        query.addCriteria(Criteria.where(Vehicle.ID_FIELD).is(id));
        query.addCriteria(Criteria.where(Vehicle.CUSTOMER_ID_FIELD).is(customerId));
        final Vehicle vehicle = this.mongoTemplate.findOne(query, Vehicle.class);
        if (Objects.isNull(vehicle)) {
            throw new CarShopRuleException(CarShopRuleException.VEHICLE_NOT_FOUND);
        }
        return vehicle;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return this.mongoTemplate.save(vehicle);
    }

    @Override
    public Page<Vehicle> findAllByCustomerId(int customerId, String search, Pageable pageable) {
        final Query query = new Query().with(pageable);
        query.addCriteria(Criteria.where(Vehicle.CUSTOMER_ID_FIELD).is(customerId));
        // query.addCriteria(Criteria.where(Vehicle.DELETED_FIELD).is(0));
        query.addCriteria(Criteria.where(Vehicle.ACTIVE_FIELD).is(1));

        final Criteria criteriaSearch = new Criteria();
        criteriaSearch.orOperator(
                Criteria.where(Vehicle.NAME_FIELD).regex(search, "i"),
                Criteria.where(Vehicle.DESCRIPTION_FIELD).regex(search, "i"),
                Criteria.where(Vehicle.MODEL_NAME_FIELD).regex(search, "i"));

        query.addCriteria(criteriaSearch);

        final List<Vehicle> vehicles = mongoTemplate.find(query, Vehicle.class);
        final long countVehicles = mongoTemplate.count(Query.of(query).limit(-1).skip(-1), Vehicle.class);

        return PageableExecutionUtils.getPage(vehicles, pageable, () -> countVehicles);
    }

    @Override
    public Vehicle delete(Vehicle vehicle) {
        mongoTemplate.remove(vehicle);
        return vehicle;
    }

}
