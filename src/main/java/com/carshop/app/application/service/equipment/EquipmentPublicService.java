package com.carshop.app.application.service.equipment;

import com.carshop.app.application.port.persistence.equipment.EquipmentRepositoryPort;
import com.carshop.app.application.usecase.equipment.EquipmentUseCase;
import com.carshop.app.domain.Equipment;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EquipmentService implements EquipmentUseCase {

    private final EquipmentRepositoryPort equipmentRepositoryPort;

    public EquipmentService(final EquipmentRepositoryPort equipmentRepositoryPort){
        this.equipmentRepositoryPort = equipmentRepositoryPort;
    }

    @Override
    public Collection<Equipment> findUniversal() throws CarShopRuleException {
        return this.equipmentRepositoryPort.findUniversal();
    }
}
