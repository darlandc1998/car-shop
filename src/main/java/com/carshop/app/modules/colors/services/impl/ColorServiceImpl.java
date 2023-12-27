package com.carshop.app.modules.colors.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.colors.entities.Color;
import com.carshop.app.modules.colors.repositories.IColorRepository;
import com.carshop.app.modules.colors.services.ColorService;

@Service
public class ColorServiceImpl implements ColorService {

    private final IColorRepository colorRepository;

    @Autowired
    public ColorServiceImpl(final IColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @Override
    public Color save(Color color) {
        return this.colorRepository.save(color);
    }

    @Override
    public List<Color> findAllByCustomerId(int customerId) throws Exception {
        return this.colorRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Color findByCustomerIdAndColorId(final int customerId, final int colorId) throws Exception {
        final Optional<Color> color = this.colorRepository.findByCustomerIdAndId(customerId, colorId);
        if (!color.isPresent()) {
            throw new CarShopRuleException(CarShopRuleException.COLOR_NOT_FOUND);
        }
        return color.get();
    }

    @Override
    public Color delete(Color color) {
        this.colorRepository.delete(color);
        return color;
    }

}
