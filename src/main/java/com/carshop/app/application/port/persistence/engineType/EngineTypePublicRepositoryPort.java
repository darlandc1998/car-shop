package com.carshop.app.application.port.persistence.engineType;

import com.carshop.app.domain.EngineType;

import java.util.Collection;

public interface EngineTypeRepositoryPort {

    Collection<EngineType> findUniversal();

}
