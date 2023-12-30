package com.carshop.app.modules.brands.services;

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
import com.carshop.app.modules.brands.entities.Brand;
import com.carshop.app.modules.brands.repositories.IBrandRepository;
import com.carshop.app.modules.brands.services.impl.BrandServiceImpl;

@DisplayName("Brand unity tests")
@SpringBootTest
public class BrandServiceTestImpl {

    private BrandService brandService;

    @Mock
    private IBrandRepository brandRepository;

    @BeforeEach
    public void setup() {
        brandService = new BrandServiceImpl(brandRepository);
    }

    @Test
    @DisplayName("It should save a new brand")
    public void shouldSaveNewBrand() throws Exception {
        final int customerId = 1;
        final Brand brand = new Brand();
        brand.setCustomerId(customerId);
        brand.setName("FIAT");
        brand.setCreatedAt(LocalDateTime.now());
        brand.setUpdatedAt(LocalDateTime.now());

        Mockito.when(this.brandRepository.save(brand)).thenReturn(mountInsertedBrand(brand));

        final Brand brandSaved = this.brandService.save(brand);

        assertEquals(1, brandSaved.getId());
    }

    @Test
    @DisplayName("It should update a brand")
    public void shouldUpdateBrand() throws Exception {
        final int customerId = 1;
        final Brand brand = new Brand();
        brand.setId(1);
        brand.setCustomerId(customerId);
        brand.setName("FIAT");
        brand.setUpdatedAt(LocalDateTime.now());

        Mockito.when(this.brandRepository.save(brand)).thenReturn(brand);

        final Brand brandSaved = this.brandService.save(brand);

        assertEquals(1, brandSaved.getId());
    }

    @Test
    @DisplayName("It should list brands")
    public void shouldListBrands() throws Exception {
        final int customerId = 1;

        final Brand brand = new Brand();
        brand.setId(1);
        brand.setCustomerId(customerId);
        brand.setName("FIAT");
        brand.setUpdatedAt(LocalDateTime.now());

        final List<Brand> brands = new ArrayList<>();
        brands.add(brand);

        Mockito.when(brandRepository.findAllByCustomerId(customerId)).thenReturn(brands);

        final List<Brand> fetchedBrands = this.brandService.findAllByCustomerId(customerId);

        assertEquals(1, fetchedBrands.size());
    }

    @Test
    @DisplayName("It should get brand")
    public void shouldGetBrand() throws Exception {
        final int customerId = 1;

        final Brand brand = new Brand();
        brand.setId(1);
        brand.setCustomerId(customerId);
        brand.setName("FIAT");
        brand.setUpdatedAt(LocalDateTime.now());

        Mockito.when(brandRepository.findByCustomerIdAndId(customerId, brand.getId())).thenReturn(Optional.of(brand));

        final Brand fetchedBrand = this.brandService.findByCustomerIdAndColorId(customerId, brand.getId());

        assertEquals(1, fetchedBrand.getId());
    }

    @Test
    @DisplayName("It should not get a brand")
    public void shouldNotGetBrand() throws Exception {
        final int customerId = 1;
        final int brandId = 1;

        Mockito.when(brandRepository.findByCustomerIdAndId(customerId, brandId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            this.brandService.findByCustomerIdAndColorId(customerId, brandId);
        });

        assertEquals(CarShopRuleException.BRAND_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It should delete a brand")
    public void shouldDeleteBrand() throws Exception {
        final int customerId = 1;
        Brand brand = new Brand();
        brand.setId(1);
        brand.setCustomerId(customerId);
        brand.setName("FIAT");
        brand.setUpdatedAt(LocalDateTime.now());

        brand = this.brandService.delete(brand);

        assertEquals(1, brand.getId());
    }

    private Brand mountInsertedBrand(final Brand brand) {
        brand.setId(1);
        return brand;
    }

}
