package com.carshop.app.application.usecase.equipment;

import com.carshop.app.domain.Equipment;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

import java.util.Collection;

public interface EquipmentPublicUseCase {

    Collection<Equipment> findUniversal() throws CarShopRuleException;

}
