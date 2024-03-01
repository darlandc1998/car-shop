package com.carshop.app.adapter.persistence.vehicle.adapter;

import com.carshop.app.adapter.persistence.vehicle.document.VehicleDocument;
import com.carshop.app.adapter.persistence.vehicle.mapper.VehicleJpaMapper;
import com.carshop.app.application.port.persistence.vehicle.VehiclePublicSearchRepositoryPort;
import com.carshop.app.domain.Vehicle;
import com.carshop.app.domain.VehicleFilter;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;

import java.util.List;
import java.util.Objects;

@Adapter
public class VehiclePublicSearchRepositoryAdapter implements VehiclePublicSearchRepositoryPort {

    private final MongoTemplate mongoTemplate;
    private final VehicleJpaMapper vehicleJpaMapper;

    public VehiclePublicSearchRepositoryAdapter(final MongoTemplate mongoTemplate, final VehicleJpaMapper vehicleJpaMapper) {
        this.mongoTemplate = mongoTemplate;
        this.vehicleJpaMapper = vehicleJpaMapper;
    }


    @Override
    public Page<Vehicle> findAllByFilters(VehicleFilter filters) throws CarShopRuleException {
        final Pageable paging = PageRequest.of(filters.getPage(), filters.getSize());

        final Query query = new Query().with(paging);
        query.addCriteria(Criteria.where(VehicleDocument.ACTIVE_FIELD).is(Boolean.TRUE));
        query.addCriteria(Criteria.where(VehicleDocument.DELETED_FIELD).is(Boolean.FALSE));

        if (Objects.nonNull(filters.getBrands()) && !filters.getBrands().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_BRAND).is(Integer.parseInt(filters.getBrands())));
        }
        if (Objects.nonNull(filters.getModels()) && !filters.getModels().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_MODEL).is(Integer.parseInt(filters.getModels())));
        }
        if (Objects.nonNull(filters.getVersions()) && !filters.getVersions().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_VERSION).is(Integer.parseInt(filters.getVersions())));
        }
        if (Objects.nonNull(filters.getCategories()) && !filters.getCategories().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_CATEGORY).is(Integer.parseInt(filters.getVersions())));
        }
        if (Objects.nonNull(filters.getColors()) && !filters.getColors().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_COLOR).is(Integer.parseInt(filters.getColors())));
        }
        if (Objects.nonNull(filters.getEngineTypes()) && !filters.getEngineTypes().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_ENGINE_TYPE).is(Integer.parseInt(filters.getEngineTypes())));
        }
        if (Objects.nonNull(filters.getEquipments()) && !filters.getEquipments().trim().isEmpty()) {
            //TODO
        }
        if (Objects.nonNull(filters.getFuels()) && !filters.getFuels().trim().isEmpty()) {
            query.addCriteria(Criteria.where(VehicleDocument.ID_FUEL).is(Integer.parseInt(filters.getFuels())));
        }
        if (Objects.nonNull(filters.getSort()) && !filters.getSort().trim().isEmpty()) {
            final Sort sort = Sort.by(Sort.Order.desc(filters.getSort()));
            query.with(sort);
        }

        //final Criteria criteriaSearch = new Criteria();
        //criteriaSearch.orOperator(
        //        Criteria.where(VehicleDocument.NAME_FIELD).regex(filters.getSearch(), "i"),
        //        Criteria.where(VehicleDocument.DESCRIPTION_FIELD).regex(filters.getSearch(), "i"));
        //Criteria.where(VehicleDocument.MODEL_NAME_FIELD).regex(search, "i"));
        //query.addCriteria(criteriaSearch);

        final List<VehicleDocument> documentVehicles = mongoTemplate.find(query, VehicleDocument.class);
        final long countVehicles = mongoTemplate.count(Query.of(query).limit(-1).skip(-1), VehicleDocument.class);
        final List<Vehicle> vehicles = documentVehicles.stream().map(this.vehicleJpaMapper::toDomain).toList();

        return PageableExecutionUtils.getPage(vehicles, paging, () -> countVehicles);
    }
}
