package com.carshop.app.application.service.equipment;

import com.carshop.app.application.port.persistence.equipment.EquipmentPublicRepositoryPort;
import com.carshop.app.application.usecase.equipment.EquipmentPublicUseCase;
import com.carshop.app.domain.Equipment;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EquipmentPublicService implements EquipmentPublicUseCase {

    private final EquipmentPublicRepositoryPort equipmentPublicRepositoryPort;

    public EquipmentPublicService(final EquipmentPublicRepositoryPort equipmentPublicRepositoryPort){
        this.equipmentPublicRepositoryPort = equipmentPublicRepositoryPort;
    }

    @Override
    public Collection<Equipment> findUniversal() throws CarShopRuleException {
        return this.equipmentPublicRepositoryPort.findUniversal();
    }
}
