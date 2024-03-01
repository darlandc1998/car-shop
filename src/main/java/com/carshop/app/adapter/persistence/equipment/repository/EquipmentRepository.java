package com.carshop.app.adapter.persistence.equipment.repository;

import com.carshop.app.adapter.persistence.equipment.entity.EquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Collection;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentEntity, Long> {

    @Query(value =
            " select * "
                    + "   from equipments "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<EquipmentEntity> findUniversal();

}
