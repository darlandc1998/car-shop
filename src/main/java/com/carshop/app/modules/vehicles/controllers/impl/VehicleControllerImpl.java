package com.carshop.app.modules.vehicles.controllers.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.vehicles.controllers.VehicleController;
import com.carshop.app.modules.vehicles.dtos.VehicleDTO;
import com.carshop.app.modules.vehicles.dtos.VehicleFilterDTO;
import com.carshop.app.modules.vehicles.dtos.VehiclePageDTO;
import com.carshop.app.modules.vehicles.dtos.VehicleRegisterDTO;
import com.carshop.app.modules.vehicles.dtos.VehicleUpdateDTO;
import com.carshop.app.modules.vehicles.entities.Vehicle;
import com.carshop.app.modules.vehicles.services.VehicleService;

@Service
public class VehicleControllerImpl implements VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleControllerImpl(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Override
    public HttpResponse listAll(final int customerId, final VehicleFilterDTO filterDTO) {
        try {
            final Pageable paging = PageRequest.of(filterDTO.getPage(), filterDTO.getSize());
            final Page<Vehicle> page = this.vehicleService.findAllByCustomerId(customerId, filterDTO.getSearch(), paging);

            final List<VehicleDTO> vehicles = new ArrayList<VehicleDTO>();
            for (Vehicle vehicle : page.getContent()) {
                vehicles.add(mountVehicleDTOOf(vehicle));
            }
            return HttpHandle.success(new VehiclePageDTO(vehicles, page.getNumber(), (int) page.getTotalElements(), page.getTotalPages()));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }

    }

    @Override
    public HttpResponse findById(final int customerId, final String vehicleId) {
        try {
            final Vehicle vehicle = this.vehicleService.findByCustomerIdAndVehicleId(customerId, vehicleId);
            return HttpHandle.success(mountVehicleDTOOf(vehicle));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse save(final int customerId, final VehicleRegisterDTO registerDTO) {
        try {
            final Vehicle vehicle = this.vehicleService.save(mountVehicleOf(customerId, registerDTO));
            return HttpHandle.created(vehicle);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(final int customerId, final VehicleUpdateDTO updateDTO) {
        try {
            final Vehicle vehicle = this.vehicleService.save(mountVehicleOf(customerId, updateDTO));
            return HttpHandle.success(vehicle);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(final int customerId, final String vehicleId) {
        try {
            this.vehicleService.delete(new Vehicle(vehicleId, customerId));
            return HttpHandle.success(vehicleId);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private VehicleDTO mountVehicleDTOOf(final Vehicle vehicle) {
        VehicleDTO dto = new VehicleDTO();
        dto.setId(vehicle.getId());
        dto.setName(vehicle.getName());
        dto.setDescription(vehicle.getDescription());
        dto.setYearProduction(vehicle.getYearProduction());
        dto.setYearRelease(vehicle.getYearRelease());
        dto.setSign(vehicle.getSign());
        dto.setRunning(vehicle.getRunning());
        dto.setBrandId(vehicle.getBrandId());
        dto.setBrandName(vehicle.getBrandName());
        dto.setColorId(vehicle.getColorId());
        dto.setColorName(vehicle.getColorName());
        dto.setModelId(vehicle.getModelId());
        dto.setModelName(vehicle.getModelName());
        dto.setActive(vehicle.getActive());
        return dto;
    }

    private Vehicle mountVehicleOf(final int customerId, final VehicleRegisterDTO registerDTO) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setCustomerId(customerId);
        vehicle.setName(registerDTO.getName());
        vehicle.setDescription(registerDTO.getDescription());
        vehicle.setYearProduction(registerDTO.getYearProduction());
        vehicle.setYearRelease(registerDTO.getYearRelease());
        vehicle.setSign(registerDTO.getSign());
        vehicle.setRunning(registerDTO.getRunning());
        vehicle.setBrandId(registerDTO.getBrandId());
        vehicle.setBrandName(registerDTO.getBrandName());
        vehicle.setColorId(registerDTO.getColorId());
        vehicle.setColorName(registerDTO.getColorName());
        vehicle.setModelId(registerDTO.getModelId());
        vehicle.setModelName(registerDTO.getModelName());
        vehicle.setActive(1);
        vehicle.setCreatedAt(LocalDateTime.now());
        vehicle.setUpdatedAt(LocalDateTime.now());
        return vehicle;
    }

    private Vehicle mountVehicleOf(final int customerId, final VehicleUpdateDTO updateDTO) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setCustomerId(customerId);
        vehicle.setId(updateDTO.getId());
        vehicle.setName(updateDTO.getName());
        vehicle.setDescription(updateDTO.getDescription());
        vehicle.setYearProduction(updateDTO.getYearProduction());
        vehicle.setYearRelease(updateDTO.getYearRelease());
        vehicle.setSign(updateDTO.getSign());
        vehicle.setRunning(updateDTO.getRunning());
        vehicle.setBrandId(updateDTO.getBrandId());
        vehicle.setBrandName(updateDTO.getBrandName());
        vehicle.setColorId(updateDTO.getColorId());
        vehicle.setColorName(updateDTO.getColorName());
        vehicle.setModelId(updateDTO.getModelId());
        vehicle.setModelName(updateDTO.getModelName());
        vehicle.setActive(updateDTO.getActive());
        vehicle.setUpdatedAt(LocalDateTime.now());
        return vehicle;
    }

}
