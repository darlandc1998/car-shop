package com.carshop.app.modules.colors.services;

import java.util.List;

import com.carshop.app.modules.colors.entities.Color;

public interface ColorService {

    Color save(Color color) throws Exception;

    List<Color> findAllByCustomerId(final int customerId) throws Exception;

    Color findByCustomerIdAndColorId(final int customerId, final int colorId) throws Exception;

    Color delete(Color color) throws Exception;

}
