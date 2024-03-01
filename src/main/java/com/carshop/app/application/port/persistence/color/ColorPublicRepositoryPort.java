package com.carshop.app.application.port.persistence.color;

import com.carshop.app.domain.Brand;
import com.carshop.app.domain.Color;

import java.util.Collection;

public interface ColorRepositoryPort {

    Collection<Color> findUniversal();

}
