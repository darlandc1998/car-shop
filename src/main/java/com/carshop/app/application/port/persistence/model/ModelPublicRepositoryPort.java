package com.carshop.app.application.port.persistence.model;

import com.carshop.app.domain.Model;

import java.util.Collection;

public interface ModelPublicRepositoryPort {

    Collection<Model> findUniversal();

}
