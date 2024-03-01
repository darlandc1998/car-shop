package com.carshop.app.adapter.persistence.model.adapter;

import com.carshop.app.adapter.persistence.model.mapper.ModelJpaMapper;
import com.carshop.app.adapter.persistence.model.repository.ModelRepository;
import com.carshop.app.application.port.persistence.model.ModelPublicRepositoryPort;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Collection;

@Adapter
public class ModelPublicRepositoryAdapter implements ModelPublicRepositoryPort {

    private final ModelRepository modelRepository;
    private final ModelJpaMapper modelJpaMapper;

    public ModelPublicRepositoryAdapter(final ModelRepository modelRepository, final ModelJpaMapper modelJpaMapper) {
        this.modelRepository = modelRepository;
        this.modelJpaMapper = modelJpaMapper;
    }

    @Override
    public Collection<Model> findUniversal() {
        return this.modelJpaMapper.toDomain(this.modelRepository.findUniversal());
    }
}
