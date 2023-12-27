package com.carshop.app.modules.brands.controllers.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.brands.controllers.BrandController;
import com.carshop.app.modules.brands.dtos.BrandDTO;
import com.carshop.app.modules.brands.dtos.BrandRegisterDTO;
import com.carshop.app.modules.brands.dtos.BrandUpdateDTO;
import com.carshop.app.modules.brands.entities.Brand;
import com.carshop.app.modules.brands.services.BrandService;

@Service
public class BrandControllerImpl implements BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandControllerImpl(final BrandService brandService) {
        this.brandService = brandService;
    }

    @Override
    public HttpResponse save(final int customerId, final BrandRegisterDTO registerDTO) {
        try {
            final Brand brand = this.brandService.save(new Brand(null, customerId, registerDTO.getName()));
            return HttpHandle.created(mountBrandDTOOf(brand));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(final int customerId, final BrandUpdateDTO updateDTO) {
        try {
            final Brand brand = this.brandService.findByCustomerIdAndColorId(customerId, updateDTO.getId());
            brand.setName(updateDTO.getName());
            this.brandService.save(brand);
            return HttpHandle.success(mountBrandDTOOf(brand));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse listAll(final int customerId) {
        try {
            final List<BrandDTO> brands = this.brandService.findAllByCustomerId(customerId).stream().map(brand -> new BrandDTO(brand.getId(), brand.getName())).collect(Collectors.toList());
            return HttpHandle.success(brands);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(final int customerId, final int brandId) {
        try {
            final Brand brand = this.brandService.findByCustomerIdAndColorId(customerId, brandId);
            return HttpHandle.success(mountBrandDTOOf(brand));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(final int customerId, final int brandId) {
        try {
            this.brandService.delete(new Brand(brandId, customerId));
            return HttpHandle.success(brandId);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private BrandDTO mountBrandDTOOf(final Brand brand) {
        final BrandDTO brandDTO = new BrandDTO();
        brandDTO.setId(brand.getId());
        brandDTO.setName(brand.getName());
        return brandDTO;
    }

}
