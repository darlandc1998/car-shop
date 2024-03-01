package com.carshop.app.adapter.api.model.adapter;

import com.carshop.app.adapter.api.model.mapper.ModelDtoMapper;
import com.carshop.app.application.port.api.model.ModelPublicEndpointPort;
import com.carshop.app.application.usecase.model.ModelPublicUseCase;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.Collection;

@Adapter
public class ModelPublicEndpointAdapter implements ModelPublicEndpointPort {

    private final ModelPublicUseCase modelPublicUseCase;
    private final ModelDtoMapper modelDtoMapper;

    public ModelPublicEndpointAdapter(final ModelPublicUseCase modelPublicUseCase, final ModelDtoMapper modelDtoMapper) {
        this.modelPublicUseCase = modelPublicUseCase;
        this.modelDtoMapper = modelDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<Model> models = this.modelPublicUseCase.findUniversal();
            return HttpHandle.success(modelDtoMapper.toDto(models));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
