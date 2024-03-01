package com.carshop.app.application.usecase.version;

import com.carshop.app.domain.Version;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface VersionPublicUseCase {

    Collection<Version> findUniversal() throws CarShopRuleException;

}
