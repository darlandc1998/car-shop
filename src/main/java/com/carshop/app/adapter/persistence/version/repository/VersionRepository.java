package com.carshop.app.adapter.persistence.version.repository;

import com.carshop.app.adapter.persistence.version.entity.VersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface VersionRepository extends JpaRepository<VersionEntity, Long> {

    @Query(value =
            " select * "
                    + "   from versions "
                    + " where active = true and "
                    + "       deleted = false "
                    + " order by name ", nativeQuery = true)
    Collection<VersionEntity> findUniversal();

}
