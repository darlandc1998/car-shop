package com.carshop.app.adapter.api.equipment.adapter;

import com.carshop.app.adapter.api.equipment.dto.EquipmentDTO;
import com.carshop.app.adapter.api.equipment.mapper.EquipmentDtoMapper;
import com.carshop.app.application.port.api.equipment.EquipmentPublicEndpointPort;
import com.carshop.app.application.usecase.equipment.EquipmentPublicUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.Collection;

@Adapter
public class EquipmentPublicEndpointAdapter implements EquipmentPublicEndpointPort {

    private final EquipmentPublicUseCase equipmentPublicUseCase;
    private final EquipmentDtoMapper equipmentDtoMapper;

    public EquipmentPublicEndpointAdapter(final EquipmentPublicUseCase equipmentPublicUseCase, final EquipmentDtoMapper equipmentDtoMapper){
        this.equipmentPublicUseCase = equipmentPublicUseCase;
        this.equipmentDtoMapper = equipmentDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<EquipmentDTO> equipments = this.equipmentPublicUseCase.findUniversal().stream().map(this.equipmentDtoMapper::toDto).toList();
            return HttpHandle.success(equipments);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
