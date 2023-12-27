package com.carshop.app.modules.permissions.controllers.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.permissions.controllers.PermissionController;
import com.carshop.app.modules.permissions.dtos.PermissionDTO;
import com.carshop.app.modules.permissions.dtos.PermissionRegisterDTO;
import com.carshop.app.modules.permissions.dtos.PermissionUpdateDTO;
import com.carshop.app.modules.permissions.entities.Permission;
import com.carshop.app.modules.permissions.services.PermissionService;

@Service
public class PermissionControllerImpl implements PermissionController {

    private final PermissionService permissionService;

    @Autowired
    public PermissionControllerImpl(final PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @Override
    public HttpResponse save(int customerId, final PermissionRegisterDTO registerDTO) {
        try {
            final Permission permission = this.permissionService.save(mountPermissionOf(customerId, registerDTO));
            return HttpHandle.created(mountPermissionDTOOf(permission));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(int customerId, final PermissionUpdateDTO updateDTO) {
        try {
            final Permission permission = this.permissionService.save(mountPermissionOf(customerId, updateDTO));
            return HttpHandle.success(mountPermissionDTOOf(permission));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse listAll(int customerId) {
        try {
            final List<PermissionDTO> permissions = this.permissionService.findAllByCustomerId(customerId).stream().map(permission -> mountPermissionDTOOf(permission)).collect(Collectors.toList());
            return HttpHandle.success(permissions);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(final int customerId, final int permissionId) {
        try {
            final Permission permission = this.permissionService.findByCustomerIdAndPermissionId(customerId, permissionId);
            return HttpHandle.success(mountPermissionDTOOf(permission));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(final int customerId, final int permissionId) {
        try {
            this.permissionService.delete(new Permission(permissionId, customerId));
            return HttpHandle.success(permissionId);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private Permission mountPermissionOf(final int customerId, final PermissionRegisterDTO registerDTO) {
        final Permission permission = new Permission();
        permission.setCustomerId(customerId);
        permission.setName(registerDTO.getName());
        permission.setDescription(registerDTO.getDescription());
        permission.setIdentifier(registerDTO.getIdentifier());
        return permission;
    }

    private Permission mountPermissionOf(final int customerId, final PermissionUpdateDTO updateDTO) {
        final Permission permission = new Permission();
        permission.setId(updateDTO.getId());
        permission.setCustomerId(customerId);
        permission.setName(updateDTO.getName());
        permission.setDescription(updateDTO.getDescription());
        permission.setIdentifier(updateDTO.getIdentifier());
        permission.setUpdatedAt(LocalDateTime.now());
        return permission;
    }

    private PermissionDTO mountPermissionDTOOf(final Permission permission) {
        final PermissionDTO permissionDTO = new PermissionDTO();
        permissionDTO.setId(permission.getId());
        permissionDTO.setName(permission.getName());
        permissionDTO.setDescription(permission.getDescription());
        permissionDTO.setIdentifier(permission.getIdentifier());
        return permissionDTO;
    }

}
