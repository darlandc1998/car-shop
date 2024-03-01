package com.carshop.app.application.port.persistence.model;

import com.carshop.app.domain.Model;

import java.util.Optional;

public interface ModelRepositoryPort {

    Model save(final Model model);

    Optional<Model> findById(final long modelId);

}
