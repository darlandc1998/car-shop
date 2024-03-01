package com.carshop.app.adapter.persistence.fuel;

import com.carshop.app.adapter.persistence.fuel.entity.FuelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface FuelRepository extends JpaRepository<FuelEntity, Long> {

    @Query(value =
            " select * "
                    + "   from fuels "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<FuelEntity> findUniversal();

}
