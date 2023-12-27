package com.carshop.app.modules.brands.routes;

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
import com.carshop.app.modules.brands.controllers.BrandController;
import com.carshop.app.modules.brands.dtos.BrandRegisterDTO;
import com.carshop.app.modules.brands.dtos.BrandUpdateDTO;

@RestController
@RequestMapping("/api/v1/brands")
public class BrandRoutes extends AuthorizationDataFilter {

    private final BrandController brandController;

    @Autowired
    public BrandRoutes(final BrandController brandController) {
        this.brandController = brandController;
    }

    @GetMapping("/{brandId}")
    public HttpResponse findById(
            @PathVariable final Integer brandId) {
        return this.brandController.findById(getCustomerId(), brandId);
    }

    @GetMapping
    public HttpResponse listAll() {
        return this.brandController.listAll(getCustomerId());
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody BrandRegisterDTO brandRegisterDTO) {
        return this.brandController.save(getCustomerId(), brandRegisterDTO);
    }

    @PutMapping("/{brandId}")
    public HttpResponse update(
            @PathVariable final Integer brandId,
            @RequestBody BrandUpdateDTO brandUpdateDTO) {
        brandUpdateDTO.setId(brandId);
        return this.brandController.update(getCustomerId(), brandUpdateDTO);
    }

    @DeleteMapping("/{brandId}")
    public HttpResponse delete(
            @PathVariable final Integer brandId) {
        return this.brandController.delete(getCustomerId(), brandId);
    }

}
