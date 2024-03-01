package com.carshop.app.adapter.persistence.equipment;

import com.carshop.app.application.port.persistence.equipment.EquipmentPublicRepositoryPort;
import com.carshop.app.domain.Equipment;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Collection;

@Adapter
public class EquipmentPublicRepositoryAdapter implements EquipmentPublicRepositoryPort {

    private final EquipmentRepository equipmentRepository;
    private final EquipmentJpaMapper equipmentJpaMapper;

    public EquipmentPublicRepositoryAdapter(final EquipmentRepository equipmentRepository, final EquipmentJpaMapper equipmentJpaMapper){
        this.equipmentRepository = equipmentRepository;
        this.equipmentJpaMapper = equipmentJpaMapper;
    }

    @Override
    public Collection<Equipment> findUniversal() {
        return this.equipmentRepository.findUniversal().stream().map(this.equipmentJpaMapper::toDomain).toList();
    }
}
