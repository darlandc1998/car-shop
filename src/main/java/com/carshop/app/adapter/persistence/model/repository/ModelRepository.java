package com.carshop.app.adapter.persistence.model.repository;

import com.carshop.app.adapter.persistence.model.entity.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Long> {

    @Query(value =
            " select * "
                    + "   from models "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<ModelEntity> findUniversal();

    @Query(value =
            " select * "
                    + "   from models "
                    + " where id_brand = :brandId and "
                    + "       active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<ModelEntity> findUniversalByBrandId(@Param("brandId") final long brandId);

    Optional<ModelEntity> findById(final long id);

}
