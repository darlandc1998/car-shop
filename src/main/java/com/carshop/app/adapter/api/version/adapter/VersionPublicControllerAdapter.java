package com.carshop.app.adapter.api.version.adapter;

import com.carshop.app.adapter.api.version.dto.VersionDTO;
import com.carshop.app.adapter.api.version.mapper.VersionDtoMapper;
import com.carshop.app.application.port.api.version.VersionPublicEndpointPort;
import com.carshop.app.application.usecase.version.VersionPublicUseCase;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

import java.util.List;

@Adapter
public class VersionPublicControllerAdapter implements VersionPublicEndpointPort {

    private final VersionPublicUseCase versionPublicUseCase;
    private final VersionDtoMapper versionDtoMapper;

    public VersionPublicControllerAdapter(final VersionPublicUseCase versionPublicUseCase, final VersionDtoMapper versionDtoMapper){
        this.versionPublicUseCase = versionPublicUseCase;
        this.versionDtoMapper = versionDtoMapper;
    }

    @Override
    public HttpResponse listAllUniversal() {
        try {
            final List<VersionDTO> versions = this.versionPublicUseCase.findUniversal().stream().map(this.versionDtoMapper::toDto).toList();
            return HttpHandle.success(versions);
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }
}
