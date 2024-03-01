package com.carshop.app.application.port.persistence.equipment;

import com.carshop.app.domain.Equipment;

import java.util.Collection;

public interface EquipmentPublicRepositoryPort {

    Collection<Equipment> findUniversal();

}
