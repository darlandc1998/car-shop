package com.carshop.app.modules.colors.controllers.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.colors.controllers.ColorController;
import com.carshop.app.modules.colors.dtos.ColorDTO;
import com.carshop.app.modules.colors.dtos.ColorRegisterDTO;
import com.carshop.app.modules.colors.dtos.ColorUpdateDTO;
import com.carshop.app.modules.colors.entities.Color;
import com.carshop.app.modules.colors.services.ColorService;

@Service
public class ColorControllerImpl implements ColorController {

    private final ColorService colorService;

    @Autowired
    public ColorControllerImpl(final ColorService colorService) {
        this.colorService = colorService;
    }

    @Override
    public HttpResponse save(final int customerId, final ColorRegisterDTO registerDTO) {
        try {
            final Color color = this.colorService.save(new Color(customerId, registerDTO.getName()));
            return HttpHandle.created(mountColorDTOOf(color));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(final int customerId, final ColorUpdateDTO updateDTO) {
        try {
            final Color color = this.colorService.findByCustomerIdAndColorId(customerId, updateDTO.getId());
            color.setName(updateDTO.getName());
            color.setUpdatedAt(LocalDateTime.now());
            this.colorService.save(color);
            return HttpHandle.success(mountColorDTOOf(color));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse listAll(final int customerId) {
        try {
            final List<ColorDTO> colors = this.colorService.findAllByCustomerId(customerId).stream().map(color -> new ColorDTO(color.getId(), color.getName())).collect(Collectors.toList());
            return HttpHandle.success(colors);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(final int customerId, final Integer colorId) {
        try {
            final Color color = this.colorService.findByCustomerIdAndColorId(customerId, colorId);
            return HttpHandle.success(mountColorDTOOf(color));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(final int customerId, final Integer colorId) {
        try {
            this.colorService.delete(new Color(colorId, customerId));
            return HttpHandle.success(colorId);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private ColorDTO mountColorDTOOf(final Color color) {
        final ColorDTO colorDTO = new ColorDTO();
        colorDTO.setId(color.getId());
        colorDTO.setName(color.getName());
        return colorDTO;
    }

}
