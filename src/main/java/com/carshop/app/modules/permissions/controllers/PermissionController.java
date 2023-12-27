package com.carshop.app.modules.permissions.controllers;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.permissions.dtos.PermissionRegisterDTO;
import com.carshop.app.modules.permissions.dtos.PermissionUpdateDTO;

public interface PermissionController {

    HttpResponse save(final int customerId, final PermissionRegisterDTO registerDTO);

    HttpResponse update(final int customerId, final PermissionUpdateDTO updateDTO);

    HttpResponse listAll(final int customerId);

    HttpResponse findById(final int customerId, final int permissionId);

    HttpResponse delete(final int customerId, final int permissionId);

}
