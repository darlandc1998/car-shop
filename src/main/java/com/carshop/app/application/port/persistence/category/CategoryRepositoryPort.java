package com.carshop.app.application.port.persistence.category;

import com.carshop.app.domain.Category;

import java.util.Optional;

public interface CategoryRepositoryPort {

    Optional<Category> findById(final long categoryId);

}
