package com.carshop.app.adapter.api.engineType;

import com.carshop.app.adapter.api.engineType.dto.EngineTypeDTO;
import com.carshop.app.application.port.api.engineType.EngineTypePublicEndpointPort;
import com.carshop.app.application.usecase.engineTypes.EngineTypePublicUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.Collection;

@Adapter
public class EngineTypePublicEndpointAdapter implements EngineTypePublicEndpointPort {

    private final EngineTypePublicUseCase engineTypePublicUseCase;
    private final EngineTypeDtoMapper engineTypeDtoMapper;

    public EngineTypePublicEndpointAdapter(final EngineTypePublicUseCase engineTypePublicUseCase, final EngineTypeDtoMapper engineTypeDtoMapper){
        this.engineTypePublicUseCase = engineTypePublicUseCase;
        this.engineTypeDtoMapper = engineTypeDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<EngineTypeDTO> engineTypes = this.engineTypePublicUseCase.findUniversal().stream().map(this.engineTypeDtoMapper::toDto).toList();
            return HttpHandle.success(engineTypes);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
