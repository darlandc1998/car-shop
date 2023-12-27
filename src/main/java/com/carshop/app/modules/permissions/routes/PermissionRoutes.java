package com.carshop.app.modules.permissions.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.permissions.controllers.PermissionController;
import com.carshop.app.modules.permissions.dtos.PermissionRegisterDTO;
import com.carshop.app.modules.permissions.dtos.PermissionUpdateDTO;

@RestController
@RequestMapping("/api/v1/permissions")
public class PermissionRoutes extends AuthorizationDataFilter {

    private PermissionController permissionController;

    @Autowired
    public PermissionRoutes(final PermissionController permissionController) {
        this.permissionController = permissionController;
    }

    @GetMapping("/{permissionId}")
    public HttpResponse findById(
            @PathVariable final Integer permissionId) {
        return this.permissionController.findById(getCustomerId(), permissionId);
    }

    @GetMapping
    public HttpResponse listAll() {
        return this.permissionController.listAll(getCustomerId());
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody PermissionRegisterDTO permissionRegisterDTO) {
        return this.permissionController.save(getCustomerId(), permissionRegisterDTO);
    }

    @PutMapping("/{permissionId}")
    public HttpResponse update(
            @PathVariable final Integer permissionId,
            @RequestBody PermissionUpdateDTO permissionUpdateDTO) {
        permissionUpdateDTO.setId(permissionId);
        return this.permissionController.update(getCustomerId(), permissionUpdateDTO);
    }

    @DeleteMapping("/{permissionId}")
    public HttpResponse delete(
            @PathVariable final Integer permissionId) {
        return this.permissionController.delete(getCustomerId(), permissionId);
    }

}
