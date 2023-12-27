package com.carshop.app.modules.permissions.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.permissions.entities.Permission;
import com.carshop.app.modules.permissions.repositories.IPermissionRepository;
import com.carshop.app.modules.permissions.services.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {

    private final IPermissionRepository permissionRepository;

    @Autowired
    public PermissionServiceImpl(final IPermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    @Override
    public Permission save(final Permission permission) throws Exception {
        return this.permissionRepository.save(permission);
    }

    @Override
    public List<Permission> findAllByCustomerId(final int customerId) throws Exception {
        return this.permissionRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Permission findByCustomerIdAndPermissionId(final int customerId, final int permissionId) throws Exception {
        final Optional<Permission> permission = this.permissionRepository.findByCustomerIdAndId(customerId, permissionId);
        if (!permission.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.PERMISSION_NOT_FOUND);
        }
        return permission.get();
    }

    @Override
    public Permission delete(Permission permission) throws Exception {
        this.permissionRepository.delete(permission);
        return permission;
    }

}
