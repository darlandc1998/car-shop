package com.carshop.app.adapter.persistence.model.adapter;

import com.carshop.app.adapter.persistence.model.entity.ModelEntity;
import com.carshop.app.adapter.persistence.model.mapper.ModelJpaMapper;
import com.carshop.app.adapter.persistence.model.repository.ModelRepository;
import com.carshop.app.application.port.persistence.model.ModelRepositoryPort;
import com.carshop.app.domain.Model;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class ModelRepositoryAdapter implements ModelRepositoryPort {

    private final ModelRepository modelRepository;
    private final ModelJpaMapper modelJpaMapper;

    public ModelRepositoryAdapter(final ModelRepository modelRepository, final ModelJpaMapper modelJpaMapper) {
        this.modelRepository = modelRepository;
        this.modelJpaMapper = modelJpaMapper;
    }

    @Override
    public Model save(Model model) {
        ModelEntity entity = this.modelJpaMapper.toJpaEntity(model);
        entity = this.modelRepository.save(entity);
        return this.modelJpaMapper.toDomain(entity);
    }

    @Override
    public Optional<Model> findById(long modelId) {
        final Optional<ModelEntity> entity = this.modelRepository.findById(modelId);
        return entity.map(this.modelJpaMapper::toDomain);
    }

}
