package com.carshop.app.adapter.persistence.color.adapter;

import com.carshop.app.adapter.persistence.color.entity.ColorEntity;
import com.carshop.app.adapter.persistence.color.mapper.ColorJpaMapper;
import com.carshop.app.adapter.persistence.color.repository.ColorRepository;
import com.carshop.app.application.port.persistence.color.ColorRepositoryPort;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.annotation.Adapter;

import java.util.Optional;

@Adapter
public class ColorRepositoryAdapter implements ColorRepositoryPort {

    private final ColorRepository colorRepository;
    private final ColorJpaMapper colorJpaMapper;

    public ColorRepositoryAdapter(final ColorRepository colorRepository, final ColorJpaMapper colorJpaMapper){
        this.colorRepository = colorRepository;
        this.colorJpaMapper = colorJpaMapper;
    }


    @Override
    public Optional<Color> findById(long colorId) {
        final Optional<ColorEntity> entity = this.colorRepository.findById(colorId);
        return entity.map(this.colorJpaMapper::toDomain);
    }
}
