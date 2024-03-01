package com.carshop.app.adapter.persistence.brand.repository;

import com.carshop.app.adapter.persistence.brand.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {

    @Query(value =
            " select * "
                    + "   from brands "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<BrandEntity> findUniversal();

    Optional<BrandEntity> findById(final long id);

    @Query(value =
            " select * "
                    + "   from brands "
                    + " where active = true and "
                    + "       deleted = false and "
                    + "       trim(lower(name)) = trim(lower(:name))"
                    + " order by name ", nativeQuery = true)
    Optional<BrandEntity> findByName(@Param("name") String name);

}
