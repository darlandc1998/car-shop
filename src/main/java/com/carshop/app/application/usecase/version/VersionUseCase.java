package com.carshop.app.application.usecase.version;

import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

public interface VersionUseCase {
    Version findById(final long versionId) throws CarShopRuleException;

}
