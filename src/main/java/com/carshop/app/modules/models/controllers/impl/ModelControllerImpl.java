package com.carshop.app.modules.models.controllers.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.handles.HttpHandle;
import com.carshop.app.modules.models.controllers.ModelController;
import com.carshop.app.modules.models.dtos.ModelDTO;
import com.carshop.app.modules.models.dtos.ModelRegisterDTO;
import com.carshop.app.modules.models.dtos.ModelUpdateDTO;
import com.carshop.app.modules.models.entities.Model;
import com.carshop.app.modules.models.services.ModelService;

@Service
public class ModelControllerImpl implements ModelController {

    private final ModelService modelService;

    @Autowired
    public ModelControllerImpl(final ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public HttpResponse save(final int customerId, final ModelRegisterDTO registerDTO) {
        try {
            final Model model = this.modelService.save(new Model(null, customerId, registerDTO.getName()));
            return HttpHandle.created(mountModelDTOOf(model));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse update(final int customerId, final ModelUpdateDTO updateDTO) {
        try {
            final Model model = this.modelService.findByCustomerIdAndModelId(customerId, updateDTO.getId());
            model.setName(updateDTO.getName());
            model.setUpdatedAt(LocalDateTime.now());
            this.modelService.save(model);
            return HttpHandle.success(mountModelDTOOf(model));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse listAll(final int customerId) {
        try {
            final List<ModelDTO> models = this.modelService.findAllByCustomerId(customerId).stream().map(model -> new ModelDTO(model.getId(), model.getName())).collect(Collectors.toList());
            return HttpHandle.success(models);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(final int customerId, final Integer modelId) {
        try {
            final Model model = this.modelService.findByCustomerIdAndModelId(customerId, modelId);
            return HttpHandle.success(mountModelDTOOf(model));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse delete(final int customerId, final Integer modelId) {
        try {
            this.modelService.delete(new Model(modelId, customerId));
            return HttpHandle.success(modelId);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    private ModelDTO mountModelDTOOf(final Model model) {
        final ModelDTO modelDTO = new ModelDTO();
        modelDTO.setId(model.getId());
        modelDTO.setName(model.getName());
        return modelDTO;
    }

}
