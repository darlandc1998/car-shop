package com.carshop.app.adapter.api.model.adapter;

import com.carshop.app.adapter.api.model.dto.ModelRegisterDTO;
import com.carshop.app.adapter.api.model.mapper.ModelDtoMapper;
import com.carshop.app.application.port.api.model.ModelEndpointPort;
import com.carshop.app.application.usecase.model.ModelUseCase;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class ModelEndpointAdapter implements ModelEndpointPort {

    private final ModelUseCase modelUseCase;
    private final ModelDtoMapper modelDtoMapper;

    public ModelEndpointAdapter(final ModelUseCase modelUseCase, ModelDtoMapper modelDtoMapper) {
        this.modelUseCase = modelUseCase;
        this.modelDtoMapper = modelDtoMapper;
    }

    @Override
    public HttpResponse save(ModelRegisterDTO registerDTO) {
        try {
            Model model = this.modelDtoMapper.toDomain(registerDTO);
            model = this.modelUseCase.save(model);
            return HttpHandle.created(this.modelDtoMapper.toDto(model));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
