package com.carshop.app.application.port.persistence.category;

import com.carshop.app.domain.Category;

import java.util.Collection;

public interface CategoryPublicRepositoryPort {

    Collection<Category> findUniversal();

}
