package com.carshop.app.adapter.api.equipment.controller;

import com.carshop.app.adapter.api.equipment.adapter.EquipmentPublicEndpointAdapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/equipments")
public class EquipmentPublicController {

    private final EquipmentPublicEndpointAdapter equipmentPublicEndpointAdapter;

    public EquipmentPublicController(final EquipmentPublicEndpointAdapter equipmentPublicEndpointAdapter){
        this.equipmentPublicEndpointAdapter = equipmentPublicEndpointAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.equipmentPublicEndpointAdapter.listAllUniversal();
    }
}
