package com.carshop.app.adapter.persistence.category;

import com.carshop.app.adapter.persistence.category.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Query(value =
            " select * "
                    + "   from categories "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<CategoryEntity> findUniversal();

}
