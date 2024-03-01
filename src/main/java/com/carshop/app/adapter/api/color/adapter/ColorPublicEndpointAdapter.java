package com.carshop.app.adapter.api.color.adapter;

import com.carshop.app.adapter.api.color.dto.ColorDTO;
import com.carshop.app.adapter.api.color.mapper.ColorDtoMapper;
import com.carshop.app.application.port.api.color.ColorPublicEndpointPort;
import com.carshop.app.application.usecase.color.ColorPublicUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;
import java.util.Collection;

@Adapter
public class ColorPublicEndpointAdapter implements ColorPublicEndpointPort {

    private final ColorPublicUseCase colorPublicUseCase;
    private final ColorDtoMapper colorDtoMapper;

    public ColorPublicEndpointAdapter(final ColorPublicUseCase colorPublicUseCase, final ColorDtoMapper colorDtoMapper){
        this.colorPublicUseCase = colorPublicUseCase;
        this.colorDtoMapper = colorDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final Collection<ColorDTO> colors = this.colorPublicUseCase.findUniversal().stream().map(this.colorDtoMapper::toDto).toList();
            return HttpHandle.success(colors);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
