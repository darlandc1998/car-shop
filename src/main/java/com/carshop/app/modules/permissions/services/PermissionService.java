package com.carshop.app.modules.permissions.services;

import java.util.List;

import com.carshop.app.modules.permissions.entities.Permission;

public interface PermissionService {

    Permission save(final Permission permission) throws Exception;

    List<Permission> findAllByCustomerId(final int customerId) throws Exception;

    Permission findByCustomerIdAndPermissionId(final int customerId, final int permissionId) throws Exception;

    Permission delete(final Permission permission) throws Exception;

}
