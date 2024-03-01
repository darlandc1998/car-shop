package com.carshop.app.adapter.persistence.color.adapter;

import com.carshop.app.adapter.persistence.color.repository.ColorRepository;
import com.carshop.app.adapter.persistence.color.mapper.ColorJpaMapper;
import com.carshop.app.application.port.persistence.color.ColorPublicRepositoryPort;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.annotation.Adapter;
import java.util.Collection;

@Adapter
public class ColorPublicRepositoryAdapter implements ColorPublicRepositoryPort {

    private final ColorRepository colorRepository;
    private final ColorJpaMapper colorJpaMapper;

    public ColorPublicRepositoryAdapter(final ColorRepository colorRepository, final ColorJpaMapper colorJpaMapper){
        this.colorRepository = colorRepository;
        this.colorJpaMapper = colorJpaMapper;
    }

    @Override
    public Collection<Color> findUniversal() {
        return this.colorRepository.findUniversal().stream().map(this.colorJpaMapper::toDomain).toList();
    }
}
