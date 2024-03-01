package com.carshop.app.application.service.color;

import com.carshop.app.application.port.persistence.color.ColorRepositoryPort;
import com.carshop.app.application.usecase.color.ColorPublicUseCase;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ColorService implements ColorPublicUseCase {

    private final ColorRepositoryPort colorRepositoryPort;

    public ColorService(final ColorRepositoryPort colorRepositoryPort){
        this.colorRepositoryPort = colorRepositoryPort;
    }

    @Override
    public Collection<Color> findUniversal() throws CarShopRuleException {
        return this.colorRepositoryPort.findUniversal();
    }
}
