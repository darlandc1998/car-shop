package com.carshop.app.adapter.persistence.engineType.repository;

import com.carshop.app.adapter.persistence.engineType.entity.EngineTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EngineTypeRepository extends JpaRepository<EngineTypeEntity, Long> {

    @Query(value =
            " select * "
                    + "   from engine_types "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<EngineTypeEntity> findUniversal();

}
