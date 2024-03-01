package com.carshop.app.adapter.persistence.version;

import com.carshop.app.adapter.persistence.model.entity.ModelEntity;
import com.carshop.app.adapter.persistence.version.entity.VersionEntity;
import com.carshop.app.domain.Model;
import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.annotation.Mapper;

@Mapper
public class VersionJpaMapper {

    VersionJpaMapper() {

    }

    VersionEntity toJpaEntity(final Version version) {
        final VersionEntity entity = new VersionEntity();
        entity.setId(version.getId());
        entity.setModel(new ModelEntity(version.getModel().getId()));
        entity.setName(version.getName());
        entity.setActive(version.getActive());
        entity.setDeleted(version.getDeleted());
        entity.setCreatedAt(version.getCreatedAt());
        entity.setUpdatedAt(version.getUpdatedAt());
        return entity;
    }

    Version toDomain(final VersionEntity entity) {
        final Version version = new Version();
        version.setId(entity.getId());
        version.setModel(new Model(entity.getModel().getId()));
        version.setName(entity.getName());
        version.setActive(entity.getActive());
        version.setDeleted(entity.getDeleted());
        version.setCreatedAt(entity.getCreatedAt());
        version.setUpdatedAt(entity.getUpdatedAt());
        return version;
    }

}
