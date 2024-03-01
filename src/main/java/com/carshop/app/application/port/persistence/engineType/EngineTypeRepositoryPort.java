package com.carshop.app.application.port.persistence.engineType;

import com.carshop.app.domain.EngineType;

import java.util.Optional;

public interface EngineTypeRepositoryPort {

    Optional<EngineType> findById(final long engineTypeId);

}
