package com.carshop.app.application.port.persistence.color;

import com.carshop.app.domain.Color;

import java.util.Optional;

public interface ColorRepositoryPort {

    Optional<Color> findById(final long colorId);

}
