package com.carshop.app.modules.colors.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.colors.entities.Color;
import com.carshop.app.modules.colors.repositories.IColorRepository;
import com.carshop.app.modules.colors.services.impl.ColorServiceImpl;

@SpringBootTest
@DisplayName("Color unity tests")
public class ColorServiceTestImpl {

    private ColorService colorService;

    @Mock
    private IColorRepository colorRepository;

    @BeforeEach
    public void setup() {
        colorService = new ColorServiceImpl(colorRepository);
    }

    @Test
    @DisplayName("It should save a new color")
    public void shouldSaveNewColor() throws Exception {
        final int customerId = 1;
        Color color = new Color();
        color.setCustomerId(customerId);
        color.setName("White");
        color.setCreatedAt(LocalDateTime.now());
        color.setUpdatedAt(LocalDateTime.now());
        Mockito.when(this.colorRepository.save(color)).thenReturn(mountInsertedColor(color));
        color = this.colorService.save(color);
        assertEquals(1, color.getId());
    }

    @Test
    @DisplayName("It should update a color")
    public void shouldUpdateColor() throws Exception {
        final int customerId = 1;
        Color color = new Color();
        color.setId(1);
        color.setCustomerId(customerId);
        color.setName("White");
        color.setUpdatedAt(LocalDateTime.now());
        Mockito.when(this.colorRepository.save(color)).thenReturn(color);
        color = this.colorService.save(color);
        assertEquals(1, color.getId());
    }

    @Test
    @DisplayName("It should list colors")
    public void shouldListColors() throws Exception {
        final int customerId = 1;
        final Color color = new Color();
        color.setId(1);
        color.setCustomerId(customerId);
        color.setName("White");
        color.setCreatedAt(LocalDateTime.now());
        color.setUpdatedAt(LocalDateTime.now());

        final List<Color> colors = new ArrayList<>();
        colors.add(color);

        Mockito.when(this.colorRepository.findAllByCustomerId(customerId)).thenReturn(colors);

        final List<Color> fetchedColors = this.colorService.findAllByCustomerId(customerId);

        assertEquals(1, fetchedColors.size());
    }

    @Test
    @DisplayName("It should get a color")
    public void shouldGetColor() throws Exception {
        final int customerId = 1;
        final Color color = new Color();
        color.setId(1);
        color.setCustomerId(customerId);
        color.setName("White");
        color.setCreatedAt(LocalDateTime.now());
        color.setUpdatedAt(LocalDateTime.now());

        Mockito.when(this.colorRepository.findByCustomerIdAndId(customerId, color.getId())).thenReturn(Optional.of(color));

        final Color fetchedColor = this.colorService.findByCustomerIdAndColorId(customerId, color.getId());

        assertEquals(1, fetchedColor.getId());
    }

    @Test
    @DisplayName("It should not get a color")
    public void shouldNotGetColor() throws Exception {
        final int customerId = 1;
        final int colorId = 1;

        Mockito.when(this.colorRepository.findByCustomerIdAndId(customerId, colorId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            this.colorService.findByCustomerIdAndColorId(customerId, colorId);
        });

        assertEquals(CarShopRuleException.COLOR_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It should delete a color")
    public void shouldDeleteColor() throws Exception {
        final int customerId = 1;
        Color color = new Color();
        color.setId(1);
        color.setCustomerId(customerId);
        color.setName("White");
        color.setCreatedAt(LocalDateTime.now());
        color.setUpdatedAt(LocalDateTime.now());

        color = this.colorService.delete(color);

        assertEquals(1, color.getId());
    }

    private Color mountInsertedColor(final Color color) {
        color.setId(1);
        return color;
    }

}
