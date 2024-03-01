package com.carshop.app.application.service.color;

import com.carshop.app.application.port.persistence.color.ColorRepositoryPort;
import com.carshop.app.application.usecase.color.ColorUseCase;
import com.carshop.app.domain.Color;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ColorService implements ColorUseCase {

    private final ColorRepositoryPort colorRepositoryPort;

    public ColorService(final ColorRepositoryPort colorRepositoryPort) {
        this.colorRepositoryPort = colorRepositoryPort;
    }

    @Override
    public Color findById(long colorId) throws CarShopRuleException {
        final Optional<Color> color = this.colorRepositoryPort.findById(colorId);
        if (color.isEmpty()){
            throw new CarShopRuleException(CarShopRuleException.COLOR_NOT_FOUND);
        }
        return color.get();
    }
}
