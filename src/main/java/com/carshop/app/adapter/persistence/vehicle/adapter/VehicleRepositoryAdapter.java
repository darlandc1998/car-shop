package com.carshop.app.adapter.persistence.vehicle.adapter;

import com.carshop.app.adapter.persistence.vehicle.document.VehicleDocument;
import com.carshop.app.adapter.persistence.vehicle.mapper.VehicleJpaMapper;
import com.carshop.app.application.port.persistence.vehicle.VehicleRepositoryPort;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Objects;
import java.util.Optional;

@Adapter
public class VehicleRepositoryAdapter implements VehicleRepositoryPort  {

    private final MongoTemplate mongoTemplate;
    private final VehicleJpaMapper vehicleJpaMapper;

    public VehicleRepositoryAdapter(final MongoTemplate mongoTemplate, final VehicleJpaMapper vehicleJpaMapper) {
        this.mongoTemplate = mongoTemplate;
        this.vehicleJpaMapper = vehicleJpaMapper;
    }

    @Override
    public Optional<Vehicle> findByCustomerIdAndId(long customerId, String vehicleId) throws CarShopRuleException {
        final Query query = new Query();
        query.addCriteria(Criteria.where(VehicleDocument.ID_FIELD).is(vehicleId));
        //query.addCriteria(Criteria.where(VehicleDocument.CUSTOMER_ID_FIELD).is(customerId));
        final VehicleDocument vehicle = this.mongoTemplate.findOne(query, VehicleDocument.class);
        if (Objects.isNull(vehicle)) {
            throw new CarShopRuleException(CarShopRuleException.VEHICLE_NOT_FOUND);
        }
        return Optional.empty();
    }

    @Override
    public Vehicle persist(Vehicle vehicle) throws CarShopRuleException {
        VehicleDocument document = this.vehicleJpaMapper.toDocument(vehicle);
        document = this.mongoTemplate.save(document);
        return this.vehicleJpaMapper.toDomain(document);
    }
}
