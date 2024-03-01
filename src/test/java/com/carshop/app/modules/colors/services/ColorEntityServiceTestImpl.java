package com.carshop.app.modules.colors.services;

import com.carshop.app.adapter.persistence.color.entity.ColorEntity;
import com.carshop.app.infrastructure.exception.CarShopRuleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Color unity tests")
public class ColorEntityServiceTestImpl {

    //@Mock
    //private ColorRepository colorRepository;

    @BeforeEach
    public void setup() {

    }

    @Test
    @DisplayName("It should save a new color")
    public void shouldSaveNewColor() throws Exception {
        final int customerId = 1;
        ColorEntity colorEntity = new ColorEntity();
        //colorEntity.setCustomerId(customerId);
        colorEntity.setName("White");
        colorEntity.setCreatedAt(LocalDateTime.now());
        colorEntity.setUpdatedAt(LocalDateTime.now());
        //Mockito.when(this.colorRepository.save(colorEntity)).thenReturn(mountInsertedColor(colorEntity));
        //colorEntity = this.colorService.save(colorEntity);
        //assertEquals(1, colorEntity.getId());
    }

    @Test
    @DisplayName("It should update a color")
    public void shouldUpdateColor() throws Exception {
        final int customerId = 1;
        ColorEntity colorEntity = new ColorEntity();
        //colorEntity.setId(1);
        //colorEntity.setCustomerId(customerId);
        colorEntity.setName("White");
        colorEntity.setUpdatedAt(LocalDateTime.now());
        //Mockito.when(this.colorRepository.save(colorEntity)).thenReturn(colorEntity);
        //colorEntity = this.colorService.save(colorEntity);
        //assertEquals(1, colorEntity.getId());
    }

    @Test
    @DisplayName("It should list colors")
    public void shouldListColors() throws Exception {
        final int customerId = 1;
        final ColorEntity colorEntity = new ColorEntity();
        //colorEntity.setId(1);
        //colorEntity.setCustomerId(customerId);
        colorEntity.setName("White");
        colorEntity.setCreatedAt(LocalDateTime.now());
        colorEntity.setUpdatedAt(LocalDateTime.now());

        final List<ColorEntity> colorEntities = new ArrayList<>();
        colorEntities.add(colorEntity);

        //Mockito.when(this.colorRepository.findAllByCustomerId(customerId)).thenReturn(colorEntities);

        //final List<ColorEntity> fetchedColorEntities = this.colorService.findAllByCustomerId(customerId);

        //assertEquals(1, fetchedColorEntities.size());
    }

    @Test
    @DisplayName("It should get a color")
    public void shouldGetColor() throws Exception {
        final int customerId = 1;
        final ColorEntity colorEntity = new ColorEntity();
        //colorEntity.setId(1);
        //colorEntity.setCustomerId(customerId);
        colorEntity.setName("White");
        colorEntity.setCreatedAt(LocalDateTime.now());
        colorEntity.setUpdatedAt(LocalDateTime.now());

        //Mockito.when(this.colorRepository.findByCustomerIdAndId(customerId, colorEntity.getId())).thenReturn(Optional.of(colorEntity));

        //final ColorEntity fetchedColorEntity = this.colorService.findByCustomerIdAndColorId(customerId, colorEntity.getId());

        //assertEquals(1, fetchedColorEntity.getId());
    }

    @Test
    @DisplayName("It should not get a color")
    public void shouldNotGetColor() throws Exception {
        final int customerId = 1;
        final int colorId = 1;

        //Mockito.when(this.colorRepository.findByCustomerIdAndId(customerId, colorId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            //this.colorService.findByCustomerIdAndColorId(customerId, colorId);
        });

        assertEquals(CarShopRuleException.COLOR_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It should delete a color")
    public void shouldDeleteColor() throws Exception {
        final int customerId = 1;
        ColorEntity colorEntity = new ColorEntity();
        //colorEntity.setId(1);
        //colorEntity.setCustomerId(customerId);
        colorEntity.setName("White");
        colorEntity.setCreatedAt(LocalDateTime.now());
        colorEntity.setUpdatedAt(LocalDateTime.now());

        //colorEntity = this.colorService.delete(colorEntity);

        assertEquals(1, colorEntity.getId());
    }

    private ColorEntity mountInsertedColor(final ColorEntity colorEntity) {
        //colorEntity.setId(1);
        return colorEntity;
    }

}
