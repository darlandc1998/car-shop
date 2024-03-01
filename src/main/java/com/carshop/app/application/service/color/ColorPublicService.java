package com.carshop.app.application.service.color;

import com.carshop.app.application.port.persistence.color.ColorPublicRepositoryPort;
import com.carshop.app.application.usecase.color.ColorPublicUseCase;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ColorPublicService implements ColorPublicUseCase {

    private final ColorPublicRepositoryPort colorPublicRepositoryPort;

    public ColorPublicService(final ColorPublicRepositoryPort colorPublicRepositoryPort){
        this.colorPublicRepositoryPort = colorPublicRepositoryPort;
    }

    @Override
    public Collection<Color> findUniversal() throws CarShopRuleException {
        return this.colorPublicRepositoryPort.findUniversal();
    }
}
