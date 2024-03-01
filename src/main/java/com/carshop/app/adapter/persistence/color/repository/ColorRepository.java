package com.carshop.app.adapter.persistence.color;

import com.carshop.app.adapter.persistence.color.entity.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ColorRepository extends JpaRepository<ColorEntity, Long> {

    @Query(value =
             " select * "
            + "   from colors "
            + " where active = true and "
            + "       deleted = false "
            + " order by name ", nativeQuery = true)
    Collection<ColorEntity> findUniversal();
}
